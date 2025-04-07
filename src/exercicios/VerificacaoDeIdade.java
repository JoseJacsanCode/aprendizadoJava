package exercicios;
import java.util.Scanner;

public class VerificacaoDeIdade {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        
        if(idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
        
        
        sc.close();
    }
}

/*
 * Escreva um programa que verifique se uma pessoa é maior de idade 
 * (idade >= 18). Se for, imprima "Maior de idade", caso contrário, imprima "Menor de idade".
 */