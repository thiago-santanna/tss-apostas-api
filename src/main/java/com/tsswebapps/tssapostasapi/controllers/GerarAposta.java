package com.tsswebapps.tssapostasapi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tsswebapps.tssapostasapi.model.Aposta;
import com.tsswebapps.tssapostasapi.service.GerarApostaService;


@Controller
@RequestMapping(value = "/gerar-apostas")
public class GerarAposta {
	
	@Autowired
	private GerarApostaService gegarAposta;
	
	@GetMapping()
	public ResponseEntity<List<Aposta> > apostas(){
		List<Aposta> apostas = gegarAposta.execute(7);
		return ResponseEntity.ok(apostas);
	}
}
