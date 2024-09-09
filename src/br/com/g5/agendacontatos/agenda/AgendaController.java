package br.com.g5.agendacontatos.agenda;


public class AgendaController {
    AgendaService agendaService = new AgendaService();


    public void adicionarContato() {
        try {
            agendaService.adicionarContato();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
