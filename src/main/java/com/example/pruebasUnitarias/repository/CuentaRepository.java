package com.example.pruebasUnitarias.repository;

import com.example.pruebasUnitarias.models.Cuenta;

import java.util.List;
import java.util.Optional;

public interface CuentaRepository {
    List<Cuenta> findAll();
    Optional<Cuenta> findById(Long id);
    void update (Cuenta cuenta);
}
