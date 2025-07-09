package poo;

public class TesteContato {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("José");
        //contato.setEndereco("Rua Venancio Costa");
        //contato.setTelefone("89 12345-9896");

        //Criar objeto Endereco
        //Relacionamento tem-um telefone
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Venancio Freitas");
        endereco.setNumero("n/a");
        endereco.setComplemento("Próximo a rua da frente");
        endereco.setCidade("Salvador");
        endereco.setEstado("Bahia");
        endereco.setCep("55890-841");

        contato.setEndereco(endereco);

        //Relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("83");
        telefone.setNumero("55890-8410");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("84");
        telefone2.setNumero("22223-8410");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        //Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());
        
        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if(contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() != null) {
            for(Telefone t : contato.getTelefones()) {
              System.out.println(t.getDdd() + " " + t.getNumero());   
            }
        }

    }
}
