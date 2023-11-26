package org.vinnivso.Missao6;

/**
 * @author VINNIVSO
 */

public class Funcionario {
    private String Nome_Func;
    private double Salario_Func;
    private String CPF_Func;

    public String getNome_Func() {
        return Nome_Func;
    }

    public void setNome_Func(String nome_Func) {
        Nome_Func = nome_Func;
    }

    public double getSalario_Func() {
        return Salario_Func;
    }

    public void setSalario_Func(double salario_Func) {
        Salario_Func = salario_Func;
    }

    public String getCPF_Func() {
        return CPF_Func;
    }

    public void setCPF_Func(String CPF_Func) {
        this.CPF_Func = CPF_Func;
    }

    //MÉTODO DE BONIFICAÇÃO ANUAL
    public double BonificacaoAnual() {
        double Salario_Com_Bonificacao = this.Salario_Func + (this.Salario_Func * 0.1);
        return Salario_Com_Bonificacao;
    }

    public double BonificaoAnual(double salario) {
        double Salario_Com_Bonificacao;
        if (salario < 1000) {
            Salario_Com_Bonificacao = this.Salario_Func + (this.Salario_Func * 0.1 + 100);

        } else {
            Salario_Com_Bonificacao = this.Salario_Func + this.Salario_Func * 0.1;
        }
        return Salario_Com_Bonificacao;
    }
}
