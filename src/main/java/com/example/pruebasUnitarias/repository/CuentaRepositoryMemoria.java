package com.example.pruebasUnitarias.repository;

import com.example.pruebasUnitarias.models.Cuenta;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class CuentaRepositoryMemoria implements CuentaRepository {
    private final Map<Long,Cuenta> cuentaMap = new HashMap<>();
    public CuentaRepositoryMemoria(){
        cuentaMap.put(1L, new Cuenta(1L, "Pedro", new BigDecimal(100)));
        cuentaMap.put(2L, new Cuenta(2L, "Pedro", new BigDecimal(500)));
    }

    @Override
    public List<Cuenta> findAll() {
        return new ArrayList<>(cuentaMap.values());
    }

    @Override
    public Optional<Cuenta> findById(Long id) {
        return Optional.ofNullable(cuentaMap.get(id));
    }

    @Override
    public void update(Cuenta cuenta) {
        cuentaMap.put(cuenta.getId(),cuenta);
    }
}
