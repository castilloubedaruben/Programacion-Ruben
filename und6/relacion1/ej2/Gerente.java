public class Gerente extends Empleado {
    private final double BONIFICADOR = 1.6;

    public Gerente(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    public double calcularSueldo() {
        return sueldoBase * BONIFICADOR;
    }
}
