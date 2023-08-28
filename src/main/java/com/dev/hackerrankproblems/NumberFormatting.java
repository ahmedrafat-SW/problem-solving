package com.dev.hackerrankproblems;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormatting {

        public static void main(String[] args) {
            printALLCountryLangAndCode();
            formatPaymentBasedOnLocale();

        }

    private static void formatPaymentBasedOnLocale() {
        double number = 12324.134;
//            Locale customLocale = new Locale.Builder()
//                                .setRegion("IN")
//                                .setLanguage("en")
//                                .setExtension('x', "432")
//                                .build();

//           Building custom indian locale
        Locale locale = new Locale("en", "IN");
        System.out.print("India: ");
        formatCurrencyNumberBasedOnLocal(number,locale);
//            us locale
        locale = new Locale("en","US");
        System.out.print("US: ");
        formatCurrencyNumberBasedOnLocal(number,locale);
//            china locale
        locale = new Locale("zh", "CN");
        System.out.print("China: ");
        formatCurrencyNumberBasedOnLocal(number,locale);
//            french locale
        locale = new Locale("fr", "FR");
        System.out.print("French: ");
        formatCurrencyNumberBasedOnLocal(number, locale);
    }


    static void printALLCountryLangAndCode(){
            // Get all available ISO languages
            String[] languages = Locale.getISOLanguages();
            System.out.println("Available language codes:");
            for (String language : languages) {
                System.out.print(language+"\t");
            }

            System.out.println();

            // Get all available ISO countries
            String[] countries = Locale.getISOCountries();
            System.out.println("Available country codes:");
            for (String country : countries) {
                System.out.print(country+"\t");
            }
    }

    static void formatCurrencyNumberBasedOnLocal(double number, Locale locale){



        // Create a NumberFormat instance for a specific locale (e.g., Germany)
//        Locale locale = new Locale("de", "DE");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

        // Format the number as currency
        String formattedNumber = currencyFormat.format(number);

        System.out.println(formattedNumber);

    }


}

