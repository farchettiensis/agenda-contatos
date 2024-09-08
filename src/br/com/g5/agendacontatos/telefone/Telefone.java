package br.com.g5.agendacontatos.telefone;


public class Telefone {
    private TipoTelefone tipo;
    private String numero;

    public Telefone(String numero, TipoTelefone tipo) {
        this.numero = numero;
        this.tipo = tipo;
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
