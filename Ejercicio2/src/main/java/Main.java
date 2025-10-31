public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(2000);
        System.out.println("Salario del gerente: "+gerente.calcularSalario());
        gerente.mostrarDetalles();

        Vendedor vendedor = new Vendedor(1.5, 20);
        System.out.println("Salario del vendedor: "+vendedor.calcularSalario());
        vendedor.mostrarDetalles();
    }
}
