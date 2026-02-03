// Ejercicio 4: Clase Auto
// Crea una clase Auto con atributos marca, modelo y velocidadActual. 
// Agrega métodos acelerar(cantidad) y frenar(cantidad) que aumenten o reduzcan la velocidad actual.

package und5.relacion1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Auto coche1 = new Auto("BMV", "Serie 2", 150);
        Auto coche2 = new Auto("Mercedes", "Vito", 90);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indique una velocidad");
        
        int velocidadmodificar=scanner1.nextInt();
        coche1.acelerar(velocidadmodificar);
        System.out.println(coche1);
        coche1.frenar(velocidadmodificar);
        System.out.println(coche2);
        scanner1.close();
    }
}

class Auto {
    String marca;
    String modelo;
    int velocidadActual;

    Auto(String marca, String modelo, int velocidadActual) {
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=velocidadActual;
    }

    void acelerar(int cantidad) {
        velocidadActual+=cantidad;
    }

    void frenar(int cantidad) {
        velocidadActual-=cantidad;
    }

    @Override
    public String toString() {
        return "Coche: " + marca + " | Modelo: " + modelo + " | Velocidad actual: "+ velocidadActual;
    }

    
}