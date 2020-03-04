package com.company.sistemaRestaurante.DTO;

import java.util.List;

public class ContaDTO {

	private String ClienteCpf;
	private double Total;
	private List<PedidoDTO> produtos;
	
	public ContaDTO(){
		
	}

	public String getClienteCpf() {
		return ClienteCpf;
	}

	public void setClienteCpf(String clienteCpf) {
		ClienteCpf = clienteCpf;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public List<PedidoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<PedidoDTO> produtos) {
		this.produtos = produtos;
	}
	
	//Soma de cada valor de pedido é o Total
}
