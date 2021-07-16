package com.backend.clientesapp.models.services;

import com.backend.clientesapp.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();
}
