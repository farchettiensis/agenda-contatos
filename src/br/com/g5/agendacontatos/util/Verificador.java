package br.com.g5.agendacontatos.util;

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
}
