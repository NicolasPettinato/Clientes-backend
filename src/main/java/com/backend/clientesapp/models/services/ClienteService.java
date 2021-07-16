package com.backend.clientesapp.models.services;

import com.backend.clientesapp.models.dao.IClienteDao;
import com.backend.clientesapp.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteDao clienteDao;

    @Override
    //@Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Override
    //@Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    //@Transactional
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    //@Transactional
    public void delete(Long id) {
        clienteDao.deleteById(id);
    }
}
