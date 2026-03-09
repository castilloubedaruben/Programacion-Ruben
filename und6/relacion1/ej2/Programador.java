public class Programador extends Empleado {
    private final double BONIFICADOR = 1.4;
    public Programador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    
    public double calcularSueldo() {
        return sueldoBase*BONIFICADOR;
    }
}
