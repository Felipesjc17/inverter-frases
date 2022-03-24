package com.felipesjc.inverterfrases.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipesjc.inverterfrases.main.Frase;

@RestController
@RequestMapping(value = "/frase")
public class Controller {

	
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody String frase) {
		Frase f = new Frase(frase);
		
		return ResponseEntity.ok().body(f.inverter());
		
	}
	
			
}
