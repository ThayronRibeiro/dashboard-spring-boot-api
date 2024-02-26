package com.example.dashboard.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dashboard.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
		
	@Query(value = "select * from cliente where usuario_id = :usuario_id order by id", nativeQuery = true)
	List<Client> getAllClientesPorUser(Long usuario_id);
	
	@Query(value = "select * from cliente where id = :cliente_id", nativeQuery = true)
	Optional<Client> selectClienteById(Long cliente_id);
	
	@Query(value = "select * from cliente where id = :cliente_id", nativeQuery = true)
	Client FindClienteById(Long cliente_id);

}
