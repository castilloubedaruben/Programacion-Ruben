// Ejercicio 1: Clase Círculo
// Crea una clase Círculo con el atributo radio. 
// Agrega un método calcularArea() que retorne el área del círculo (π * radio²) y otro método calcularPerimetro() que retorne su perímetro (2 * π * radio).

package und5.relacion1;

public class ej1 {
    public static void main(String[] args) {
        Circulo primerEjemploCirculo = new Circulo(5.5);
        Circulo segundoEjemploCirculo = new Circulo(3.2);
        System.out.printf("El area del circulo es %.2f \n",primerEjemploCirculo.calcularArea());
        System.out.printf("El perimetro del circulo es %.2f",segundoEjemploCirculo.calcularPerimetro());
    }
}

class Circulo {
    double radio;
    final double PI = 3.1415;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        double resultado = PI * (this.radio * this.radio);
        return resultado;
    }

    public double calcularPerimetro() {
        double resultado = (2 * PI * this.radio);
        return resultado;
    }
}
