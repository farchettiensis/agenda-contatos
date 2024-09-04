package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.ContatoService;

public class AgendaController {
    ContatoService contatoService = new ContatoService();
    AgendaService agendaService = new AgendaService();

    public void adicionarContato() {
        agendaService.adicionarContato(contatoService.requisitarContatoNoTerminal());
    }

}
