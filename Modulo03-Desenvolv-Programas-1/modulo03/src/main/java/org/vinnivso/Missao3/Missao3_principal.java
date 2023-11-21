package org.vinnivso.Missao3;

/**
 * @author vinnivso
 */
public class Missao3_principal {
    public static void main(String[] args) {
        System.out.println("Início da Missão 3");
        Missao3_Calculadora obj_calculadora = new Missao3_Calculadora();
        obj_calculadora.N1 = 20.5;
        obj_calculadora.N2 = 12.1;
        obj_calculadora.SOMAR(1,2);
        obj_calculadora.SUBTRAIR(10.5,4.2);
        obj_calculadora.MULTIPLICAR(2.2,5.5);
        obj_calculadora.DIVIDIR(4.2,2.1);
    }
}
