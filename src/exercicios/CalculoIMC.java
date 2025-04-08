package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class CalculoIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double IMC = peso / (altura * altura);
        if(IMC <= 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if(IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        }
        else if(IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Risco de obesidade");
        }

        sc.close();
        
    }
}

/*
 * Escreva um programa que leia o peso e a altura de uma pessoa e calcule seu IMC (Índice de Massa Corporal) usando a fórmula `IMC = peso / (altura * altura)`. Em seguida, classifique o IMC conforme a tabela abaixo:  
- Abaixo de 18.5: "Abaixo do peso"  
- Entre 18.5 e 24.9: "Peso normal"  
- Entre 25 e 29.9: "Sobrepeso"
 */