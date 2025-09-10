package com.example.pruebasUnitarias.controller;

import com.example.pruebasUnitarias.models.Cuenta;
import com.example.pruebasUnitarias.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cuentas")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/{id}")
    public ResponseEntity<Cuenta> obtenerCuenta (@PathVariable Long Id){
        Optional<Cuenta> cuenta = this.cuentaService.findById(Id);
        return cuenta.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
