package com.example.pruebasUnitarias.service;

import com.example.pruebasUnitarias.models.Cuenta;
import com.example.pruebasUnitarias.repository.BancoRepository;
import com.example.pruebasUnitarias.repository.CuentaRepository;
import com.example.pruebasUnitarias.services.CuentaServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class CuentaServiceTest {
    @Test
    void testRevisarSaldo(){
        CuentaRepository cuentaRepository = mock(CuentaRepository.class);
        BancoRepository bancoRepository = mock(BancoRepository.class);

        when(cuentaRepository.findById(20L)).thenReturn(Optional.of(new Cuenta(20L,"carmen", new BigDecimal(232))));

        CuentaServiceImpl service = new CuentaServiceImpl(cuentaRepository, bancoRepository);
        BigDecimal saldo = service.revisarSaldo(20L);

        Assertions.assertEquals("232", saldo.toString());
        verify(cuentaRepository).findById(20L);
    }


}
