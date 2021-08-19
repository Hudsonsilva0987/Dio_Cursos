package com.hudson.Application.Dates;

import java.util.Date;

public class afterAndBefore {

    public static void main(String[] args){
        Date dateBefore = new Date(63040464000000L);
        Date dateAfter = new Date(94151575111111L);

        Boolean isAfter = dateBefore.after(dateAfter);
        System.out.println(isAfter);
        Boolean isBefore = dateAfter.after(dateBefore);
        System.out.println(isBefore);
        
    }
}
