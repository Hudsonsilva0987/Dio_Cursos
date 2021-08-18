package com.hudson.Application.abstracts;


public class Quadrado extends FormaGeometrica {

    public String name;
    public double area;

    public Quadrado(final String name, final Double area){
        this.name = name;
        this.area = area;
    }
    @Override
    public String name(){return name;}

    @Override
    public double area(){return area;}

    @Override
    public String toString(){
        final String builder = "Quadrado [ " + name + " area : " + area + ']';
        return builder.toString();
    }

}