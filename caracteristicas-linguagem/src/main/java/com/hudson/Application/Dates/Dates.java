package com.hudson.Application.Dates;

import java.util.Date;

public class Dates {
    public static void main (String[] args){

        long currentTimeMillis = System.currentTimeMillis();
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}
