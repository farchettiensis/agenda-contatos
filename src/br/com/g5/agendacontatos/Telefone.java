package br.com.g5.agendacontatos;

import java.util.Scanner;

public class Telefone {
    private TipoTelefone tipo;
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
        setTipo();
    }

    public Telefone(String numero, TipoTelefone tipo) {
        this.numero = numero;
        this.tipo = getTipo();
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

    public void setTipo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo do telefone: \n" +
                "1 - Celular" +
                "2 - Casa" +
                "3 - Trabalho" +
                "4 - Escola" +
                "5 - Principal" +
                "6 - Outro");
        int escolhaTipoTelefone = sc.nextInt();

        this.tipo = TipoTelefone.values()[escolhaTipoTelefone - 1];
    }
}
