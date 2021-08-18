package com.hudson.Application.abstracts;


    public abstract class FormaGeometrica{

        public abstract double area();
        public abstract String name();

        public String desenha(int x, int y){
            return "Desenhado nas cordenadas x :" + x + " y :" + y;
        }
    }
