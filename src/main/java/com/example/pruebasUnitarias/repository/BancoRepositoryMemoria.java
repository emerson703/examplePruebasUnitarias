package com.example.pruebasUnitarias.repository;

import com.example.pruebasUnitarias.models.Banco;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BancoRepositoryMemoria implements BancoRepository{

    @Override
    public List<Banco> findAll() {
        return List.of();
    }

    @Override
    public Banco findById(Long id) {
        return null;
    }

    @Override
    public void update(Banco banco) {

    }
}
