import java.awt.*;

public class Main{
    public static void main(String[] args) {
        //Figura figura = new Figura();

        Rectangulo rectangulo = new Rectangulo(5,6);
        rectangulo.mostrarArea();
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());

        Circulo circulo = new Circulo(5);
        circulo.mostrarArea();
        System.out.println("El area del circulo es: "+circulo.calcularArea());
    }
}