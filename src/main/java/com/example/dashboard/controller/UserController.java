package com.example.dashboard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dashboard.model.User;
import com.example.dashboard.model.repository.UserRepository;

import com.example.dashboard.rest.users.UserFormRequest;
import com.example.dashboard.service.exceptions.ForbiddenException;
import com.example.dashboard.service.exceptions.RecordNotFoundException;

@RestController
@RequestMapping(value = "/api/users")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserRepository repository;

	//Incluir novo usuário no sistema
	@PostMapping
	public UserFormRequest salvar(@RequestBody UserFormRequest user) throws ForbiddenException {
		User entidadeUsers = user.toModel();
		User usuarioExistente = repository.findByUsuario(entidadeUsers.getUsuario());
		if (usuarioExistente == null) {
			repository.save(entidadeUsers);
			return UserFormRequest.fromModel(entidadeUsers);
		} else {
			System.out.println("Usuário já existe!");
			throw new ForbiddenException("Usuário já existe!");
		}
	}

	//Salvar alterações do usuário
	@PutMapping("{acesso_token}")
	public ResponseEntity<Void> atualizar(@PathVariable String acesso_token, @RequestBody UserFormRequest user) {
		User userExist = repository.selectUserPost(acesso_token);
		if (userExist == null) {
			return ResponseEntity.notFound().build();
		}
		User entidadeUsers = user.toModel();
		entidadeUsers.setDataCadastro(userExist.getDataCadastro());
		repository.save(entidadeUsers);

		return ResponseEntity.ok().build();
	}
	
	//Get usado para o login do usuário no sistema
	@GetMapping("login/{usuario}/{senha}")
	public ResponseEntity<User> logar(@PathVariable String usuario, @PathVariable String senha)
			throws RecordNotFoundException {
		Optional<User> userLogin = Optional.of(repository.findByUsuarioAndSenha(usuario, senha));
		if (userLogin.isPresent()) {
			System.out.println("Usuário e senha corretas. Usuário logado");
			return new ResponseEntity<>(userLogin.get(), HttpStatus.OK);
		} else {
			throw new RecordNotFoundException("Usuário inexistente!");
		}

	}

	//Get de listagem de todos os usuários
	@GetMapping
	public List<User> getAllUsers() throws RecordNotFoundException {
		List<User> usersExists = repository.findAllUsers();

		if (usersExists.isEmpty()) {
			System.out.println("Não há usuários cadastrados!");
			throw new RecordNotFoundException("Não há usuários cadastrados!");
		} else {
			return usersExists;
		}

	}
	
	@GetMapping("{acesso_token}")
	public User getInfoUser(@PathVariable String acesso_token) throws RecordNotFoundException{
		Optional<User> selectUser = Optional.of(repository.selectUserPost(acesso_token));
		if(selectUser.isEmpty()) {
			throw new RecordNotFoundException("Usuário não encontrado!");
		}
		return selectUser.get();
	}

}
