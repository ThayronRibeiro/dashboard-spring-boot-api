package com.example.dashboard.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dashboard.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsuarioAndSenha(String usuario, String senha);

	@Query(value = "select * from usuario where usuario = :usuario ", nativeQuery = true)
	User findByUsuario(String usuario);
	
	@Query(value = "select * from usuario order by id", nativeQuery = true)
	List<User> findAllUsers();
	
	@Query(value = "select * from usuario where acesso_token = :acessoToken ", nativeQuery = true)
	User selectUserPost(String acessoToken);
	
}
