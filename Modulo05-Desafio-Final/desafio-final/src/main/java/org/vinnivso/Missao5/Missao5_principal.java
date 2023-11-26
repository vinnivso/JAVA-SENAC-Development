package org.vinnivso.Missao5;

import java.util.Scanner;

/**
 * @author VINNIVSO
 */
public class Missao5_principal {
    public static void main(String[] args) {
        Missao5_Tratamento_Excecao execution = new Missao5_Tratamento_Excecao();
        execution.Imprime_valores();
        //Media_idade_Funcionarios();
    }
    public static void Media_idade_Funcionarios() {
        int[] idade_funcionarios = new int[6];
        int Soma_idade = 0;
        double Media_idade = 0;
        Scanner entrada = new Scanner(System.in);
        //RECEBENDO O VALOR DAS IDADES COM O LAÇO DE REPETIÇÃO: FOR
        for(int i = 0; i< 6; i++)
        {
            System.out.println("Digite a idade do funcionário" + (int)(i+1) + ":");
            idade_funcionarios[i] = entrada.nextInt();
        }
        //Calculando a soma das idades com o LAÇO DE REPETIÇÃO: WHILE
        int cont = 0;
        while(cont < 6)
        {
            Soma_idade = Soma_idade + idade_funcionarios[cont];
            cont += 1;
        }
        Media_idade = (double)Soma_idade/6;
        //Mostrando o resultado no Console.
        System.out.println("A média de idade dos func. da empresa é:" + Media_idade);
    }
}
