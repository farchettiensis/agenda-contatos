package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.telefone.TelefoneService;

public class AgendaController {
    AgendaService agendaService = new AgendaService();


    public void adicionarContato() {
        agendaService.adicionarContato();
    }

    public void detalharContatoPorTelefone() {
        agendaService.buscarContatoPorStringTelefone();
    }

    public void listarTodosOsContatos(){
        agendaService.listarContatos();
    }

    public void editarContatoPorStringTelefone() {
        agendaService.editarContatoPorStringTelefone();
    }

    public void removerContatoPorTelefone() {
        agendaService.removerContato();
    }

    public void adicionarFilme() {
        agendaService.adicionarFilmeEmContatoPorTelefoneString();
    }

}
