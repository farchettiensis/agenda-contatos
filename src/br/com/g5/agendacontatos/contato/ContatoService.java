package br.com.g5.agendacontatos.contato;

import br.com.g5.agendacontatos.filme.FilmeService;
import br.com.g5.agendacontatos.telefone.TelefoneService;
import br.com.g5.agendacontatos.util.Verificador;

import java.util.List;
import java.util.Scanner;

public class ContatoService extends  Contato{
    TelefoneService telefoneService = new TelefoneService();
    FilmeService filmeService = new FilmeService();

    public Contato requisitarContatoNoTerminal (List<Contato> contatos) {
        Contato contato = new Contato();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            contato.setNome(sc.nextLine());
            contato.setTelefone(telefoneService.requisitarTelefoneNoTerminal(contatos));
            System.out.println("Digite o endereço: ");
            contato.setEndereco(sc.nextLine());
            System.out.println("Digite o e-mail: ");
            String email = sc.nextLine();
            while (!Verificador.emailIsValido(email)) {
                System.out.print("Formato de email inválido, tente novamente: ");
                email = sc.nextLine();
            }
            contato.setEmail(email);
            System.out.println("Contato salvo com sucesso");
        } catch (Exception e) {
            System.out.println("Erro interno de sistema. Tente novamente.");
        }
        return contato;
    }

    public void detalharContato(Contato contato) {
        String sb = "Contato {" +
                "\n  Nome: " + contato.getNome() +
                "\n  Email: " + contato.getEmail() +
                "\n  Endereço: " + contato.getEndereco() +
                "\n  Telefone: " + contato.getNumeroTelefone() +
                "\n  Tipo de telefone: " + contato.getTipoTelefone() +
                "\n  Filmes: " + contato.getListaFilmes() +
                "\n}";
        System.out.println(sb);
    }

    public void adicionarFilmeEmContato(Contato contato) {
        contato.cadastrarFilme(filmeService.requisitarFilmeNoTerminal(contato.getListaFilmes()));
    }

}
