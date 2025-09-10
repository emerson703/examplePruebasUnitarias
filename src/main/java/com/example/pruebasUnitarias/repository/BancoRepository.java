package com.example.pruebasUnitarias.repository;

import com.example.pruebasUnitarias.models.Banco;

import java.util.List;

public interface BancoRepository {
    List<Banco> findAll();
    Banco findById(Long id);
    void update(Banco banco);
}
