package relacion1;
import java.util.ArrayList;
import java.util.Scanner;

// 1. Puntuaciones en una partida de bolos
// Escribe un programa que registre las puntuaciones de un jugador en 10 tiradas de bolos.
// El programa debe permitir:
// Guardar las 10 puntuaciones en un array.
// Mostrar un menú con opciones:
// Mostrar la puntuación más alta.
// Mostrar la puntuación más baja.
// Calcular la puntuación total.
// Calcular la media.
// Salir.
public class ejercicio1Repaso {

    public static void main(String[] args) {

        int putuacionAleatoria, opcionUsuario, puntuacionMasAlta;

        Scanner scanner1 = new Scanner(System.in);
        ArrayList<Integer> puntuaciones = new ArrayList<>();
        while (puntuaciones.size() < 10) {
            putuacionAleatoria = (int) (Math.random() * 11);
            puntuaciones.add(putuacionAleatoria);
        }
        System.out.println(puntuaciones);
        System.out.println("Elige una opcion:\n1:Mostrar puntuacion mas alta.\n2:Puntuacion mas baja\n3:Puntuacion total\n4:Puntuacion media\n5:Salir del programa");
        opcionUsuario = scanner1.nextInt();

        if (opcionUsuario == 1) {
            int puntuacionMaxima = puntuaciones.get(0);
            for (int puntuacion : puntuaciones) {
                if (puntuacion > puntuacionMaxima) {
                    puntuacionMaxima = puntuacion;
                }
            }
            System.out.println("La puntuación más alta es: " + puntuacionMaxima);

        } else if (opcionUsuario == 2) {
            int puntuacionMinima = puntuaciones.get(0);
            for (int puntuacion : puntuaciones) {
                if (puntuacion < puntuacionMinima) {
                    puntuacionMinima = puntuacion;
                }
            }
            System.out.println("La puntuación más baja es: " + puntuacionMinima);

        } else if (opcionUsuario == 3) {
            int total = 0;
            for (int puntuacion : puntuaciones) {
                total += puntuacion;
            }
            System.out.println("La puntuación total es: " + total);

        } else if (opcionUsuario == 4) {
            int puntosTotales = 0;
            for (int puntuacion : puntuaciones) {
                puntosTotales += puntuacion;
            }
            double media = (double) puntosTotales / puntuaciones.size();
            System.out.println("La media es: " + media);

        } else if (opcionUsuario == 5) {
            System.out.println("¡Hasta luego!");

        } else {
            System.out.println("Opción no válida, intenta de nuevo.");
        }
        scanner1.close ();
    }

}

