package com.hudson.Application.Dates;

import java.time.LocalDateTime;

public class LocalDateTimes {

    public static void main(String[] args){
        LocalDateTime hora = LocalDateTime.now();

        System.out.println(hora);

        LocalDateTime horaDepois = hora.plusDays(1).plusHours(1).plusMinutes(12).plusSeconds(12);
        System.out.println(horaDepois);
    }
}
