package com.company.sistemaRestaurante.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sistemaRestaurante.DTO.PedidoDTO;
import com.company.sistemaRestaurante.service.PedidoService;

@Controller
@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	public PedidoService pedidoService;

	@PostMapping
	public PedidoDTO adicionarPedido(@RequestBody PedidoDTO pedido) {
		pedidoService.adicionar(pedido);
		return pedido; 
	}
}
