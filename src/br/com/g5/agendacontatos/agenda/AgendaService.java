package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

public class AgendaService extends Agenda{
    public void adicionarContato(Contato contato) {
        if (!Verificador.isDuplicado(super.contatos, Predicados.ContatoPredicado(contato.getNome()))
                || !Verificador.isDuplicado(contatos, Predicados.ContatoPredicado(contato.getTelefone().getNumero()))) {
            this.contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Contato com o mesmo nome ou número de telefone já existe.");
        }
    }

}
