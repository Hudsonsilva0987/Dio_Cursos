package com.hudson.Application.strings;


import java.util.Objects;

public class Strings {

    public static void main (String[] args){

        final var nome = "hudson";
        final var sobrenome = "silva";
        final var nomeCompleto = nome + " " + sobrenome;

        System.out.println(nomeCompleto);

        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("P"));
        System.out.println(nome.contains("n"));
        System.out.println(Objects.equals(nome, "joao"));
        System.out.println(nome.equalsIgnoreCase("hUdSon"));
        System.out.println(nome.replace("n", "x"));
        System.out.println(nome.substring(1, 4));
    }
}
