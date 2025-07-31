package poo;

public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }



    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = 6 * (lado * lado);
        return area;
    }

    @Override
    public double calcularVolume() {
       double volume = lado * lado * lado;
       return volume;
    }
    
}
