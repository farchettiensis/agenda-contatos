package br.com.g5.agendacontatos.telefone;

import java.util.Scanner;

public class TelefoneService extends Telefone{

    Scanner sc = new Scanner(System.in);
    public Telefone requisitarTelefoneNoTerminal() {
        Telefone telefone = new Telefone();
        System.out.println("Escreva o seu numero");
        telefone.setNumero(sc.next());
        System.out.println("Escolha o tipo do telefone: \n" +
                "1 - Celular" +
                "2 - Casa" +
                "3 - Trabalho" +
                "4 - Escola" +
                "5 - Principal" +
                "6 - Outro");
        int opcao = sc.nextInt();
        super.setTipo(opcao);

        return telefone;
    }
}
