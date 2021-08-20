package com.hudson.Application.Dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioLocalDateTime {
    public static void main(String[] args){
        LocalDateTime data = LocalDateTime.of(2010,5,15,10,0,0);
        System.out.println(data);
        LocalDateTime dataAtualizada = data.plusYears(4).plusMonths(6).plusHours(13);


        System.out.println(dataAtualizada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy \n HH:mm:ss")));
    }
}
