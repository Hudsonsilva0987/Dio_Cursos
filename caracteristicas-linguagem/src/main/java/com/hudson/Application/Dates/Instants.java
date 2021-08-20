package com.hudson.Application.Dates;

import java.time.Instant;
import java.util.Date;

public class Instants {
    public static void main(String[] args){

        Date data = new Date(94151575111111L);
        System.out.println(data);
        Instant instant = data.toInstant();
        System.out.println(instant);
    }
}
