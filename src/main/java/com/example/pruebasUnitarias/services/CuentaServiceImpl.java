package com.example.pruebasUnitarias.services;

import com.example.pruebasUnitarias.models.Banco;
import com.example.pruebasUnitarias.models.Cuenta;
import com.example.pruebasUnitarias.repository.BancoRepository;
import com.example.pruebasUnitarias.repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
@Service
public class CuentaServiceImpl implements CuentaService{


    private final CuentaRepository cuentaRepository;

    private final BancoRepository bancoRepository;

    public CuentaServiceImpl(CuentaRepository cuentaRepository, BancoRepository bancoRepository) {
        this.cuentaRepository = cuentaRepository;
        this.bancoRepository = bancoRepository;
    }

    @Override
    public Optional<Cuenta> findById(Long id) {
        return this.cuentaRepository.findById(id);
    }

    @Override
    public BigDecimal revisarTransferencia(Long id) {
        Banco banco= this.bancoRepository.findById(id);

        return banco.getTotalTransferencia();
    }

    @Override
    public BigDecimal revisarSaldo(Long id) {
        Cuenta cuenta = this.cuentaRepository.findById(id).get();
        return cuenta.getSaldo();
    }

    @Override
    public void transferencia(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long BancoId) {
        Cuenta cuentaOrigen = this.cuentaRepository.findById(numCuentaOrigen).get();
        cuentaOrigen.setSaldo(monto);

        Cuenta cuantaDestino = this.cuentaRepository.findById(numCuentaDestino).get();
        cuantaDestino.setSaldo(monto);

        Banco banco = this.bancoRepository.findById(BancoId);
        BigDecimal totalTransfe = banco.getTotalTransferencia();
        totalTransfe.add(BigDecimal.ONE);
        banco.setTotalTransferencia(totalTransfe);
    }
}
