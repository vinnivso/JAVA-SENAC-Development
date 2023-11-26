package org.vinnivso.Missao2;

/**
 * @author vinnivso
 */
public class Missao2_DESAFIO1 {
    public static void main(String[] args) {
        System.out.println("Início da Missão 2");

        int idade = 40;

        System.out.println("Programa para testar a idade do aluno");

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade == 40) {
            System.out.println("O aluno tem exatamente 40 anos");
        }  else {
            System.out.println("Maior de idade");
        }

        System.out.println("Fim do teste de idade");
    }
}
