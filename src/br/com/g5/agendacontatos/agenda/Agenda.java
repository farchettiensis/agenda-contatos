package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.telefone.TipoTelefone;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    final List<Contato> contatos;

    Telefone victorTelefone = new Telefone("123", TipoTelefone.CELULAR);
    Contato victor = new Contato("Victor", victorTelefone, "Sao joao del rei", "victor.fagundes586@gmail.com");

    public Agenda() {
        this.contatos = new ArrayList<>();
        // Adicionando o objeto "victor" à lista de contatos
        this.contatos.add(victor);
        this.contatos.add(victor);
        this.contatos.add(victor);

    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void removerContato(Contato contato) {
        if (!this.contatos.contains(contato)) {
            throw new IllegalArgumentException("Contato não encontrado.");
        }
        this.contatos.remove(contato);
    }
}
