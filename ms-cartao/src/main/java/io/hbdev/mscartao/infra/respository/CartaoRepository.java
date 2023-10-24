package io.hbdev.mscartao.infra.respository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hbdev.mscartao.domain.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {

	List<Cartao> findByRendaLessThanEqual(BigDecimal rendaBigDecimal);

}
