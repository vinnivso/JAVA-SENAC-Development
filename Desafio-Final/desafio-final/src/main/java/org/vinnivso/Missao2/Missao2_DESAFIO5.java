package org.vinnivso.Missao2;

import java.util.Scanner;

/**
 * @author vinnivso
 */
public class Missao2_DESAFIO5 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 2 - DESAFIO 5 - FOR");
        System.out.println("Números de 0 até o valor inserido");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor de entrada");
        int value = input.nextInt();

        for (int i = 0; i < value; i++) {
            System.out.println(i);
        }

        System.out.println("MISSÃO 2 - DESAFIO 5 CONCLUÍDO");
    }
}
