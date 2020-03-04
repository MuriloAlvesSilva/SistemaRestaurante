package com.company.sistemaRestaurante.DTO;

public class PedidoDTO {

	private String tipo;
	private double valor;
	private String produto;
	//private ClientDTO client;
	
	public PedidoDTO(){
		
	}
	
	
	
	public PedidoDTO(String tipo, double valor, String produto, ClientDTO client) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.produto = produto;
		//this.client = client;
	}



	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}

//	public ClientDTO getClient() {
//		return client;
//	}
//
//	public void setClient(ClientDTO client) {
//		this.client = client;
//	}
	
	
}
