package com.in28minutos.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// #1 REST API
//debemos marcar este controlador como Rest

@RestController
public class HelloWordController {
	
	// #2 dar una URL especifica a la api REST
	// /hello-world este es el path o direccion
	// "Hello World" es lo que queremos hacer en este controlador
	// vamos a crear un metodo publico que va retornar un string
	//al utilizar un RequestMapping estamos utilizando el metodo get
	
	/*@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld(){
		return "Hello World";
	}*/
	
	//una mejor forma de hacer un mapeo es con GetMapping
	//asi como el GetMapping, existe el post, put, delete, etc
	@GetMapping(path = "/hello-world")
	public String helloWorld(){
		return "Hello World";
	}

}
