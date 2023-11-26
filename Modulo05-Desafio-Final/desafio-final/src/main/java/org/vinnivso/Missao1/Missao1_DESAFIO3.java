package org.vinnivso.Missao1;

/**
 * @author vinnivso
 */

public class Missao1_DESAFIO3 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 1 - DESAFIO 3 – Conversão de Tipos");

        int A = 7;
        int B = 6;

        double R1 = (A + B) / 2;
        double R2 = (double) (A + B) /2;

        System.out.println("O Resultado sem cast é: " + R1);
        System.out.println("O Resultado com cast é: " + R2);
        System.out.println("DESAFIO 3 CONCLUÍDO! ");
    }
}
