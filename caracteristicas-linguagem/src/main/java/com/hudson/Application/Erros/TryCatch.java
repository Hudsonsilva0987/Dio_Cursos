package com.hudson.Application.Erros;


import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) throws IOException {
        try {

            String[] carro = new String[4];
            carro[4] = "Celta";
        }catch (Exception exception){
            System.out.println("Erro, posição do vetor invalida ");
        }
        System.out.println("");
        }

        }

