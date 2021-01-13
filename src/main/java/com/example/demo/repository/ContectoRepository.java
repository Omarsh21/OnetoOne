package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contacto;

@Repository
public interface ContectoRepository extends JpaRepository<Contacto, Integer> {

}
