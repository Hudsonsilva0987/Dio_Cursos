package com.hudson.Application.Dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalData {
    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();
       // System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        LocalDate ontem = hoje.minusDays(1);
        //System.out.println(hoje.getDayOfMonth());
        System.out.println(hoje);
        System.out.println(ontem);

    }
}
