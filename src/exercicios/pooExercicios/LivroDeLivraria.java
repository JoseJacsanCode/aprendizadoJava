package exercicios.pooExercicios;

public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "O Grande Conflito";
        livro.autor = "Ellen G. White";
        livro.preco = 70.80;
        livro.numPaginas = 560;
        livro.genero = "Religião";

        System.out.println(livro.autor);
    }
}

/*
 * Usando o resultado do exercício anterior como base, crie uma classe	
“LivroDeLivraria” que	represente	os	dados	básicos	de	um	livro que está à	
venda	em	uma	livraria.	
 */