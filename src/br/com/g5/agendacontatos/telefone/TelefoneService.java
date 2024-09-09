package br.com.g5.agendacontatos.telefone;

import br.com.g5.agendacontatos.contato.Contato;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TelefoneService extends Telefone{

    Scanner sc = new Scanner(System.in);
    public Telefone requisitarTelefoneNoTerminal (List<Contato> contatos) {
        Telefone telefone = new Telefone();
        System.out.println("Digite o numero de telefone:");
        String numero;
        do {
            numero = sc.next();
            if (!isTelefoneValido(numero)) {
                System.out.print("Formato de telefone inválido, tente novamente: ");
            } else if (checarSeTelefoneExiste(contatos, numero)) {
                System.out.print("Telefone ja existe, tente novamente: ");
            }
        } while (!isTelefoneValido(numero) || checarSeTelefoneExiste(contatos, numero));

        telefone.setNumero(numero);

        System.out.println("""
                Escolha o tipo do telefone:\s
                                
                 1 - Celular\
                                
                 2 - Casa\
                                
                 3 - Trabalho\
                                
                 4 - Escola\
                                
                 5 - Principal\
                                
                 6 - Outro""");
        int opcao = 0;
        boolean opcaoValida = false;
        while (!opcaoValida) {
            try {
                opcao = sc.nextInt();
                if (opcao >= 1 && opcao <= 6) {
                    opcaoValida = true;
                } else {
                    System.out.println("Opção incorreta. Selecione um número entre 1 e 6!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Insira um número: ");
                sc.next();
            }
        }

        telefone.setTipo(opcao);
        return telefone;
    }

    public String requisitarStringTelefoneNoTerminal(List<Contato> contatos) {
        System.out.println("Digite o telefone que deseja localizar:");
        String numero =  sc.nextLine();
        do {
            if (!isTelefoneValido(numero)) {
                System.out.print("Formato de telefone inválido, tente novamente: ");
                numero = sc.next();
            }
            if (!checarSeTelefoneExiste(contatos, numero)) {
                System.out.print("Telefone não existe, tente novamente: ");
                numero = sc.next();
            }
            return numero;
    } while (!isTelefoneValido(numero) || checarSeTelefoneExiste(contatos,numero));


    }

    public Boolean checarSeTelefoneExiste(List<Contato> contatos, String numero) {
        return contatos.stream().anyMatch(x->x.getNumeroTelefone().equals(numero));
    }

    public boolean isTelefoneValido(String numero) {
        return numero.matches("^[0-9]{8,11}");
    }

}
