package apuntes;

import java.util.ArrayList;
import java.util.Scanner;

public class funciones {

    /*
     * 
     * @param mensajeAMostrar
     */
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static void leerStringArray(String mensajeString, ArrayList<String> array, Scanner sc) {
        String stringUsuario;
        do {
            imprimirMensaje(mensajeString);
            stringUsuario = sc.nextLine();
        } while (aniadirSinDuplicados(stringUsuario, array));
    }


    /**
     * Rellena array con un elemento que le pasemos
     * 
     * @param arrayIntroducida array del tablero
     * @param tamanio          tamaño del tablero
     * @param simbolo          con que se va a rellenar el tablero, puede ser numero
     *                         pero cambiar valor String por Int o Double
     */
    public static void construyeTablero(ArrayList<String> arrayIntroducida, int tamanio, String simbolo) {
        for (int i = 0; i < tamanio; i++) {
            arrayIntroducida.add(simbolo);
        }
    }

    /**
     * Coloca los numeros aleatoriamente en un tablero de posiciones
     * 
     * @param arrayOculta Tablero 
     * @param minimo      Mínimo introducido posible de algo
     * @param maximo      Máximo introducido posible de algo
     */
    public static void randomizaTablero(ArrayList<String> arrayOculta, int minimo,
            int maximo) {
        final int CANTIDAD = (int) (Math.floor(Math.random() * (maximo - minimo + 1))
                + minimo);
        int contador = 0;
        int posicion;
        while (contador != CANTIDAD) {
            posicion = (int) (Math.floor(Math.random() * (arrayOculta.size())));

            // Si la posicion randomizada no tiene el elemento, añade elemento
            if (arrayOculta.get(posicion).equals("0")) {
                arrayOculta.set(posicion, "1");
                contador++;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\nElige una opcion:\n1: \n2: \n3: \n4: \n5:");
    }


//================================================================ CONTROL DE ERRORES ==============================================================

/**
 * Lee un numero entero del usuario con control de errores
 * 
 * @param mensaje Mensaje que se muestra al usuario
 * @param sc Scanner ya creado en el main
 * @return numero entero valido introducido por el usuario
 */
public static int leerInt(String mensaje, Scanner sc) {
    int numero = 0;
    boolean correcto = false;

    while (!correcto) {
        try {
            imprimirMensaje(mensaje);
            numero = Integer.parseInt(sc.nextLine());
            correcto = true;
        } catch (NumberFormatException e) {
            imprimirMensaje("Error: introduce un numero entero valido");
        }
    }
    return numero;
}

/**
 * Lee un numero decimal del usuario con control de errores
 * 
 * @param mensaje Mensaje que se muestra al usuario
 * @param sc Scanner ya creado en el main
 * @return numero double valido introducido por el usuario
 */
public static double leerDouble(String mensaje, Scanner sc) {
    double numero = 0;
    boolean correcto = false;

    while (!correcto) {
        try {
            imprimirMensaje(mensaje);
            numero = Double.parseDouble(sc.nextLine());
            correcto = true;
        } catch (NumberFormatException e) {
            imprimirMensaje("Error: introduce un numero decimal valido");
        }
    }
    return numero;
}

/**
 * Lee una opcion valida de un menu
 * 
 * @param mensaje Mensaje del menu a mostrar
 * @param min Valor minimo permitido
 * @param max Valor maximo permitido
 * @param sc Scanner ya creado en el main
 * @return opcion valida elegida por el usuario
 */
public static int leerOpcionMenu(String mensaje, int min, int max, Scanner sc) {
    int opcion;
    boolean correcta = false;

    do {
        imprimirMensaje(mensaje);
        opcion = leerInt("Elige una opcion:", sc);

        if (opcion >= min && opcion <= max) {
            correcta = true;
        } else {
            imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
        }
    } while (!correcta);
    return opcion;
}

    /**
     * Añade a un array comprobando si esta duplicado
     */
    public static boolean aniadirSinDuplicados(String posibleDuplicado, ArrayList<String> array) {
        boolean duplicadosEncontrado = false;

        for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
            if (array.get(i).equalsIgnoreCase(posibleDuplicado)) {
                duplicadosEncontrado = true;
            }
        }
        if (!duplicadosEncontrado) {
            array.add(posibleDuplicado);
        } else {
            imprimirMensaje("No se añade " + posibleDuplicado + " ya que está en el array");
        }
        return duplicadosEncontrado;
    }
    

// ====================================================== BUSCAR EN ARRAYLIST =====================================================================

/**
 * Elegir elemento aleatorio de un ArrayList
 * 
 * @param array Array donde se elige el elemento aleatorio
 */
public static String elementoAleatorio(ArrayList<String> array) {
    int posicion;
    String elemento;

    posicion = (int) (Math.random() * array.size());
    elemento = array.get(posicion);
    
    return elemento;
}

/**
 * Buscar un int en un ArrayList<Integer>
*/
public static boolean buscarEntero(ArrayList<Integer> array, int numero) {
    boolean encontrado = false;

    for (int i = 0; i < array.size() && !encontrado; i++) {
        if (array.get(i) == numero) {
            encontrado = true;
        }
    }
    return encontrado;
}

/**
 * Busca un String en un ArrayList
 * 
 * @param array ArrayList de Strings donde buscar
 * @param texto String a buscar
 * @return true si se encuentra, false si no
 */
public static boolean buscarString(ArrayList<String> array, String texto) {
    boolean encontrado = false;

    for (int i = 0; i < array.size() && !encontrado; i++) {
        if (array.get(i).equalsIgnoreCase(texto)) {
            encontrado = true;
        }
    }
    return encontrado;
}

// ====================================================== RELLENAR ARRAYLIST =====================================================================

/**
 * Rellenar un ArrayList con números aleatorios
 * 
 * @param array el array a rellenar
 * @param tamanio tamaño maximo del array
 * @param minimo numero minimo del aleatorio
 * @param maximo numero maximo del aleatorio
 */
public static void rellenarArrayRandom(ArrayList<Integer> array, int tamanio, int minimo, int maximo) {
    int numero;

    for (int i = 0; i < tamanio; i++) {
        numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
        array.add(numero);
    }
}

/**
 * Rellenar ArrayList con números aleatorios sin repetir
 * 
 * @param array el array a rellenar
 * @param tamanio tamaño maximo del array
 * @param minimo numero minimo del aleatorio
 * @param maximo numero maximo del aleatorio
 */
public static void rellenarArrayRandomSinRepetir(ArrayList<Integer> array, int tamanio, int minimo, int maximo) {
    int numero;

    while (array.size() < tamanio) {
        numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;

        if (!array.contains(numero)) {
            array.add(numero);
        }
    }
}

}
