package org.vinnivso.Missao3;

/**
 * @author vinnivso
 */
public class Missao3_principal {
    public static void main(String[] args) {
        double R_SOMA, R_SUBTRAIR, R_MULTIPLICAR, R_DIVIDIR;
        System.out.println("Início da Missão 3");
        Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();

        R_SOMA = obj_calculadora.SOMAR(1, 2);
        System.out.println("O resultado da soma é: " + R_SOMA);

        R_SUBTRAIR = obj_calculadora.SUBTRAIR(10.5, 4.2);
        System.out.println("O resultado da subtração é: " + R_SUBTRAIR);

        R_MULTIPLICAR = obj_calculadora.MULTIPLICAR(2.2, 5.5);
        System.out.println("O resultado da multiplicação é: " + R_MULTIPLICAR);

        R_DIVIDIR = obj_calculadora.DIVIDIR(4.2, 2.1);
        System.out.println("O resultado da divisão é: " + R_DIVIDIR);

    }
}
