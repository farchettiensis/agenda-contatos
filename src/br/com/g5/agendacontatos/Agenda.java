package br.com.g5.agendacontatos;

import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        if (!Verificador.isDuplicado(contatos, Predicados.ContatoPredicado(contato.getNome()))
        || !Verificador.isDuplicado(contatos, Predicados.ContatoPredicado(contato.getTelefone().getNumero()))) {
            this.contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Contato com o mesmo nome ou número de telefone já existe.");
        }
    }

    public void removerContato(Contato contato) {
        if (!this.contatos.contains(contato)) {
            throw new IllegalArgumentException("Contato não encontrado.");
        }
        this.contatos.remove(contato);
    }

    public void buscarContato(String telefone) {
        for (Contato contato : this.contatos) {
            if (contato.getTelefone().getNumero().equals(telefone)) {
                System.out.println(contato.detalharContato());
                return;
            }
        }
        throw new IllegalArgumentException("Contato com o telefone " + telefone + " não foi encontrado.");
    }
    public String listarTodosOsContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : this.contatos) {
            sb.append(String.format("%-20s %-15s %-30s %-30s %-20s%n",
                    contato.getNome(),
                    contato.getTelefone() != null ? contato.getTelefone().getNumero() : "N/A",
                    contato.getEndereco() != null ? contato.getEndereco() : "N/A",
                    contato.getEmail() != null ? contato.getEmail() : "N/A",
                    contato.getChavePix() != null ? contato.getChavePix() : "N/A"
            ));
        }
        return sb.toString();
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
