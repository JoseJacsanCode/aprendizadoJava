package exercicios.poo;

import java.util.Date;

public class TesteLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.titulo = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Jose";
    }
}
