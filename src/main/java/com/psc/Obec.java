package com.psc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Obec {

    private String psc;
    private String obec;

    public Obec(String psc, String obec) {
        this.psc = psc;
        this.obec = obec;
    }

    @JsonProperty
    public String getPsc() {
        return psc;
    }

    @JsonProperty
    public String getObec() {
        return obec;
    }
}