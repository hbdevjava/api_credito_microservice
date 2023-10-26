package io.hbdev.mscartao.infra.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.hbdev.mscartao.domain.ClienteCartao;
@Repository
public interface ClienteCartaoRepository extends JpaRepository<ClienteCartao, Long>{
	
	//-> ESSE METODO FAZ UMA BUSCA PELO CPF DENTRO DE UMA LISTA DE List<ClienteCartao>
	List<ClienteCartao> findByCpf(String cpf);

}
