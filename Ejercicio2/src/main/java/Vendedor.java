public class Vendedor extends Empleado {
    private double salarioPorHora;
    private double horasTrabajadas;

    public Vendedor(double salarioPorHora, double  horasTrabajadas) {
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return this.salarioPorHora * this.horasTrabajadas;
    }
}
