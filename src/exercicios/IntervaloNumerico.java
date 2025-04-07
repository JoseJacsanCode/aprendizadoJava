package exercicios;
import java.util.Scanner;

public class IntervaloNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if(numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0, 25]");
        }
        else if (numero >= 25 && numero <= 50) {
            System.out.println("Intervalo [25, 50]");
        }
        else if(numero >= 50 && numero <= 75) {
            System.out.println("Intervalo [50, 75]");
        }
        else if(numero >= 75 && numero <= 100) {
            System.out.println("Intervalo [75, 100]");
        }
        else {
            System.out.println("Fora do intervalo");
        }

        sc.close();
    }
}

/*
 * Crie um programa que leia um número e verifique em qual dos seguintes intervalos ele se encontra:

- [0, 25]: "Intervalo [0, 25]"  
- [25, 50]: "Intervalo [25, 50]"  
- [50, 75]: "Intervalo [50, 75]"  
- [75, 100]: "Intervalo [75, 100]"  
- Fora dos intervalos: "Fora de intervalo"
 */
