package com.hudson.Application.Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioSimpleFormat {
    public static void main(String[] args){
    Date data = new Date();

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy  h:mm:ss:SSS");
    System.out.println(format.format(data));
    }
}
