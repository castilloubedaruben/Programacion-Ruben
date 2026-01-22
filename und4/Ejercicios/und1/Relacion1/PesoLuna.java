package und4.Ejercicios.und1.Relacion1;
// Calculadora de Peso en la Luna
// Pide el peso del usuario y calcula cuánto pesaría en la Luna (aproximadamente el 16.5% de su peso en la Tierra).

// let pesoEnLaTierra = prompt("Introduzca su peso: ")
// pesoEnLaTierra = Number(pesoEnLaTierra)

// let pesoEnLaLuna = pesoEnLaTierra * 0.165 // 16.5 / 100 = 0.165

// console.log("En la Luna pesarías: " + pesoEnLaLuna + "kg")

import java.util.Scanner;

public class PesoLuna {
    public static void main(String[] args) {
        // DECLARO VARIABLES COMO EN JS
        final double GRAVEDAD = 0.165;
        Scanner scanner1 = new Scanner(System.in);
        double pesoUsuario = 0;
        double pesoEnLaLuna = 0;
        
        // SIGO EL PROGRAMA CON LAS VARIABLES
        System.out.println("Introduce tu peso");
        pesoUsuario= scanner1.nextDouble();
        System.out.println("Tu peso es: " + pesoUsuario);
        pesoEnLaLuna = pesoUsuario * GRAVEDAD;
        scanner1.close();

        // %.2f sirva para poner decir la cantidad de decimales en la variable
        System.out.printf("Tu peso en la luna es de %.2f kgs", pesoEnLaLuna);
    }
}