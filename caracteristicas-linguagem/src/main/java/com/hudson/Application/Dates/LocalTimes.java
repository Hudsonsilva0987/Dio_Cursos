package com.hudson.Application.Dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimes {

    public static void main(String[] args){

        LocalTime hora = LocalTime.now();

        System.out.println(hora);

        LocalTime horaDepois = hora.plusHours(1);
        System.out.println(horaDepois);
        LocalTime horaAntes = hora.minusHours(1);
        System.out.println(horaAntes);
    }
}
