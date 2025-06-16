package exercicios.poo;

public class TesteContatoDaAgenda {
    public static void main(String[] args) {
        ContatoDaAgenda contato1 = new ContatoDaAgenda();
        contato1.nome = "Rodrigo Alves";
        contato1.endereco = "Av. Rio Branco, 1000";
        contato1.email = "rodrigoalves@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "95 28356-4587";
        contato1.telefones[1] = "89 11141-55587";
        contato1.telefones[2] = "81 44445-77777";
    }
}
