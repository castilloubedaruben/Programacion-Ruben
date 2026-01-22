// 🔹 Ejercicio 2 – Bucle while
// Escribe un programa que pida al usuario un número secreto (entre 1 y 10).
// Después, el programa debe pedir al jugador que adivine el número hasta que lo consiga, mostrando un mensaje de “Intenta de nuevo” cuando falle.
// Cuando acierte, debe mostrar:

// ¡Correcto! Has adivinado el número.

package und4.Ejercicios.und1.Relacion4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numeroAdivinar;
        int intentoUsuario=0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indique un numero secreto para adivinar entre 1 y 10");
        numeroAdivinar=scanner1.nextInt();
        scanner1.close();

        while (numeroAdivinar!=intentoUsuario) {
            System.out.println("Elige un numero entre 1 y 10");
            intentoUsuario=scanner1.nextInt();
            if (numeroAdivinar!=intentoUsuario) {
                System.out.println("Intenta de nuevo");
            }
        }
        System.out.println("¡Correcto! Has adivinado el número.");
    }
}

