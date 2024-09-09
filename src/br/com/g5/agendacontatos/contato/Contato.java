package br.com.g5.agendacontatos.contato;

import br.com.g5.agendacontatos.Filme;
import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.util.Predicados;
import br.com.g5.agendacontatos.util.Verificador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private Telefone telefone;
    private String chavePix;
    private List<Filme> listaFilmes = new ArrayList<>();

    public Contato(){}

    public Contato(String nome) {
        this.nome = nome;
    }

    public Contato(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato(String nome,
                   Telefone telefone,
                   String endereco,
                   String email,
                   String chavePix
    ) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
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

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String detalharContato() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Nome: %s.%n", this.getNome()));
        sb.append(String.format("Telefone: %s.%n", this.getTelefone().getNumero()));
        sb.append(String.format("Endereço: %s.%n", this.getEndereco()));
        sb.append(String.format("Email: %s.%n", this.getEmail()));
        sb.append(String.format("Chave PIX: %s.%n", this.getChavePix()));
        sb.append(String.format((this.listarFilmes())));

        return sb.toString();
    }

    public Contato setContato() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(sc.nextLine());
        System.out.println("Digite o telefone: ");
        String telefoneContato = sc.nextLine();

        Telefone telefone = new Telefone(telefoneContato);
        setTelefone(telefone);


        System.out.println("Digite o endereço: ");
        setEndereco(sc.nextLine());
        System.out.println("Digite o e-mail: ");
        setEmail(sc.nextLine());

        System.out.println("Digite a chave PIX: ");
        setChavePix(sc.nextLine());

        return this;
    }

    public String listarFilmes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Filmes: ");
        for (Filme filme : this.listaFilmes) {
            sb.append(filme+String.format("%-5s"," "));
        }
        if (listaFilmes.isEmpty()) {
            sb.append("lista vazia!");
        }
        return sb.toString();
    }

    public void cadastrarFilme(Filme filme) {
        if (!Verificador.isDuplicado(this.listaFilmes, Predicados.FilmePredicado(filme.getNome()))) {
            listaFilmes.add(filme);
        } else {
            throw new IllegalArgumentException("Filme já se encontra na lista");
        }
    }

    public void darNotaFilme(Filme filme, Double nota) {
        boolean encontrado = false;
        for (Filme f : listaFilmes) {
            if (f.getNome().equalsIgnoreCase(filme.getNome())) {
                f.setNota(nota);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("Filme não encontrado na lista");
        }
    }
    /*
    private boolean isFilmeDuplicado(Filme filme) {
        for (Filme f : this.listaFilmes) {
           if  (f.getNome().equalsIgnoreCase(filme.getNome())) {
               return true;
           }
        }
        return false;
    }*/
}