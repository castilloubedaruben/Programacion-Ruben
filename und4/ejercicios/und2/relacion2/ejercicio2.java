package relacion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int opcion=0, nuevaPuntuacion;
        boolean  SALIR = false;
        String nuevoJugador;
        Scanner scanner1=new Scanner(System.in);
        ArrayList<String> nombresJugadores = new ArrayList<>(Arrays.asList("Ruben","Juan","Pepe","Javi","Reda"));
        ArrayList<Integer> puntuacionesJugadores = new ArrayList<>(Arrays.asList(120,150,190,210,240));

        while (!SALIR) {
            System.out.println("Elige una opcion:\n1.Añadir un nuevo jugador y su puntuación\n2.Mostrar los jugadores y sus puntuaciones actuales\n3.Salir del programa");
            opcion=scanner1.nextInt();
            if (opcion==1) {
                System.out.println("Elige nombre de nuevo jugador:");
                scanner1.nextLine();
                nuevoJugador=scanner1.nextLine();
                System.out.println("Puntuacion del nuevo jugador:");
                nuevaPuntuacion=scanner1.nextInt();
                nombresJugadores.remove(0);
                puntuacionesJugadores.remove(0);
                nombresJugadores.add(nuevoJugador);
                puntuacionesJugadores.add(nuevaPuntuacion);
            } else if (opcion==2) {
                for (int i = 0; i < nombresJugadores.size(); i++) {
                    System.out.println("Jugador " + (i+1) + ": " + nombresJugadores.get(i) + " - Puntuacion: " + puntuacionesJugadores.get(i));
                }
            } else if (opcion==3) {
                SALIR=true;
            } else {
                System.out.println("Opcion no valida. Selecciona una opcion entre 1-3");
            }
        }
    }
}
