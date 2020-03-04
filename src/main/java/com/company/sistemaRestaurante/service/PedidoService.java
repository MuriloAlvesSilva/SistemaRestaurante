package com.company.sistemaRestaurante.service;

import org.springframework.stereotype.Service;

import com.company.sistemaRestaurante.DTO.ClientDTO;
import com.company.sistemaRestaurante.DTO.PedidoDTO;

@Service
public interface PedidoService {
	
	
	public PedidoDTO adicionar(PedidoDTO pedido);
	

}
