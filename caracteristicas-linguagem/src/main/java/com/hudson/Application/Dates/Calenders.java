package com.hudson.Application.Dates;

import java.util.Calendar;

public class Calenders {

    public static void main(String[] args){

        Calendar now = Calendar.getInstance();

        System.out.println(now.getTime());

        now.add(Calendar.YEAR, -21);
        System.out.println(now.getTime());
        now.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(now.getTime());
        now.add(Calendar.MONTH, 6);
    }
}
