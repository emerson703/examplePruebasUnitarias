package com.example.pruebasUnitarias.models;

import java.math.BigDecimal;

public class Banco {
    private Long id;
    private String nombre;
    private BigDecimal TotalTransferencia;

    public Banco(){}

    public Banco(Long id, String nombre, BigDecimal totalTransferencia) {
        this.id = id;
        this.nombre = nombre;
        TotalTransferencia = totalTransferencia;
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

    public BigDecimal getTotalTransferencia() {
        return TotalTransferencia;
    }

    public void setTotalTransferencia(BigDecimal totalTransferencia) {
        TotalTransferencia = totalTransferencia;
    }
}
