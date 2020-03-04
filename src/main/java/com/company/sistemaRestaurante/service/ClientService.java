package com.company.sistemaRestaurante.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.sistemaRestaurante.DTO.ClientDTO;

@Service
public interface ClientService {

	List<ClientDTO> listarClientes();

	boolean add(ClientDTO client);

}
