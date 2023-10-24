package io.hbdev.mscartao.application;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hbdev.mscartao.application.representation.CartaoSaveRequest;
import io.hbdev.mscartao.domain.Cartao;

@RestController
@RequestMapping("/api/cartoes")
public class CartoesController {
	
	@Autowired
	private CartaoService service;
	
	@GetMapping
	public String status() {
		return "Hebert Brito";
	}
	
	@PostMapping
	public ResponseEntity catastra(@RequestBody CartaoSaveRequest request) {
		Cartao cartao = request.toModel();
		service.save(cartao);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}	
	
	
	
	
}