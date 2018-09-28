package org.mocr.reactive.web.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ReactiveController {  
	
	@GetMapping(path = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE) 
	public Flux<String> get() {	 
		var message = "Hello from reactive controller";
		return  Flux.just(message);
	}

	@GetMapping(path = "/map", produces = MediaType.APPLICATION_JSON_VALUE)
	public Flux<Map<Integer, String>> getMap() {
		return  Flux.just(Map.of(1,"one", 2, "two"));
	}
}
