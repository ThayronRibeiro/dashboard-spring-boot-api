package com.example.dashboard.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dashboard.model.Receitas;

public interface ReceitaRepository extends JpaRepository<Receitas, Long>{

}
