package org.vinnivso.Missao6;

import java.time.Duration;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author VINNIVSO
 */

public class API_DateTime {
    public void horario() {

        //MOSTRANDO HORÁRIO ATUAL
        LocalTime HoraAgora = LocalTime.now();
        System.out.println("Hora Agora: " + HoraAgora);

        //HORÁRIO ATUAL SUBTRAINDO HORAS
        LocalTime tempo = LocalTime.now().minusHours(5);
        System.out.println("Horário atual subtraindo 5 horas: " + tempo);

        //HORÁRIO ATUAL ADICIONANDO HORAS
        tempo = LocalTime.now().plusHours(4);
        System.out.println("Horário atual adicionando 4 horas: " + tempo);

        //INTERVALO DE TEMPO
        Duration tempo2 = Duration.between(HoraAgora, tempo);
        System.out.println("Intervalo de tempo entre duas instância de tempo: " + tempo2);

        //NÚMEROS DE DIAS NO MÊS
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, insira o mês de referência");
        int mesInformado = input.nextInt();
        System.out.println("Por favor, insira o ano de referência");
        int anoInformado = input.nextInt();
        int daysInMonth = YearMonth.of(anoInformado, mesInformado).lengthOfMonth();
        System.out.println("Número de dias no mês de " + mesInformado + " de " + anoInformado + ": " + daysInMonth);

    }
}
