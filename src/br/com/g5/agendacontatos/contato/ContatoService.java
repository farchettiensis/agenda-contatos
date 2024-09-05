package br.com.g5.agendacontatos.contato;

import br.com.g5.agendacontatos.telefone.Telefone;
import br.com.g5.agendacontatos.telefone.TelefoneService;

import java.util.Scanner;

public class ContatoService extends  Contato{
    TelefoneService telefoneService = new TelefoneService();


    public Contato requisitarContatoNoTerminal() {
        Contato contato = new Contato();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        contato.setNome(sc.nextLine());
        contato.setTelefone(telefoneService.requisitarTelefoneNoTerminal());
        System.out.println("Digite o endereço: ");
        contato.setEndereco(sc.nextLine());
        System.out.println("Digite o e-mail: ");
        contato.setEmail(sc.nextLine());


            System.out.println("Contato salvo com sucesso");
            return  contato;
    }


    public void detalharContato(Contato contato) {
        StringBuilder sb = new StringBuilder();
        sb.append("Contato {")
                .append("\n  Nome: ").append(contato.getNome())
                .append("\n  Email: ").append(contato.getEmail())
                .append("\n  Endereço: ").append(contato.getEmail())
                .append("\n  Telefone: ").append(contato.getNumeroTelefone())
                .append("\n}");

        System.out.println(sb);
    }

}
