package exercicios;
import java.util.Scanner;

public class CompararDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        if(firstNum > secondNum) {
            System.out.println("O primeiro número é maior que o segundo");
        }
        else if(secondNum > firstNum) {
            System.out.println("O segundo número é maior que o primeiro");
        }
        else {
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}



//Leia dois números e diga qual é o maior, ou se são iguais.