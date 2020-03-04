package com.company.sistemaRestaurante.service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.sistemaRestaurante.DTO.ClientDTO;

@Repository
public class ClientRepository {

	public ClientDTO save(ClientDTO client) {
		
		return client;
		
	}
	
	public List<ClientDTO> listarClients(){
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		
		ClientDTO client1 = new ClientDTO();
		client1.setCpf("102321321321-1");
		client1.setEmail("murilo@email.com");
		client1.setNome("Murilo Alves");
		client1.setTelefone("11 2255-8888");

		clientList.add(client1);
		
		ClientDTO client2 = new ClientDTO();
		client2.setCpf("102321321321-2");
		client2.setEmail("murilo@email.com2");
		client2.setNome("Murilo Alves2");
		client2.setTelefone("11 2255-88882");
		clientList.add(client2);
		
		return clientList;
	}
	
	public ClientDTO updateClient(ClientDTO client) {
		

		return client;
	}

}
