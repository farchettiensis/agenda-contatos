package br.com.g5.agendacontatos.util;

import br.com.g5.agendacontatos.contato.Contato;
import br.com.g5.agendacontatos.Filme;

import java.util.function.Predicate;

public abstract class Predicados {
    public static Predicate<Contato> ContatoPredicado(String str) {
        return c -> c.getNome().equalsIgnoreCase(str) || c.getTelefone().equals(str);
    }
    public static Predicate<Filme> FilmePredicado(String str) {
        return f -> f.getNome().equalsIgnoreCase(str);
    }
    public static Predicate<String> TelefonePredicadoRegex() {
        return t->t.matches("^[0-9]{8,11}");
    }
    public static Predicate<String> EmailPredicadoRegex() {
        return t->t.matches("^[A-Za-z0-9_.]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,}$");
    }
}
