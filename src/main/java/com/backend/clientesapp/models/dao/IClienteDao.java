package com.backend.clientesapp.models.dao;

import com.backend.clientesapp.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente,Long> {
}
