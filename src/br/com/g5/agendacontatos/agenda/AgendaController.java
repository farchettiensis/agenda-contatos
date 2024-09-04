package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.telefone.TelefoneService;

public class AgendaController {
    ContatoService contatoService = new ContatoService();
    AgendaService agendaService = new AgendaService();
    TelefoneService telefoneService = new TelefoneService();

    public void adicionarContato() {
        agendaService.adicionarContato(contatoService.requisitarContatoNoTerminal());
    }

    public void deltalharContatoPorTelefone() {
        agendaService.buscarContatoPorStringTelefone(telefoneService.requisitarStringTelefoneNoTerminal());
    }

    public void listarTodosOsContatos(){
        agendaService.listarTodosOsContatos();
    }

}
