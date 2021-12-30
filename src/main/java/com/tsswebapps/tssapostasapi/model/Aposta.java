package com.tsswebapps.tssapostasapi.model;

import java.util.Date;
import java.util.List;

public class Aposta {
    private Long id;
    private Date dataAposta;
    private List<Integer> dezenas;

    private final Integer maxDezenas;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Aposta{" +
                "dezenas=" + dezenas +
                '}';
    }
}
