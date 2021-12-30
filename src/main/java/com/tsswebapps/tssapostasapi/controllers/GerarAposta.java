package com.tsswebapps.tssapostasapi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsswebapps.tssapostasapi.model.Aposta;
import com.tsswebapps.tssapostasapi.service.GerarApostaService;


@Controller
@RequestMapping()
public class GerarAposta {
	
	@Autowired
	private GerarApostaService gegarAposta;
	
	@GetMapping(value = "/gerar-apostas/{quantidade}")
	public ResponseEntity<List<Aposta> > apostas(@PathVariable int quantidade){
		List<Aposta> apostas = gegarAposta.execute(quantidade);
		return ResponseEntity.ok(apostas);
	}
}
