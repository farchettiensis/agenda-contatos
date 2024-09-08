package br.com.g5.agendacontatos.filme;

import java.util.Scanner;

public class FilmeService extends Filme {
    Scanner sc = new Scanner(System.in);

    public Filme requisitarFilmeNoTerminal() {
        System.out.print("Digite o título: ");
        String titulo = sc.next();
        System.out.print("Digite a nota para o filme: ");
        Double nota = sc.nextDouble();
        return new Filme(titulo, nota);
    }

}
