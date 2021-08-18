package com.hudson.Application.faces;

public class Program {

    public static void main(String[] Args) {

        final Celta celtinha = new Celta();
        System.out.println(celtinha.name());
        System.out.println(celtinha.marca());
        celtinha.ligar();
        System.out.println("Hello");
    }
}