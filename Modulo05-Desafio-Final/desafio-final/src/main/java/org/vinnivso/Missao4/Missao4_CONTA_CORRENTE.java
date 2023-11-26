package org.vinnivso.Missao4;

import java.text.DecimalFormat;

/**
 * @author VINNIVSO
 */
public class Missao4_CONTA_CORRENTE {
    private String Nome_Cliente;
    private String Num_CC;
    private double Saldo_CC;
    private double Limite_CC;

    public Missao4_CONTA_CORRENTE(String Cliente, int limit) {
        this.Nome_Cliente = Cliente;
        this.Limite_CC = limit;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        Nome_Cliente = nome_Cliente;
    }

    public String getNum_CC() {
        return Num_CC;
    }

    public void setNum_CC(String num_CC) {
        Num_CC = num_CC;
    }

    public double getSaldo_CC() {
        return Saldo_CC;
    }

    public void setSaldo_CC(double saldo_CC) {
        Saldo_CC = saldo_CC;
    }

    public double getLimite_CC() {
        return Limite_CC;
    }

    public void setLimite_CC(double limite_CC) {
        Limite_CC = limite_CC;
    }

    void sacar (double valor) {

        if (valor > this.Saldo_CC + this.Limite_CC) {
            System.out.println("O valor do saque excede o valor disponível em conta");
        } else {
            this.Saldo_CC -= valor;
            System.out.println("Um SAQUE foi realizado no valor de R$" + valor);
            System.out.println("Seu SALDO é de R$" + getSaldo_CC());
        }
    }
    void depositar (double valor) {

        this.Saldo_CC += valor;
        System.out.println("Um DEPÓSITO foi realizado no valor de R$" + valor);
    }
}
