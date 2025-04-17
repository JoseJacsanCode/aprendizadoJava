package exercicios;
import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = sc.nextInt();
        while(x >= 0) {
            System.out.println(x--);
        }


        sc.close();
    }    
}

/*
 * Peça um número inteiro positivo ao usuário e 
 * faça uma contagem regressiva até 0.
 * 
 * Digite um número: 5
    5
    4
    3
    2
    1
    0

 */