package com.hudson.Application.Dates;

import java.util.Date;

public class CompareT {
    public static void main(String[] args) {

        Date dateBefore = new Date(63040464000000L);
        Date dateAfter = new Date(94151575111111L);
        Date dateDepois = new Date(94151575111111L);

        int compare1 = dateAfter.compareTo(dateBefore);
        int compare2 = dateBefore.compareTo(dateAfter);
        int compare3 = dateAfter.compareTo(dateDepois);

        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
    }
}