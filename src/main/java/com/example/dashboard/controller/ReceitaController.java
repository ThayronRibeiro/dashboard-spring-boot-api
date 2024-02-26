package com.example.dashboard.controller;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dashboard.model.Client;
import com.example.dashboard.model.Receitas;
import com.example.dashboard.model.User;
import com.example.dashboard.model.repository.ClientRepository;
import com.example.dashboard.model.repository.ReceitaRepository;
import com.example.dashboard.model.repository.UserRepository;
import com.example.dashboard.rest.ReceitaFormRequest;

@RestController
@RequestMapping(value = "/api/receitas")
@CrossOrigin("*")
public class ReceitaController {
	
	@Autowired
	private ReceitaRepository repository;
	@Autowired
	private UserRepository repositoryUser;
	@Autowired
	private ClientRepository repositoryCliente;
	
	@PostMapping("{acessoToken}/{idCliente}")
	public ReceitaFormRequest cadastrar(@PathVariable String acessoToken, @PathVariable Long idCliente, @RequestBody ReceitaFormRequest receita) {
		User userPost = repositoryUser.selectUserPost(acessoToken);	
		Client clientePost = repositoryCliente.FindClienteById(idCliente);
		Receitas entidadeReceita = receita.toModel();
		entidadeReceita.setUser(userPost);
		entidadeReceita.setCliente(clientePost);
		entidadeReceita.setDataAlteracao(LocalDate.now());
		repository.save(entidadeReceita);
		return ReceitaFormRequest.fromModel(entidadeReceita);
		
	}

}
