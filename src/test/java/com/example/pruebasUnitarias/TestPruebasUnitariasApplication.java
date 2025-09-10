package com.example.pruebasUnitarias;

import org.springframework.boot.SpringApplication;

public class TestPruebasUnitariasApplication {

	public static void main(String[] args) {
		SpringApplication.from(PruebasUnitariasApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
