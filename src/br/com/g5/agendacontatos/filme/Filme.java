package br.com.g5.agendacontatos.filme;

public class Filme {
    private String nome;
    private Double nota;

    public Filme(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome+", "+(nota!=null?nota:"N/A")+"\u2605";  //"\u2605" = unicode pra ★
    }
}
