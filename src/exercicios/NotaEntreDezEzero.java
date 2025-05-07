package exercicios;
import java.util.Scanner;

public class NotaEntreDezEzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com uma nota");
        double nota = sc.nextDouble();

        boolean notaValida = false;

        do {
            if(nota >= 0 && nota <= 10) {
                System.out.println("Nota válida");
                notaValida = true;
            }
            else {
                notaValida = false;
                System.out.println("Nota inválida. Digite novamente: ");
                nota = sc.nextDouble();
            }
        } while (!notaValida);


        sc.close();
    }
}