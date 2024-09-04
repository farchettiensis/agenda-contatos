package br.com.g5.agendacontatos.telefone;

import java.util.Scanner;

public class TelefoneService extends Telefone{

    Scanner sc = new Scanner(System.in);
    public Telefone requisitarTelefoneNoTerminal() {
        Telefone telefone = new Telefone();
        System.out.println("Escreva o seu numero");
        telefone.setNumero(sc.next());
        System.out.println("Escolha o tipo do telefone: \n" +
                "\n 1 - Celular" +
                "\n 2 - Casa" +
                "\n 3 - Trabalho" +
                "\n 4 - Escola" +
                "\n 5 - Principal" +
                "\n 6 - Outro");
        int opcao = sc.nextInt();
        super.setTipo(opcao);

        return telefone;
    }
}
