package io.hbdev.mscartao.application;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hbdev.mscartao.domain.Cartao;
import io.hbdev.mscartao.domain.ClienteCartao;
import io.hbdev.mscartao.infra.respository.CartaoRepository;

@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository repository;
	
	@Transactional
	public Cartao save(Cartao cartao) {
		return repository.save(cartao);
	}
	
	//LISTA O CARTAO COM  RENDA MENOR OU = RENDA DO CLIENTE 
		public List<Cartao> getCartaoRendaMenorIgual(Long renda) { 
			//-> RECEBE UM VALOR INTEIRO Long renda E TRANSFORMA EM BIGDECIMAL BigDecimal.valueOf(renda) = rendaBigDecimal
			var rendaBigDecimal = BigDecimal.valueOf(renda);
			return repository.findByRendaLessThanEqual(rendaBigDecimal);
		}

		
}
