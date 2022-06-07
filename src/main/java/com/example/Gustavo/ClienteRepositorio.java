package com.example.Gustavo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepositorio extends JpaRepository <Cliente, Long>{
    List<Cliente> findByNome(String nome);
}
