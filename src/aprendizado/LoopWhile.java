package aprendizado;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até 10");
        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println("Valor final de i: " + i);
    }
}
