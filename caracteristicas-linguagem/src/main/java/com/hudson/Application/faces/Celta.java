package com.hudson.Application.faces;

public class Celta implements Carro, Veiculo{


    @Override
    public String name() {
        return "celta";
    }
    @Override
    public String marca(){
        return "wolgksvagem";
    }

    @Override
    public void ligar(){
         Carro.super.ligar();
         Veiculo.super.ligar();
    }
}
