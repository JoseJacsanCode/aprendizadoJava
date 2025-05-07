package exercicios;
import java.util.Scanner;

public class Senha_E_nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean infosValidas = false;
        String userName;
        String senha;

        do{
            System.out.println("Entre com o nome do usuário: ");
            userName = sc.next();

            System.out.println("Entre com a senha: ");
            senha = sc.next();

            if(userName.equalsIgnoreCase(senha)) {
                infosValidas = false;
                System.out.println("Senha igual ao usuário. Digite novamente");
            }
            else {
                infosValidas = true;
                System.out.println("Senha e usuário válidos");
            }
        }
        while (!infosValidas);


        sc.close();
    }
}
