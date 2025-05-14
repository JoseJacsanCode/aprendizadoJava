package aprendizado;

public class Main {
    public static void main(String[] args) {

        //Objeto 1
        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setIdade(16);
        System.out.println("Minha idade é de " + naruto.getIdade() + " anos");
        naruto.chackraInfinito();
        naruto.temBiju = true;
        naruto.ataqueBase();

        //Objeto 2
        Uchiha sasuke = new Uchiha();
    
        sasuke.sharinganAtivado();
        sasuke.ataqueBase();
        sasuke.ataqueBase(0);
    }
}