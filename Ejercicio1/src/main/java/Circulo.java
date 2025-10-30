public class Circulo extends Figura{
    private double radio;
    private final double PI = 3.141592;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * this.radio * this.radio;
    }
}
