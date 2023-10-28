package com.example.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dashboard.model.Client;
import com.example.dashboard.model.User;
import com.example.dashboard.model.repository.ClientRepository;
import com.example.dashboard.model.repository.UserRepository;
import com.example.dashboard.rest.users.ClientFormRequest;
import com.example.dashboard.service.exceptions.ClienteNaoEncontradoException;
import com.example.dashboard.service.exceptions.ForbiddenException;
import com.example.dashboard.service.exceptions.RecordNotFoundException;

@RestController
@RequestMapping(value = "/api/clients")
@CrossOrigin("*")
public class ClientController {
	
	@Autowired
	private ClientRepository repository;
	@Autowired
	private UserRepository repositoryUser;
	
	
	//Inclusão de um novo cliente setando o usuario_id de quem o cadastrou
	@PostMapping("{acessoToken}")
	public ClientFormRequest salvar(@PathVariable String acessoToken, @RequestBody ClientFormRequest client) throws ForbiddenException{
		User userPost = repositoryUser.selectUserPost(acessoToken);	
		System.out.println(userPost);
		Client entidadeClient = client.toModel();
		entidadeClient.setUser(userPost);
		repository.save(entidadeClient);
		return ClientFormRequest.fromModel(entidadeClient);
	}
	
	//Listagem geral pelo ID do usuário que cadastrou
	@GetMapping("{id}")
	public List<Client> getAllClientesPorUser(@PathVariable Long id) throws RecordNotFoundException {
		Optional<User> usuarioLogado = repositoryUser.findById(id);
		
		if(usuarioLogado.isEmpty()) {
			throw new RecordNotFoundException("Usuário não encontrado");
		}
		
		List<Client> allClientesPorUser = repository.getAllClientesPorUser(id);
		
		return allClientesPorUser;
	}
	
	
	//Listagem das informações do cliente
	@GetMapping("/id/{id}")
	public Client listarInfos(@PathVariable Long id) throws RecordNotFoundException {
		Optional<Client> clienteExistente = repository.findById(id);
		
		if(clienteExistente.isEmpty()) {
			throw new RecordNotFoundException("Cliente não encontrado");
		}
		
		return clienteExistente.get();
	}
	
	//Deletar cliente
	@DeleteMapping("id/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) throws ClienteNaoEncontradoException{
		Optional<Client> clienteEncontrado = repository.selectClienteById(id);
		if(clienteEncontrado.isPresent()) {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		throw new ClienteNaoEncontradoException("Cliente não encontrado!");
					
	}
	
}
