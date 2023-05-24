package br.com.ifsp.helloworld;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class OlaMundoController {

	List<OlaMundo> olaMundo = new ArrayList<>();
	
	public OlaMundoController() {
		olaMundo.addAll(List.of(new OlaMundo("ola, mundo!"),
				new OlaMundo("ola, mundo!")));
	}

	@GetMapping
	Iterable<OlaMundo> getOlaMundo() {
		return olaMundo;
	}
	
}
