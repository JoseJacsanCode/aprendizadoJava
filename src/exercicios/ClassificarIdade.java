package exercicios;
import java.util.Scanner;

public class ClassificarIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        if(idade >= 0 && idade <= 12) {
            System.out.println("Criança (0-12)");
        }
        else if(idade >= 13 && idade <= 17) {
            System.out.println("Adolescente (13-17)");
        }
        else if(idade >= 18 && idade <= 59) {
            System.out.println("Adulto (18-59)");
        }
        else {
            System.out.println("Idoso (60+)");
        }

        sc.close();
    }
}

/*
Peça a idade de uma pessoa e classifique:

- Criança (0-12)
    
- Adolescente (13-17)
    
- Adulto (18-59)
    
- Idoso (60+)
 */