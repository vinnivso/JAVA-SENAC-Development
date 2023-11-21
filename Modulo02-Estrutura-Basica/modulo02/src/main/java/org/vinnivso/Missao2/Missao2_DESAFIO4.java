package org.vinnivso.Missao2;

import java.util.Scanner;

/**
 * @author vinnivso
 */
public class Missao2_DESAFIO4 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 2 - DESAFIO 4 - WHILE");
        System.out.println("Números ímpares de 11 - ao valor inserido");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor de entrada");
        int value = input.nextInt();
        int i = 11;

        while (i <= value) {
            if( i % 2 != 0) {
                System.out.println(i);
            }
            i = i + 3;
        }

        System.out.println("MISSÃO 2 - DESAFIO 4 CONCLUÍDO");
    }
}
