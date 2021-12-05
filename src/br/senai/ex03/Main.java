package br.senai.ex03;

import java.util.Currency;
import java.util.List;

import static java.time.LocalDate.now;
import static java.util.Currency.getInstance;
import static java.util.Locale.US;


public class Main {

    public static void main(String[] args) {
        int dia = now().getDayOfMonth();
        int mes = now().getMonthValue();
        int ano = now().getYear();

        System.out.printf("data: %02d/%02d/%d - locale: %s - currency: %s",
                dia, mes, ano, US, getInstance(US));
    }

}
