package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

public class AgendaService extends Agenda{
    ContatoService contatoService = new ContatoService();


    public void adicionarContato(Contato contato) {
        if (!Verificador.isDuplicado(getContatos(), Predicados.ContatoPredicado(contato.getNome()))
                || !Verificador.isDuplicado(getContatos(), Predicados.ContatoPredicado(contato.getTelefone().getNumero()))) {
            getContatos().add(contato);
        } else {
            throw new IllegalArgumentException("Contato com o mesmo nome ou número de telefone já existe.");
        }
    }

    public void buscarContatoPorStringTelefone(String telefone) {
        for (Contato contato : getContatos()) {
            if (contato.getNumeroTelefone().equals(telefone)) {
                System.out.println("CONTATO:");
                contatoService.detalharContato(contato);
                return;
            }  else {
                System.out.println("Contato não encontrado!");
                return;
            }
        }
    }

    public void editarContatoPorStringTelefone(String telefone) {
        for (Contato contato : getContatos()) {
            if (contato.getTelefone().getNumero().equals(telefone)) {
                Contato novoContato = contatoService.requisitarContatoNoTerminal();
                this.contatos.set(contatos.indexOf(contato), novoContato);
            } else {
                System.out.println("Contato não encontrado!");
                return;
            }
        }
    }

    public void listarContatos(){
        for (Contato contato : getContatos()) {
            contatoService.detalharContato(contato);
        }
    }

    public void removerContato(String telefone) {
        for (Contato contato : getContatos()) {
            if (contato.getNumeroTelefone().equals(telefone)) {
                System.out.println("Contato:");
                contatoService.detalharContato(contato);
                getContatos().remove(contato);
                System.out.println("Removido com sucesso!");
                return;
            }  else {
                System.out.println("Contato não encontrado!");
                return;
            }
        }
    }

}
