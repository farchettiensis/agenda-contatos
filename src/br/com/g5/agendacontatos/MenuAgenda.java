package br.com.g5.agendacontatos;

import br.com.g5.agendacontatos.agenda.Agenda;
import br.com.g5.agendacontatos.agenda.AgendaController;
import br.com.g5.agendacontatos.enuns.OperacoesSistema;

import java.util.Scanner;

public class MenuAgenda {
    AgendaController agendaController = new AgendaController();

    public void iniciarMenuAgenda() {
        int opcao;
        OperacoesSistema operacao = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(
                    """
                            \n##################
                            ##### AGENDA #####
                            ##################
                            """);

            System.out.println("\n>>>> Menu Contato <<<<");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Detalhar Contato");
            System.out.println("3 - Editar Contato");
            System.out.println("4 - Remover Contatos");
            System.out.println("5 - Listar Contatos");
            System.out.println("6 - Favoritar Contato");
            System.out.println("7 - Sair\n");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();

                if (opcao >= 1 && opcao <= OperacoesSistema.values().length) {
                    operacao = OperacoesSistema.values()[opcao - 1];
                } else {
                    System.out.println("Opção inválida. Tente novamente!");
                    sc.nextInt();
                }
            } else {
                System.out.println("Opção inválida. Tente novamente!");
                sc.nextInt();
                continue;
            }

            switch (operacao){
                case ADICIONAR:
                    agendaController.adicionarContato();
                    break;
                case DETALHAR:
                    System.out.println("Digite o telefone do contato: ");
                    agendaController.deltalharContatoPorTelefone();
                    break;
                case LISTAR:
//                    todo: criar listar todos contatos
//                    System.out.println(agenda.listarTodosOsContatos());
                    break;
            }
        } while (operacao != OperacoesSistema.SAIR);

        sc.close();
    }

    public void getOperacao() {

    }

}


