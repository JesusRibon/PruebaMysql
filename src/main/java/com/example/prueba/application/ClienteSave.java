package com.example.prueba.application;

import com.example.prueba.domain.entities.Cliente;
import com.example.prueba.domain.service.ClienteSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ClienteSave {

    @Autowired
    private final ClienteSaveService clienteSaveService;

    public Cliente saveCliente(Cliente cliente){
        return clienteSaveService.save(cliente);
    }
}
