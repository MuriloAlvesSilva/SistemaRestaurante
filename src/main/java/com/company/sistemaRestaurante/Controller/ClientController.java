package com.company.sistemaRestaurante.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sistemaRestaurante.DTO.ClientDTO;
import com.company.sistemaRestaurante.DTO.ContaDTO;
import com.company.sistemaRestaurante.service.ClientService;
import com.company.sistemaRestaurante.utils.Messages;

@Controller
@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	public ClientService clientService;

	@Autowired
    private MessageSource messageSource;
	
	@GetMapping()
	public List<ClientDTO> listClient(){
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		
		clientList = clientService.listarClientes();
		
		return clientList;
	}
	
	
	@GetMapping("/test")
	public String test() {
		ClientDTO clientDTO = new ClientDTO();
		//clientDTO.getEmail();
		return messageSource.getMessage("default.returnDTO", 
                null, Locale.US);
		//return messeges.get("default.info");
	}
	
	
	@PostMapping()
	public ClientDTO addClient(@RequestBody ClientDTO client){
		
		boolean valida  = clientService.add(client);
				
		if(valida == true)
			return client;
		
		return null;
	}
	
	public ClientDTO updateClient(@RequestBody ClientDTO client) {
		ClientDTO clientResponse = client;
		
		return clientResponse; 
	}
}
