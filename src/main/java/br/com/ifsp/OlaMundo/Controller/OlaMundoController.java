package br.com.ifsp.OlaMundo.Controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD

import br.com.ifsp.OlaMundo.Model.OlaMundo;

@RestController
@RequestMapping
=======
import br.com.ifsp.OlaMundo.Model.*;

@RestController
@RequestMapping("/OlaMundo")
>>>>>>> 84cdfbf0cc2d3e95deee989eb3af81f20c88b9d8
public class OlaMundoController {

	List<OlaMundo> olaMundo = new ArrayList<>();
	
	public OlaMundoController() {
<<<<<<< HEAD
		olaMundo.addAll(List.of(new OlaMundo("Olá, mundo!"),
				new OlaMundo("Hello, world!"),
				new OlaMundo("Com Boot Spring com RestAPI ..."),
				new OlaMundo("... nos primeiros passos!")
				));
	}

	@GetMapping("olamundo") 
	String getOlaMundo() {
		return "<h1>"
				+ "<font color=blue>Olá, mundo!</font>"
				+ "</h1>";
	}
	
	@GetMapping("/restapi")
	Iterable<OlaMundo> getOlaMundoRestAPI() {
=======
		olaMundo.addAll(List.of(new OlaMundo("ola, mundo!"),
				new OlaMundo("ola, mundo!")));
	}

	@GetMapping
	Iterable<OlaMundo> getOlaMundo() {
>>>>>>> 84cdfbf0cc2d3e95deee989eb3af81f20c88b9d8
		return olaMundo;
	}
	
}
