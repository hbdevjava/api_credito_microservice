package io.hebdev.msavaliadorCredito.domain.model;



import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class SituacaoCliente {
	
	private DadosCliente cliente;
	private List<CartaoCliente> cartoes;
}
