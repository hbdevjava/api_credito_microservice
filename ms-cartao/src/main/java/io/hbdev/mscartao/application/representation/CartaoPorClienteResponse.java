package io.hbdev.mscartao.application.representation;

import java.math.BigDecimal;

import io.hbdev.mscartao.domain.ClienteCartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartaoPorClienteResponse {
	
	private String nome;
	private String bandeira;
	private BigDecimal limiteLiberado;
	
	public static CartaoPorClienteResponse fromModel(ClienteCartao model) {
		return new CartaoPorClienteResponse(
				model.getCartao().getNome(),
				model.getCartao().getBandeira().toString(),
				model.getLimite()
			);
	}
}
