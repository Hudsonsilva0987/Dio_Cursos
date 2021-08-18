package com.hudson.Application.strings;

public class FormatString {

    public static void main(String[] args) {

        final var nome = "hudson";
        final var sobrenome = "silva";
        final var nomeCompleto = nome + " " + sobrenome;
        float numero = 1.2367f;
        final  var recado = String.format(" caro cliente %s , o senhor possui 3 dívidas em seu nome", nomeCompleto);
        System.out.println(recado);

         String n = String.format("numero formatado : %.2f", numero);
         System.out.println(n);
    }
}
