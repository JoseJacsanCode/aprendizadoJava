package aprendizado;

public class CondicionalTernaria {
    public static void main(String[] args) {
        double preco = 34.5;
        //double desconto;

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

        // if(preco < 20.0) {
        //     desconto = preco * 0.1;
        // }
        // else {
        //     desconto = preco * 0.05;
        // }

        // System.out.println(desconto);
    }

}
