package com.hudson.Application.enums;

public class Program {

    public static void main(String[] args){

        System.out.println(TipoVeiculo.TERRESTRE);

        for(TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }

        System.out.println(Status.OPEN.getCod());
    }
}
