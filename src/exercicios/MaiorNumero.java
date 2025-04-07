package exercicios;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva dois números:");
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();

        if(primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        }
        else {
            System.out.println("Os números são diferentes");
        }

        sc.close();
    }
}

/*
Escreva um programa que leia dois números e imprima o maior deles. Se os números forem iguais, imprima "Os números são iguais". Se não, imprima "Os números são diferentes"
 */