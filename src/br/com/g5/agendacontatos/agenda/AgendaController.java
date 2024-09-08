package br.com.g5.agendacontatos.agenda;


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
