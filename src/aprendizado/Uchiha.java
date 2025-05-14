package aprendizado;

public class Uchiha extends Ninja{
    public void sharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    @Override
    public void ataqueBase() {
        System.out.println("Sou um ninja e taquei uma kunai do elemento FOGO");
    }

    public void ataqueBase(int nivelDeChackra) {
        if(nivelDeChackra > 2) {
            System.out.println("Susanoo ativado");
        }
        else if (nivelDeChackra < 1) {
            System.out.println("Eu só consegui ativar o sharingan");
        }
        else {
            System.out.println("Eu tô sem chackra");
        }
    }

}   
