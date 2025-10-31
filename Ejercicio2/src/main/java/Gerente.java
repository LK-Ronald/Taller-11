public class Gerente extends Empleado{
    private double salarioMensual;

    public Gerente( double salarioMensual){
        this.salarioMensual = salarioMensual;
    }
    @Override
    public double calcularSalario() {
        return this.salarioMensual;
    }
}
