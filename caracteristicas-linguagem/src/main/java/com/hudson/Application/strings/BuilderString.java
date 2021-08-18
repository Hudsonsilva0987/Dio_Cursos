package com.hudson.Application.strings;

public class BuilderString {

    public static void main (String[] args) {
        final var nome = "ana";

        final var builder = new StringBuilder(nome);

        System.out.println(builder.append(" luis"));

        final var reverse = builder.reverse();

        System.out.println(reverse.insert(0, "$").insert(reverse.length(), "&"));
    }
}