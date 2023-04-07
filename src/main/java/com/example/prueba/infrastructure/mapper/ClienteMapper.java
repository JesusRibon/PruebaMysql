package com.example.prueba.infrastructure.mapper;

import com.example.prueba.domain.entities.Cliente;
import com.example.prueba.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteDto toClienteDto(Cliente cliente);

    Cliente toClienteEntity(ClienteDto clienteDto);
}
