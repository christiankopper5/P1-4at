package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Zadaj 1. cislo: ");
        int cislo1 = myObj.nextInt();

        System.out.println("Zadaj 2. cislo: ");
        int cislo2 = myObj.nextInt();

        System.out.println("Zadaj operaciu (+   -   *   /): ");
        String operacia = myObj.next();

        int vysledok = 0;

        if (operacia.equals("+")) {
            vysledok = cislo1 + cislo2;
        } else if (operacia.equals("-")) {
            vysledok = cislo1 - cislo2;
        } else if (operacia.equals("*")) {
            vysledok = cislo1 * cislo2;
        } else if (operacia.equals("/")) {
            vysledok = cislo1 / cislo2;
        }else {
            System.out.println("Neznáma operácia!");
            myObj.close();
            return;
        }

        System.out.println("Vysledok: " + vysledok);

        myObj.close();
    }
}