package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.telefone.TelefoneService;

public class AgendaService extends Agenda{
    ContatoService contatoService = new ContatoService();
    TelefoneService telefoneService = new TelefoneService();

    public void adicionarContato() {
        Contato contato = contatoService.requisitarContatoNoTerminal(getContatos());
        getContatos().add(contato);
    }

    public void buscarContatoPorStringTelefone() {
        String telefone = telefoneService.requisitarStringTelefoneNoTerminal(getContatos());
        for (Contato contato : getContatos()) {
            if (contato.getNumeroTelefone().equals(telefone)) {
                System.out.println("CONTATO:");
                contatoService.detalharContato(contato);
            }
            }
        }


    public void editarContatoPorStringTelefone() {
        String telefone = telefoneService.requisitarStringTelefoneNoTerminal(getContatos());
        for (Contato contato : getContatos()) {
            if (contato.getTelefone().getNumero().equals(telefone)) {
                Contato novoContato = contatoService.requisitarContatoNoTerminal(getContatos());
                this.contatos.set(contatos.indexOf(contato), novoContato);
            }
        }

    }

    public void listarContatos(){
        for (Contato contato : getContatos()) {
            contatoService.detalharContato(contato);
        }
    }

    public void removerContato() {
        String telefone = telefoneService.requisitarStringTelefoneNoTerminal(getContatos());
        for (Contato contato : getContatos()) {
            if (contato.getNumeroTelefone().equals(telefone)) {
                System.out.println("Contato:");
                contatoService.detalharContato(contato);
                getContatos().remove(contato);
                System.out.println("Removido com sucesso!");
                return;
            }
        }
    }

    public void adicionarFilmeEmContatoPorTelefoneString() {
        String telefone = telefoneService.requisitarStringTelefoneNoTerminal(getContatos());
        for (Contato contato : getContatos()) {
            if (contato.getNumeroTelefone().equals(telefone)) {
                contatoService.adicionarFilmeEmContato(contato);
            }
        }

    }



}
