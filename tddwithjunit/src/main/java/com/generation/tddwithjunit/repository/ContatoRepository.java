package com.generation.tddwithjunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.tddwithjunit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long>{

}
