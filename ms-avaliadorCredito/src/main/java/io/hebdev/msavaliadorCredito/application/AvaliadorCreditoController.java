package io.hebdev.msavaliadorCredito.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/avaliacoes-credito")
public class AvaliadorCreditoController {
	
	@GetMapping
	public String status() {
		return "Dora";
	}
}
