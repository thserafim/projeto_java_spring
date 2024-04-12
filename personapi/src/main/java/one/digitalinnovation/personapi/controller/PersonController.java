package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //CONTROLADOR QUE SERA ACESSADO ATRAVES DE UMA API REST
@RequestMapping("api/v1/people") //CAMINHO DE ACESSO PRINCIPAL DA API

public class PersonController {
	
	@GetMapping // MAPIANDO UM HTTP GET QUE SERA ACESSADO PELO BROWSER
	public String getBook() {
		return "API Test";
	}

}
