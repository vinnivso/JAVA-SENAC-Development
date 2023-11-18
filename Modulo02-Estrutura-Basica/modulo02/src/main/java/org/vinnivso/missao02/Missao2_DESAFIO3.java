package org.vinnivso.missao02;

import java.util.Scanner;

/**
 * @author vinnivso
 * Autor: Vinícius Silva de Oliveira
 * Data: 15/11/2023
 */

public class Missao2_DESAFIO3 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 2 - DESAFIO 3 - WHILE");
        System.out.println("Código Exemplo de Laço de Repetição");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade");
        int idade = input.nextInt();

        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }

        System.out.println("MISSÃO 2 - DESAFIO 3 CONCLUÍDO");
    }
}
