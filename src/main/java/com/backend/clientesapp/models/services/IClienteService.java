package com.backend.clientesapp.models.services;

import ch.qos.logback.core.net.server.Client;
import com.backend.clientesapp.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void  delete(Long id);


}
