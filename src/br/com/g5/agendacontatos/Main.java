package br.com.g5.agendacontatos;

import br.com.g5.agendacontatos.agenda.Agenda;
import br.com.g5.agendacontatos.agenda.AgendaController;
import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.telefone.TipoTelefone;

public class Main {
    public static void main(String[] args) {
//        AgendaController controller = new AgendaController();
//
//        controller.adicionarContato();
        Sistema sisteam = new Sistema();
        sisteam.iniciarSistema();

    }
}
