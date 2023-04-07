package com.example.prueba.infrastructure.adapter;

import com.example.prueba.domain.entities.Cliente;
import com.example.prueba.domain.service.ClienteSaveService;
import com.example.prueba.infrastructure.mapper.ClienteMapper;
import com.example.prueba.infrastructure.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteSaveAdapter implements ClienteSaveService {
    @Autowired
    private final ClienteRepository clienteRepository;

    @Autowired
    private final ClienteMapper clienteMapper;
    @Override
    public Cliente save(Cliente cliente) {
        return clienteMapper.toClienteEntity(clienteRepository.save(clienteMapper.toClienteDto(cliente))) ;
    }
}
