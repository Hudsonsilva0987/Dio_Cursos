package com.hudson.Application.enums;

public enum Status {
    OPEN(13, "aberto"),
    CLOSE(2, "fechado");

    private String text;
    private int cod;

    Status (final int cod, final String text){
        this.cod = cod;
        this.text = text;
    }
    public int getCod() {return cod; }
    public String getText() { return text;}
}
