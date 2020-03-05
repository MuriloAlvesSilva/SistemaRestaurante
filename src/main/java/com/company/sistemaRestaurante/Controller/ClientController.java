package com.company.sistemaRestaurante.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sistemaRestaurante.DTO.ClientDTO;
import com.company.sistemaRestaurante.DTO.ContaDTO;
import com.company.sistemaRestaurante.service.ClientService;

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
	public String test() throws IllegalAccessException {
		ClientDTO clientDTO = new ClientDTO();
//		clientDTO.setConta(new ContaDTO());
//		clientDTO.setCpf("111");
//		clientDTO.setEmail("@#mail");
//		clientDTO.setNome("Murilo");
//		clientDTO.setTelefone("1011445");

		clientDTO.setConta(new ContaDTO());
		clientDTO.setCpf("a");
		clientDTO.setEmail("b");
		clientDTO.setNome("c");
		clientDTO.setTelefone("d");
		
//		if(isNull(clientDTO)) {
//			clientDTO.setCpf("10");
//		}
		
		boolean checkEmpty = clientDTO.checkIsEmpty();
		
		boolean checkNull  = clientDTO.checkNull();
		
		return clientDTO.getCpf() + " " + messageSource.getMessage("default.returnDTO", 
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
