package com.example.pruebasUnitarias.controller;

import com.example.pruebasUnitarias.models.Cuenta;
import com.example.pruebasUnitarias.services.CuentaService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.http.MediaType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

public class CuentaControllerTest {
    private MockMvc mockmvc;
    @InjectMocks
    private CuentaController cuentaController;

    @Mock
    private CuentaService cuentaService;

    @BeforeEach
    void setup(){
        mockmvc = MockMvcBuilders.standaloneSetup(cuentaController).build();
    }
    @Test
    void obtenerCuentaPorId_CuentaExiste_Retorna200() throws Exception{
        Long id=1L;
        Cuenta cuenta = new Cuenta();
        cuenta.setId(id);
        cuenta.setSaldo(new BigDecimal("20"));

        when(cuentaService.findById(id)).thenReturn(Optional.of(cuenta));

        mockmvc.perform(MockMvcRequestBuilders.get("/api/v1/cuentas/{id}",id)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(id))
                .andExpect(jsonPath("$.saldo").value(200));
    }
}
