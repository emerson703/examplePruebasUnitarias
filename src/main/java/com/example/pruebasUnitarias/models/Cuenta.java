package com.example.pruebasUnitarias.models;

import java.math.BigDecimal;

public class Cuenta {
    private Long id;
    private String nombre;
    private BigDecimal saldo;

    public Cuenta() {
    }

    public Cuenta(Long id, String nombre, BigDecimal saldo) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
