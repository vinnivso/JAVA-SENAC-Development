package org.vinnivso.Missao4;

import java.util.Scanner;

/**
 * @author VINNIVSO
 */
public class Missao4_DESAFIO3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Nome_Autor;
        String Data_Codigo;

        Nome_Autor = "Vinícius Silva de Oliveira";
        Data_Codigo = "21/11/2023";

        String Msg_inicial = "Início da Missão4";
        System.out.println(Msg_inicial);

        String frase = "Este código foi desenvolvido por " + Nome_Autor + " em " + Data_Codigo + ".";
        System.out.println(frase);

        System.out.println("---------------------");
        System.out.println("verificando o comprimento da String");
        String Nome = "Luiz";
        int tamanho = Nome.length();
        System.out.println("O tamanho da variável Nome é " + tamanho);

        System.out.println("---------------------");
        System.out.println("verificando se duas strings são iguais (maneira 1)");
        String Nome_Cadastrado = "Luiz";
        String Nome_Digitado;
        System.out.println("Digite seu Nome");
        Nome_Digitado = entrada.next();
        if (Nome_Cadastrado.equals(Nome_Digitado)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes!");
        }

        System.out.println("---------------------");
        System.out.println("verificando se duas strings são iguais (maneira 2)");
        System.out.println("---------------------");
        String Nome_Cadastrado1 = "Luiz";
        String Nome_Cadastrado2 = "LUIZ";
        if (Nome_Cadastrado1.equalsIgnoreCase(Nome_Cadastrado2)) {
            System.out.println("Os nomes são iguais");
        } else {
            System.out.println("Os nomes são diferentes");
        }

        System.out.println("---------------------");
        System.out.println("identificando um caractere em uma determinada posiçao");
        System.out.println("---------------------");
        Nome = "Luiz"; //Desnecessário
        System.out.println("A primeira letra do nome é: " + Nome.charAt(0));
        for (int i = 0; i < Nome.length(); i++) {
            System.out.println(Nome.charAt(i));
        }

    }
}
