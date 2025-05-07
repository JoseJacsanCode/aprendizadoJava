package aprendizado;

public class LoopFor {
    public static void main(String[] args) {

        //Comando "for" padrão
        for(int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println("");

        for(int i = 5; i > 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        //Comando "for" com duas variáveis
        for(int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        //"for" com partes ausentes
        int count = 0;
        for(; count < 10;) {
            System.out.println("Valor de count: " + count);
            count += 2;
        }

        //Seria o mesmo que:
        for(int cont = 0; cont < 10; cont += 2) {
            System.out.println("Valor de cont: " + cont);
        }

    }
}
