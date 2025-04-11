package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class VerificarDesconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        
        if(valor > 100) {
            double desconto = valor * 0.10;
            double valorFinal = valor - desconto;
            System.out.printf("Valor com desconto: R$ %.2f%n", valorFinal); 
        }
        else {
            System.out.printf("Sem desconto, valor = R$ %.2f%n", valor);
        }

        sc.close();
    }
}

/*
Peça o valor da compra e verifique:

- Se for maior que 100, aplique 10% de desconto
    
- Se for menor ou igual a 100, sem desconto
 */