package io.hbdev.mscartao.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hbdev.mscartao.domain.ClienteCartao;
import io.hbdev.mscartao.infra.respository.ClienteCartaoRepository;

@Service
public class ClienteCartaoService {
	
	@Autowired
	private ClienteCartaoRepository repository;
	
	List<ClienteCartao> listCartoesByCpf(String cpf){
		return repository.findByCpf(cpf);
	}

}
