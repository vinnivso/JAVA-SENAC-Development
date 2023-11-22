package org.vinnivso.Missao2;

import java.util.Scanner;

/**
 * @author vinnivso
 */

public class Missao2_DESAFIO6 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 2 - DESAFIO 6 - FOR");
        System.out.println("Números ímpares até o valor inserido");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor de entrada");
        int value = input.nextInt();

        for (int i = 0; i < value; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("MISSÃO 2 - DESAFIO 5 CONCLUÍDO");
    }
}
