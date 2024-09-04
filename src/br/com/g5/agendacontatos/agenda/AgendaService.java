package br.com.g5.agendacontatos.agenda;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.contato.ContatoService;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

public class AgendaService extends Agenda{
    ContatoService contatoService = new ContatoService();
    public void adicionarContato(Contato contato) {
        if (!Verificador.isDuplicado(super.contatos, Predicados.ContatoPredicado(contato.getNome()))
                || !Verificador.isDuplicado(contatos, Predicados.ContatoPredicado(contato.getTelefone().getNumero()))) {
            this.contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Contato com o mesmo nome ou número de telefone já existe.");
        }
    }

    public void buscarContatoPorStringTelefone(String telefone) {
        for (Contato contato : super.contatos) {
            if (contato.getNumeroTelefone() .equals(telefone)) {
                contatoService.detalharContato(contato);
            }
        }
        throw new IllegalArgumentException("Contato com o telefone " + telefone + " não foi encontrado.");
    }

    public void listarTodosOsContatos(){
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
        System.out.println(sb);
    }

}
