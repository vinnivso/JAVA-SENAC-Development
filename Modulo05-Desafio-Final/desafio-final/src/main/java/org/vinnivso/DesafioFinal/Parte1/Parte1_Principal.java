package org.vinnivso.DesafioFinal.Parte1;

import java.util.Scanner;

public class Parte1_Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor inserir os valores como argumentos");
        Scanner input = new Scanner(System.in);
        double firstArgument = input.nextDouble();
        double secondArgument = input.nextDouble();

        Parte1_Calculadora calculadora = new Parte1_Calculadora();
        double R_SOMA = calculadora.SOMAR(firstArgument, secondArgument);
        System.out.println("O resultado da soma é: " + R_SOMA);

        double R_SUBTRAIR = calculadora.SUBTRAIR(firstArgument, secondArgument);
        System.out.println("O resultado da subtração é: " + R_SUBTRAIR);

        double R_MULTIPLICAR = calculadora.MULTIPLICAR(firstArgument, secondArgument);
        System.out.println("O resultado da multiplicação é: " + R_MULTIPLICAR);

        double R_DIVIDIR = calculadora.DIVIDIR(firstArgument, secondArgument);
        System.out.println("O resultado da divisão é: " + R_DIVIDIR);
    }
}
