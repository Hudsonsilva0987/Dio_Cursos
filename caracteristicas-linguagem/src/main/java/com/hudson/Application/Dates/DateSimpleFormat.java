package com.hudson.Application.Dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSimpleFormat {

    public static void main(String[] args){
        Date data = new Date();

       SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
       String dataFormatada = formatter.format(data);
       System.out.println(dataFormatada);
    }

}
