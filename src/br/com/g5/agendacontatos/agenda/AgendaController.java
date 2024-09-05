package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.telefone.TelefoneService;
import br.com.g5.agendacontatos.telefone.TipoTelefone;

public class AgendaController {
    ContatoService contatoService = new ContatoService();
    AgendaService agendaService = new AgendaService();
    TelefoneService telefoneService = new TelefoneService();

    public void adicionarContato() {
        agendaService.adicionarContato(contatoService.requisitarContatoNoTerminal());
    }

    public void detalharContatoPorTelefone() {
        agendaService.buscarContatoPorStringTelefone(telefoneService.requisitarStringTelefoneNoTerminal());
    }

    public void listarTodosOsContatos(){
        agendaService.listarContatos();
    }

    public void removerContatoPorTelefone() {
        agendaService.removerContato(telefoneService.requisitarStringTelefoneNoTerminal());
    }

}
