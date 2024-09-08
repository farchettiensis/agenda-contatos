package br.com.g5.agendacontatos.contato;

import br.com.g5.agendacontatos.filme.Filme;
import br.com.g5.agendacontatos.telefone.Telefone;


import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private Telefone telefone;
    private List<Filme> listaFilmes = new ArrayList<>();

    public Contato(){}

    public Contato(String nome, String email, String endereco, Telefone telefone, Filme filme) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        listaFilmes.add(filme);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return this.telefone;
    }

    public String getNumeroTelefone(){
        return this.telefone.getNumero();
    }
    public String getTipoTelefone(){
        return this.telefone.getTipo().getDescricao();
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }


    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public void cadastrarFilme(Filme filme) {
        listaFilmes.add(filme);
    }


}