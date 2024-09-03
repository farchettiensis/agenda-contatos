package br.com.g5.agendacontatos.util;

import br.com.g5.agendacontatos.Contato;
import br.com.g5.agendacontatos.Filme;

import java.util.function.Predicate;

public abstract class Predicados {
    public static final Predicate<Contato> ContatoPredicado(String str) {
        return c -> c.getNome().equalsIgnoreCase(str) || c.getTelefone().equals(str);
    }
    public static final Predicate<Filme> FilmePredicado(String str) {
        return f -> f.getNome().equalsIgnoreCase(str);
    }
}
