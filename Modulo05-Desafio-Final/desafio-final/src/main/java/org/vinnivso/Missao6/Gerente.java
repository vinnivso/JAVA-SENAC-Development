package org.vinnivso.Missao6;

import org.vinnivso.Missao6.Interfaces.ValidaSenha;

/**
 * @author VINNIVSO
 */

public class Gerente extends Funcionario implements ValidaSenha {
    private int Senha_Ger;
    private String Area_Ger;

    public int getSenha_Ger() {
        return Senha_Ger;
    }

    public void setSenha_Ger(int senha_Ger) {
        Senha_Ger = senha_Ger;
    }

    public String getArea_Ger() {
        return Area_Ger;
    }

    public void setArea_Ger(String area_Ger) {
        Area_Ger = area_Ger;
    }

    //MÉTODO PARA VALIDAÇÃO DE PASSWORD
    @Override
    public boolean valida(int senha) {
        return this.Senha_Ger == senha;
    }

    //MÉTODO PARA BONIFICAÇÃO

    @Override
    public double BonificacaoAnual() {
        double SalarioComBonificacao = super.BonificacaoAnual();
        SalarioComBonificacao = SalarioComBonificacao + 300;
        return SalarioComBonificacao;
    }

}