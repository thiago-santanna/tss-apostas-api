package com.tsswebapps.tssapostasapi.service;

import java.util.ArrayList;
import java.util.List;

public class GeradorDezenas {
    public static List<Integer> gerarDezenas(Integer maxDezenas, Integer maxRangeDezenas){
        List<Integer> jogo = new ArrayList<>();

        for (int i = 0; i < maxDezenas; i++) {
            double dezenaAleatoria = Math.random() * maxRangeDezenas;
            jogo.add((int) Math.round(dezenaAleatoria));
        }

        return jogo;
    }
}
