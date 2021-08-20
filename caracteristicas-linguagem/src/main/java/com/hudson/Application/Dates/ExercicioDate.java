package com.hudson.Application.Dates;

import java.util.Calendar;
import java.util.Date;


public class ExercicioDate {
    public static void main(String[] args) {
        int dias = 10;
        Date data = new Date(1629397115341L);
        Calendar now = Calendar.getInstance();
        now.setTime(data);
        System.out.println(now.getTime());
        now.add(Calendar.DAY_OF_MONTH, dias); //Domingo = 1 , Sabado = 7
        System.out.println(now.get(Calendar.DAY_OF_WEEK));

        if(now.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            int dif = 2;
            System.out.println("O cliente teve o total de " + (dif + dias) + " dias para realizar o pagamento");
            System.out.println(now.getTime());

        }if(now.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            int dif = 1;
            System.out.println("O cliente teve o total de " + (dif + dias) + " dias para realizar o pagamento");
            System.out.println(now.getTime());
        }

    }
}
