package com.company.sistemaRestaurante.DTO;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;


public class ClientDTO {

	@Autowired
    private MessageSource messageSource;
	
	private String nome; 
	private String cpf;
	private String email;
	private String telefone;
	
	private ContaDTO conta;
	
	public ClientDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email = messageSource.getMessage("default.returnDTO", 
                null, Locale.ENGLISH);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ContaDTO getConta() {
		return conta;
	}

	public void setConta(ContaDTO conta) {
		this.conta = conta;
	}
	
}
