package io.hbdev.mscliente.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	
	@GetMapping
	private String Status() {
		return "Hebert Brito";
	}
}
