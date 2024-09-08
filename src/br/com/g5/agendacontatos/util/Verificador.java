package br.com.g5.agendacontatos.util;

import br.com.g5.agendacontatos.telefone.Telefone;

import java.util.List;
import java.util.function.Predicate;

public class Verificador {

    public static <T> boolean isDuplicado(List<T> lista, Predicate<T> predicado){
        for (T t : lista) {
            if (predicado.test(t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean isDuplicated(List<T> lista,T t) {
        return lista.stream().anyMatch(x->x.equals(t));
    }

    public static boolean emailIsValido(String email) {
        return email.matches("^[A-Za-z0-9_.]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,}$");
    }

}
