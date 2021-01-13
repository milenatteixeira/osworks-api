package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente(1L, "milena teixeira", "milena@gmail.com", "12345");
		var cliente2 = new Cliente(2L, "stephane", "stephane@gmail.com", "12345");
		return Arrays.asList(cliente1, cliente2);
	}
}
