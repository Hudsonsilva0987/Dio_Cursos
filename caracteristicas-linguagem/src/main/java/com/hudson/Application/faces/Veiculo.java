package com.hudson.Application.faces;

public interface Veiculo {
    String marca();

    default void ligar(){
        System.out.println( "Ligando veiculo");
    }
}
