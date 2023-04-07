package com.example.prueba.infrastructure.api.controller;

import com.example.prueba.application.ClienteSave;
import com.example.prueba.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private final ClienteSave clienteSave;

    @PostMapping(value = "/clientes")
    public  ResponseEntity<Cliente>saveCliente(@RequestBody Cliente cliente){
        return new   ResponseEntity<>(clienteSave.saveCliente(cliente) , HttpStatus.CREATED);
    }
}
