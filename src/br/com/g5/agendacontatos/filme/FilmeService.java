package br.com.g5.agendacontatos.filme;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FilmeService extends Filme {
    Scanner sc = new Scanner(System.in);

    public Filme requisitarFilmeNoTerminal(List<Filme> filmes) {
        System.out.print("Digite o título: ");
        String titulo = sc.nextLine();
        while (filmeIsDuplicado(filmes,titulo)) {
            System.out.print("Filme ja existe na lista, adicione outro: ");
            titulo = sc.nextLine();
        }
        Double nota = null;
        while (nota == null) {
            try {
                System.out.print("Digite a nota para o filme: ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    nota = null;
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.printf("Nota inválida! Digite uma nota de 1 a 10 para o filme %s \n \n", titulo);
                sc.nextLine();
            }
        }
        System.out.println("\nFilme avaliado com sucesso!");
        return new Filme(titulo, nota);
    }

    public boolean filmeIsDuplicado(List<Filme> filmes, String nomeFilme) {
        return filmes.stream().anyMatch(x->x.getNome().equals(nomeFilme));
    }

}
