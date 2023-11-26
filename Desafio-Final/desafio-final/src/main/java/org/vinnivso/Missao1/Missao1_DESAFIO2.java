package org.vinnivso.Missao1;

/**
 * @author vinnivso
 */

public class Missao1_DESAFIO2 {
    public static void main(String[] args) {
        System.out.println("MISSÃO 1 - DESAFIO 2 – Cálculo da Média Bimestral");
        int Trab1B = 27;
        int Trab2B = 29;
        int Prova1B = 68;
        int Prova2B = 70;
        int Nota1B = Trab1B + Prova1B;
        int Nota2B = Trab2B + Prova2B;
        double Media_Final = (double) (Nota1B + Nota2B) / 2;

        System.out.println("A média final do aluno é: " + Media_Final);
        System.out.println("DESAFIO 2 CONCLUÍDO! – MÉDIA CALCULADA!");
    }
}
