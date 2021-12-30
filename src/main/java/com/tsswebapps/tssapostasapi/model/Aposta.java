package com.tsswebapps.tssapostasapi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Aposta {
    private Date dataAposta;
    private List<Integer> dezenas = new ArrayList<Integer>();

    @JsonIgnore
    private final Integer maxDezenas;
    @JsonIgnore
    private final Integer maxRangeApostas;

    public Aposta(Integer maxDezenas, Integer maxRangeApostas) {
        this.maxDezenas = maxDezenas;
        this.maxRangeApostas = maxRangeApostas;
    }

    public Integer getMaxDezenas() {
        return maxDezenas;
    }

    public Integer getMaxRangeApostas() {
        return maxRangeApostas;
    }

    public Date getDataAposta() {
        return dataAposta;
    }

    public void setDataAposta(Date dataAposta) {
        this.dataAposta = dataAposta;
    }

    public List<Integer> getDezenas() {
        return List.copyOf(this.dezenas);
    }
    
    public void setDezenas(List<Integer> aposta) {
    	this.dezenas = aposta;
    }

    @Override
    public String toString() {
        return "Aposta{" +
                "dezenas=" + dezenas +
                '}';
    }
}
