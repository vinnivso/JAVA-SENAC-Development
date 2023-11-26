package org.vinnivso.Missao5;

/**
 * @author VINNIVSO
 */

public class Missao5_Tratamento_Excecao {
    public void Imprime_valores() {
        int num = 20;
        double result;
        for (int i = 5; i > 5; i-- ) {
            try {
                result = num / i;
                System.out.println("O número " + num + " foi dividido por " + i);
            }catch (Exception e) {
                System.out.println("Para i = zero --> Valor inválido (Divisão Por Zero)");
            }
        }
    }
}
