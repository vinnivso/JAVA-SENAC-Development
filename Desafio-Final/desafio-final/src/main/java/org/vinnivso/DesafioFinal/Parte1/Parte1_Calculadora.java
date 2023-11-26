package org.vinnivso.DesafioFinal.Parte1;

import javax.swing.*;

public class Parte1_Calculadora {

    public Parte1_Calculadora() {
    }

    public double SOMAR(double N1, double N2) {
        return N1 + N2;
    }

    public double SUBTRAIR(double N1, double N2) {
        return N1 - N2;
    }

    public double MULTIPLICAR(double N1, double N2) {
        return N1 * N2;
    }

    public double DIVIDIR(double N1, double N2) {
        try {
            if (N1 == 0 || N2 == 0) {
                throw new Exception("Insira argumentos válidos, o primeiro argumento não pode ser igual a ZERO, assim como o dividendo não pode ser igual a 0, valores inseridos foram: " + N1 + " e " + N2);
            }
            return N1 / N2;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
