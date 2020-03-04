package com.company.sistemaRestaurante.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.sistemaRestaurante.DTO.ClientDTO;
import com.company.sistemaRestaurante.service.ClientService;
import com.company.sistemaRestaurante.service.repository.ClientRepository;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	private List<ClientDTO> listarClients;


	public List<ClientDTO> listarClientes() {
		
		 listarClients = clientRepository.listarClients();
		 listarClients.forEach(s -> s.getCpf().equalsIgnoreCase("10101010"));
		 return listarClients;
	}

	
	public boolean add(ClientDTO client) {
		
		if(client != null) {
			
			clientRepository.save(client);
			
			return true;
		}
		
		return false;
	}

}
