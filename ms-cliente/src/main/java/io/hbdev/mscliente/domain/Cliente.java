package io.hbdev.mscliente.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor//-> GERA UM CONSTRUTOR SEM ARGUMENTOS
//-> É MUITO IMPORTANTE TER UMA CONSTRUTOR SEM ARGUMENTOS NAS ENTIDADES JPA, QUANDO FOR FEITA A PESQUISA NO BANCO E O JPA NAO
//-> ENCONTRAR O CONSTRUTOR COM ARGUMENTOS O JPA USA O SEM ARGUMENTOS CASO ELE TB NAO ENCONTRE DA ERRO. 
public class Cliente {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String cpf;
	@Column
	private String nome;
	@Column
	private Integer idade;

	public Cliente(String cpf, String nome, Integer idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	
}
