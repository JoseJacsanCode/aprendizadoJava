package aprendizado;
import java.util.Locale;

public class ConcatenandoElementos {
	public static void main (String[] args) {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}

/*
%f = ponto flutuante
%d = inteiro
%s = texto
%n = quebra de linha
 */