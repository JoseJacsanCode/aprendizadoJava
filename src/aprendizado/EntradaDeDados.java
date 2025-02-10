package aprendizado;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char c;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        c = sc.next().charAt(0);

        System.out.println("Palavra digitada: " + x);
        System.out.println("O número digitado foi: " + y);
        System.out.println("Número com casa decimal: " + z);

        //Número com duas casas após a vírgula
        System.out.printf("Número com casa decimal: %.2f%n", z); 

        System.out.println("A leta digitada foi: " + c);


        sc.close();
    }
}