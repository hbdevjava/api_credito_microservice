package io.hbdev.mscartao.application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.hbdev.mscartao.application.representation.CartaoPorClienteResponse;
import io.hbdev.mscartao.application.representation.CartaoSaveRequest;
import io.hbdev.mscartao.domain.Cartao;
import io.hbdev.mscartao.domain.ClienteCartao;

@RestController
@RequestMapping("/api/cartoes")
public class CartoesController {

	@Autowired
	private CartaoService cartaoService;

	@Autowired
	private ClienteCartaoService clienteCartaoService;
	
	
	@GetMapping
	public String status() {
		return "Hebert Brito";
	}

	@PostMapping
	public ResponseEntity catastra(@RequestBody CartaoSaveRequest request) {
		Cartao cartao = request.toModel();
		cartaoService.save(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	// -> LISTA DE CARTOES CORRESPONDENTE COM A RENDA DO CLIENTE
	// -> (EX: RENDA ATE 5K ELE VAI LISTAR CARTOES COM RENDA ATE 5K)
	@GetMapping(params = "renda")
	public ResponseEntity<List<Cartao>> getCartoesRendaAteh(@RequestParam("renda") Long renda) {
		List<Cartao> list = cartaoService.getCartaoRendaMenorIgual(renda);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(params = "cpf")
	public ResponseEntity<List<CartaoPorClienteResponse>> getCartoesByCliente(@RequestParam("cpf")  String cpf){
		List<ClienteCartao> lista = clienteCartaoService.listCartoesByCpf(cpf);
		List<CartaoPorClienteResponse> resultList = lista.stream()
				.map(CartaoPorClienteResponse::fromModel)
				.collect(Collectors.toList());
		
		return ResponseEntity.ok(resultList);
	}

}
