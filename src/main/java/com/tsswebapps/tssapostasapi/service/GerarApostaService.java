package com.tsswebapps.tssapostasapi.service;

import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tsswebapps.tssapostasapi.model.Aposta;
import com.tsswebapps.tssapostasapi.model.Megasena;

@Service
public class GerarApostaService {

	public List<Aposta> execute(int quantidadeDeApostas){
	
		List<Aposta> apostas = new ArrayList<>();
		
        for (int i = 0; i < quantidadeDeApostas; i++) {
        	//Na segunda ver. fazer inversao de dependencia no tipo do jogo
            Aposta apostaMegasena = new Megasena(6,60);
            apostaMegasena.setDataAposta(Date.from(Instant.now()));
            
            List<Integer> dezenasGeradas = geradorDezenas(apostaMegasena.getMaxDezenas(), apostaMegasena.getMaxRangeApostas());
            apostaMegasena.setDezenas(dezenasGeradas);
            
            apostas.add(apostaMegasena);
        }
		
		return apostas;
	}
	
	private List<Integer> geradorDezenas(Integer maxDezenas, Integer maxRangeDezenas) {
		List<Integer> jogo = new ArrayList<>();

		for (int i = 0; i < maxDezenas; i++) {
			double dezenaAleatoria = Math.random() * maxRangeDezenas;
			jogo.add((int) Math.round(dezenaAleatoria));
		}

		return jogo;
	}

}
