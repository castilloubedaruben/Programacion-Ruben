
import java.util.ArrayList;
import java.util.Scanner;

public class pt2 {

    public static void main(String[] args) {
        final String DIENTE = "DIENTE";
        final int NUMDIENTES = 10, MAXDIENTESPICADOS = 2;
        final String DIENTESANO = "Sano", DIENTEDANIADO = "Dañado";
        final int DIENTESPICADOS = (int) (Math.random() * MAXDIENTESPICADOS) + 1;

        final int DIENTESNOPICADOS = NUMDIENTES - DIENTESPICADOS;
        final String JUGADOR1 = "Jugador 1", JUGADOR2 = "Jugador 2";

        Scanner scanner1 = new Scanner(System.in);
        boolean juegoPerdido = false;
        ArrayList<Integer> tableroInterno = new ArrayList<>();
        ArrayList<String> tableroVisible = new ArrayList<>();
        String jugadorActual = JUGADOR1;
        String mensajeFinPrograma = "Enhorabuena, ambos ganan";
        int posicionSeleccionada = 0;
        int dientesPicadosIntroducidos = 0;
        int posicionDienteIntroducir = 0;

        for (int i = 0; i < NUMDIENTES; i++) {
            tableroInterno.add(0);
        }

        while (dientesPicadosIntroducidos < DIENTESPICADOS) {
            posicionDienteIntroducir = (int) (Math.random() * NUMDIENTES);
            if (tableroInterno.get(posicionDienteIntroducir) == 0) {
                tableroInterno.set(posicionDienteIntroducir, 1);
                dientesPicadosIntroducidos++;
            }
        }
        for (int i = 0; i < NUMDIENTES; i++) {
            tableroVisible.add(DIENTE);
        }

        for (int i = 0; i < DIENTESNOPICADOS && !juegoPerdido; i++) {
            do {
                try {
                    System.out.println("Introduce un numero entero");
                    System.out.println(jugadorActual+" elige: ");
                    posicionSeleccionada=Integer.parseInt(scanner1.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: debes introducir un numero entero");
                }
        } while (tableroVisible.get(posicionSeleccionada) != DIENTE || (posicionSeleccionada < 0 || posicionSeleccionada > NUMDIENTES));


            if (tableroInterno.get(posicionSeleccionada)== 0) {
                tableroVisible.set(posicionSeleccionada, DIENTESANO);
            } else {
                tableroVisible.set(posicionSeleccionada, DIENTEDANIADO);
                mensajeFinPrograma = "¡El cocodrilo mordió! " + jugadorActual + " pierde.";
                System.out.println(mensajeFinPrograma);
                juegoPerdido = true;
            }
            System.out.println(tableroVisible);

            if (jugadorActual == JUGADOR1) {
                jugadorActual = JUGADOR2;
            } else {
                jugadorActual = JUGADOR1;
            }
        }
    }
}
