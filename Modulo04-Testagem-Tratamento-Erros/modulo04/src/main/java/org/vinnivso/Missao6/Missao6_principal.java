package org.vinnivso.Missao6;

/**
 * @author VINNIVSO
 */

public class Missao6_principal {
    public static void main(String[] args) {
        Funcionario F1 = new Funcionario();
        F1.setNome_Func("Luiz");
        F1.setCPF_Func("1234");
        F1.setSalario_Func(500.00);

        Gerente G = new Gerente();
        G.setNome_Func("Alberto");
        G.setCPF_Func("445588");
        G.setSalario_Func(1000.00);
        G.setSenha_Ger(888);
        G.setArea_Ger("CONTAB");

        double Bonif_F = F1.BonificacaoAnual();
        double Bonif_G = G.BonificacaoAnual();

        System.out.println("DADOS DO GERENTE:");
        System.out.println("Nome = " + G.getNome_Func());
        System.out.println("CPF = " + G.getCPF_Func());
        System.out.println("Salário = " + G.getSalario_Func());
        System.out.println("Área = " + G.getArea_Ger());
        System.out.println("Salário com Bonificação = " + Bonif_G);

        System.out.println("----------------------------");

        System.out.println("DADOS DO FUNCIONÁRIO:");
        System.out.println("Nome = " + F1.getNome_Func());
        System.out.println("CPF = " + F1.getCPF_Func());
        System.out.println("Salário = " + F1.getSalario_Func());
        System.out.println("Salário com Bonificação = " + Bonif_F);


        API_DateTime dateTime = new API_DateTime();
        dateTime.horario();

    }

}
