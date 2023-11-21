package org.vinnivso.Missao3;

/**
 * @author vinnivso
 */
public class Missao3_Calculadora {
    public double R, N1, N2;

    public void SOMAR(double N1,double N2) {
        R = N1 + N2;
        System.out.println("A soma entre " + N1 + " e " + N2 + " é " + R);
    }

    public void SUBTRAIR(double N1,double N2) {
        R = N1 - N2;
        System.out.println("A subtração entre " + N1 + " e " + N2 + " é " + R);
    }

    public void MULTIPLICAR(double N1,double N2) {
        R = N1 * N2;
        System.out.println("A multiplicação entre " + N1 + " e " + N2 + " é " + R);
    }

    public void DIVIDIR(double N1,double N2){
        R = N1 / N2;
        System.out.println("A divisão entre " + N1 + " e " + N2 + " é " + R);
    }
}
