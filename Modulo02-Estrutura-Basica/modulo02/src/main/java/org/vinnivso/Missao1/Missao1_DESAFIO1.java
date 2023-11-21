package org.vinnivso.Missao1;

/**
 * @author vinnivso
 * Data: 15/11/2023
 */
public class Missao1_DESAFIO1 {
    public static void main(String[] args) {
        //Apresenta o título da missão
        System.out.println("Início da Missão 1");
        System.out.println("Autor: Vinícius Silva de Oliveira, a.k.a vinnivso");
        System.out.println("Data: 15/11/2023");
        System.out.println("Cálculo da nota bimestral");

        //Declaração e atribuição de valor para variáveis
        int Nota_Trabalho = 22;
        int Nota_Prova = 58;

        //Variável responsável pela soma (Passa 3 da atividade)
        int Nota_Bimestre = Nota_Trabalho + Nota_Prova;

        //Apresenta o resultado da nota bimestral no console (Passo 4 da atividade)
        System.out.println("A nota bimestral é : " + Nota_Bimestre);
    }
}