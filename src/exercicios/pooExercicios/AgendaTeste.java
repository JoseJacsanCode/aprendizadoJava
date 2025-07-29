package exercicios.pooExercicios;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda:");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda();

        Contato[] contatos = new Contato[3];
        for(int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato " + (i + 1));
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o e-mail");
            String email = scan.nextLine();
            c.setEmail(email);;

            contatos[i] = c;

        }

        agenda.setContato(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

        scan.close();
    }
}
