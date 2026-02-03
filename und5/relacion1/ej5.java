// Ejercicio 5: Clase Termómetro

// Crea una clase Termómetro con un atributo temperatura. 
// Agrega método convertirAFahrenheit().
package und5.relacion1;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Termometro termometro1 = new Termometro();
        Termometro termometro2 = new Termometro();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Indica una temperatura:");
        double temperaturaAConvertir = scanner1.nextDouble();
        termometro1.convertirAFahrenheit(temperaturaAConvertir);
        System.out.println(termometro1.convertirAFahrenheit(temperaturaAConvertir));
        System.out.println("Indica una segunda temperatura:");
        temperaturaAConvertir = scanner1.nextDouble();
        System.out.println(termometro2.convertirAFahrenheit(temperaturaAConvertir));
        scanner1.close();
    }
}

class Termometro {
    double temperatura;
    
    double convertirAFahrenheit(double temperatura) {
        double fahrenheit = (temperatura * 9 / 5) + 32;
        return fahrenheit;
    }

    @Override
    public String toString() {
        return "Temperatura convertira a Fahrenheit: " + temperatura;
    }
    
}