package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    protected final List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void removerContato(Contato contato) {
        if (!this.contatos.contains(contato)) {
            throw new IllegalArgumentException("Contato não encontrado.");
        }
        this.contatos.remove(contato);
    }

    /*
    private boolean isContatoDuplicado(Contato novoContato) {
        for (Contato contato : this.contatos) {
            if (contato.getNome().equalsIgnoreCase(novoContato.getNome()) ||
                    contato.getTelefone().getNumero().equals(novoContato.getTelefone().getNumero())) {
                return true;
            }
        }
        return false;
    }*/
}
