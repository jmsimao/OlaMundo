package br.com.ifsp.OlaMundo.Controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifsp.OlaMundo.Model.OlaMundo;

@RestController
@RequestMapping("/OlaMundo")
public class OlaMundoController {

	List<OlaMundo> olaMundo = new ArrayList<>();
	
	public OlaMundoController() {
		olaMundo.addAll(List.of(new OlaMundo("Olá, mundo!"),
				new OlaMundo("Hello, world!"),
				new OlaMundo("Com Boot Spring e RestAPI ..."),
				new OlaMundo("... nos primeiros passos!")
				));
	}

	@GetMapping
	Iterable<OlaMundo> getOlaMundo() {
		return this.olaMundo;
	}
	
}
