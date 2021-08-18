package com.hudson.Application.faces;

public interface Carro {

    default String name() {
        return null;
    }

    default void ligar() {
            System.out.println("Ligando carro");
    }
}
