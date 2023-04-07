package com.example.prueba.infrastructure.repository;

import com.example.prueba.infrastructure.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDto , String> {
}
