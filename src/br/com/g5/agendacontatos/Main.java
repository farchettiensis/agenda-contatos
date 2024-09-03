package br.com.g5.agendacontatos;

import br.com.g5.agendacontatos.enuns.*;

public class Main {
    public static void main(String[] args) {

        //Sistema sistema = new Sistema();
        //sistema.iniciarSistema();

        Telefone telefone1 = new Telefone("12345678909", TipoTelefone.CELULAR);
        Telefone telefone2 = new Telefone("98765432109", TipoTelefone.CASA);
        Telefone telefone3 = new Telefone("12345678919", TipoTelefone.TRABALHO);

        Contato contato1 = new Contato("Donald Fagen", telefone1, "Rua Custerdome, 1", "dfagen@steely.dan", "deaconBlues");
        String cont1Detalhes = contato1.detalharContato();
        System.out.println(cont1Detalhes);

        Contato contato2 = new Contato("Walter Becker", telefone2, "Rua Custerdome, 2", "wbecker@steely.dan", "homeAtLast");
        Contato contato3 = new Contato("Skunk Baxter", telefone3, "Rua Custerdome, 3", "sbaxter@doobie.bros", "46346585");

        Filme rato = new Filme("Ratatouille");
        Filme us = new Filme("Us");
        Filme corra = new Filme("Corra");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        contato1.cadastrarFilme(rato);
        contato1.cadastrarFilme(us);
        contato1.cadastrarFilme(corra);
        contato1.darNotaFilme(rato,10.00);
        contato1.detalharContato();

        //System.out.println(agenda.listarTodosOsContatos());

        //agenda.removerContato(contato3);
        //System.out.println(agenda.listarTodosOsContatos());

        agenda.buscarContato("12345678909");

    }
}
