package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Alana";
        names[1] = "Bakyt";
        names[2] = "Ilim";

        for (int i = 0; i <names.length; i++) {


            switch (i) {
                case 0:
                    System.out.println("Доброе утро!" + names[0]);
                    break;
                case 1:
                    System.out.println("Добрый день!" + names[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер!" + names[2]);
                    break;
            }
        }

        for (String name: names) {

            switch (name) {
                case "Alana":
                    System.out.println("Доброе утро!" + names[0]);
                    break;
                case "Bakyt":
                    System.out.println("Добрый день!" + names[1]);
                    break;
                case "Ilim":
                    System.out.println("Добрый вечер!" + names[2]);
                    break;
            }
        }
    }
}
