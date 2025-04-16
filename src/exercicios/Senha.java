package exercicios;
import java.util.Scanner;

public class Senha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int senha = 0;
    while(senha != 1234) {
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();
        if(senha == 1234) {
            System.out.println("Acesso liberado");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }

    sc.close();
  }
}

/*
O programa deve pedir uma senha 
até o usuário digitar a senha correta. 
A senha correta é 1234.

Digite a senha: 1111
Senha incorreta.
Digite a senha: 1234
Acesso liberado!
 */