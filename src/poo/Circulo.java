package poo;

public class Circulo extends Figura2D{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        //A = pi * r^2
        double area = Math.PI * (raio * raio);
        return area;
    }

}
