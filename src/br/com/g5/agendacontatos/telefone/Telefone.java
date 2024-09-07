package br.com.g5.agendacontatos.telefone;

import java.util.Scanner;

public class Telefone {
    private TipoTelefone tipo;
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public Telefone(String numero, TipoTelefone tipo) {
        this.numero = numero;
        this.tipo = getTipo();
    }

    public Telefone() {
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(int opcao) {
        this.tipo = TipoTelefone.values()[opcao - 1];
    }

}
