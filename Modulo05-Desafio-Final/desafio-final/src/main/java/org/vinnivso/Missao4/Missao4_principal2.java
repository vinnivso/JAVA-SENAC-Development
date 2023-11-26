package org.vinnivso.Missao4;

/**
 * @author VINNIVSO
 */

public class Missao4_principal2 {

    public static void main(String[] args) {
        double Saldo_Atual, Limite_Atual;
        Missao4_CONTA_CORRENTE CC = new Missao4_CONTA_CORRENTE("Paula", 1250);
        Saldo_Atual = CC.getSaldo_CC();
        Limite_Atual = CC.getLimite_CC();

        System.out.println("O saldo atual da conta é de R$" + Saldo_Atual);

        CC.depositar(200.50);
        CC.sacar(50.25);

        System.out.println("O limite atual da conta é de R$" + Limite_Atual);
    }

}
