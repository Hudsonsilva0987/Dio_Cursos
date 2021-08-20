package com.hudson.Application.Dates;

import java.text.DateFormat;
import java.util.Date;

public class DataFormatDate {

    public static void main(String[] args){
        Date data = new Date();

        String dataFormatada = DateFormat.getDateInstance().format(data);

        System.out.println(dataFormatada);

        dataFormatada = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(data);
        System.out.println(dataFormatada);

        dataFormatada = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(data);
        System.out.println(dataFormatada);
    }
}
