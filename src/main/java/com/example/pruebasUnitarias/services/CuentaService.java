package com.example.pruebasUnitarias.services;

import com.example.pruebasUnitarias.models.Cuenta;

import java.math.BigDecimal;
import java.util.Optional;

public interface CuentaService {
    Optional<Cuenta> findById(Long id);

    BigDecimal revisarTransferencia(Long id);

    BigDecimal revisarSaldo(Long id);

    void transferencia(Long numCuentaOrigen,
                       Long numCuentaDestino,
                       BigDecimal monto,
                       Long BancoId);
}
