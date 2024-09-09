package br.com.g5.agendacontatos;

import br.com.g5.agendacontatos.agenda.AgendaController;
import br.com.g5.agendacontatos.enuns.OperacoesSistema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAgenda {

    public void iniciarMenuAgenda() {
        AgendaController controller = new AgendaController();
        int opcao = 0;

        OperacoesSistema operacao = null;
        Scanner sc = new Scanner(System.in);

        do {
            boolean opcaoValida = false;
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
            System.out.println("6 - Adicionar Filme");
            System.out.println("7 - Sair\n");
            System.out.print("Escolha uma opção: ");

            while (!opcaoValida) {
            try {
                opcao = sc.nextInt();
                if (opcao > OperacoesSistema.values().length) {
                    throw new InputMismatchException();
                }
                operacao = OperacoesSistema.values()[opcao - 1];
                opcaoValida = true;
                } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.printf("Opção inválida. Insira um número de 1 a %d.", OperacoesSistema.values().length);
                sc.nextLine();
                }
            }

            switch (operacao){
                case ADICIONAR:
                    controller.adicionarContato();
                    break;
                case DETALHAR:
                    controller.detalharContatoPorTelefone();
                    break;
                case EDITAR:
                    controller.editarContatoPorStringTelefone();
                    break;
                case REMOVER:
                    controller.removerContatoPorTelefone();
                    break;
                case LISTAR:
                    controller.listarTodosOsContatos();
                    break;
                case ADICIONAR_FILME:
                    controller.adicionarFilme();
                    break;
            }
        } while (operacao != OperacoesSistema.SAIR);
        sc.close();
    }
}

