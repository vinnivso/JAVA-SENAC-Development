package org.vinnivso.Missao3;

import java.util.Scanner;

/**
 * @author VINNIVSO
 */
public class Missao3_Input {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String Texto = entrada.nextLine();

        System.out.println("Digite um número inteiro:");
        int N_int = entrada.nextInt();

        System.out.println("Digite um número real:");
        double N_double = entrada.nextDouble();

        System.out.println("Digite uma letra ou palavra:");
        String Palavra = entrada.next();

        System.out.println("A frase digitada foi: " + Texto);
        System.out.println("O número inteiro digitado foi: " + N_int);
        System.out.println("O número real foi: " + N_double);
        System.out.println("A letra ou palavra digitada foi: " + Palavra);

        entrada.close();
    }
}
