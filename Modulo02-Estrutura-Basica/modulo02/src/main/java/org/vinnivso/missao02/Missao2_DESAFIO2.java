package org.vinnivso.missao02;

import java.util.Scanner;

/**
 * @author vinnivso
 * Autor: Vinícius Silva de Oliveira
 * Data: 15/11/2023
 */

public class Missao2_DESAFIO2 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 2 - DESAFIO 2");
        System.out.println("Teste de idade do aluno - VERSÃO 2");

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a idade");
        int idade = input.nextInt();

        if (idade <= 40) {
            System.out.println("A idade é menor ou igual a 40 anos!");
        } else {
            System.out.println("A idade é maior que 40 anos!");
        }

        System.out.println("FIM DO TESTE");
        System.out.println("MISSÃO 2 - DESAFIO 2 CONCLUÍDO");
    }
}
