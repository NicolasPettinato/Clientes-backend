package com.backend.clientesapp.controllers;

import com.backend.clientesapp.models.entity.Cliente;
import com.backend.clientesapp.models.services.ClienteService;
import com.backend.clientesapp.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
         return clienteService.findAll();
    }
}
