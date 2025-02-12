package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NÚMERO = " + numeroFuncionario);
        System.out.printf("SALÁRIO = U$ %.2f%n", salario);


        sc.close();
    }
}

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por
 * hora e calcule o salário desse funcionário. A seguir, mostre o número e o salário do
 * funcionário, com duas casas
 * decimais.
 * 
 * Entrada:
 * 25
 * 100
 * 5.50
 * Saída:
 * NÚMERO = 25
 * SALÁRIO = U$ 550.00
 * 
 * Entrada:
 * 1
 * 200
 * 20.50
 * Saída:
 * NÚMERO = 1
 * SALÁRIO = U$ 4100.00
 * 
 * Entrada:
 * 6
 * 145
 * 15.55
 * Saída:
 * NÚMERO = 6
 * SALÁRIO = U$ 2254.75
 */