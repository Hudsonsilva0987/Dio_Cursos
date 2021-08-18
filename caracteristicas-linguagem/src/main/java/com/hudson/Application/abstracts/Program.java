package com.hudson.Application.abstracts;


    public class Program {

        public static void main(String[] args){

            final FormaGeometrica quadrado = new Quadrado("quadrado", 13.0);

            System.out.println(quadrado.desenha(12, 14));
            System.out.println(quadrado.name());
            System.out.println(quadrado.area());

        }
    }

