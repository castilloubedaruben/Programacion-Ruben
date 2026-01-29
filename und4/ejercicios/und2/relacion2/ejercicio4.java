// 4. Gestión de Inventario de una Librería
// Escribe un programa que permita al usuario gestionar el inventario de una librería. 
// El programa debe usar dos arrays: uno para almacenar los títulos de los libros y otro para almacenar las cantidades disponibles de cada libro. 
// El usuario debe poder realizar las siguientes acciones a través de un menú:
// Añadir un nuevo libro al inventario (con su título y cantidad).
// Actualizar la cantidad de un libro existente.
// Ver el inventario completo (título y cantidad de cada libro).
// Salir del programa
package relacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4 {

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

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

    public static int leerInt(String mensaje, Scanner sc) {
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                imprimirMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                if (numero < 0) {
                    imprimirMensaje("No se permiten numeros negativos");
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero entero valido");
            }
        }
        return numero;
    }

    public static boolean buscarString(ArrayList<String> array, String texto) {
        boolean encontrado = false;

        for (int i = 0; i < array.size() && !encontrado; i++) {
            if (array.get(i).equalsIgnoreCase(texto)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void mostrarArrayString(String mensaje, ArrayList<String> array) {
    imprimirMensaje(mensaje);

    for (int i = 0; i < array.size(); i++) {
        System.out.println("Libro " + (i + 1) + ": " + array.get(i));
    }
}

    public static void main(String[] args) {
        ArrayList<String> inventarioLibros = new ArrayList<>();
        ArrayList<Integer> unidadesInventarioLibros = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        boolean acabarPrograma = false;
        int opcionUsuario = 0, cantidadLibros, cantidadModificar;
        String nuevoLibro, libroModificar;

        final int OPCIONMINIMA = 1, OPCIONMAXIMA = 4;
        final String MENU = "\nElige una opcion:\n1:Añadir un nuevo libro al inventario \n2:Actualizar la cantidad de un libro existente. \n3:Ver el inventario completo \n4:Salir";
        final String AÑADIRCANTIDADLIBROS = "Cantidad de libros añadir al inventario";
        final String AÑADIRLIBRO = "Titulo de libro que quieres añadir";
        final String MODIFICARUNIDADES = "Seleccione unidades a modificar";

        while (!acabarPrograma) {
            opcionUsuario = leerOpcionMenu(MENU, OPCIONMINIMA, OPCIONMAXIMA, scanner1);
            if (opcionUsuario == 1) {
                imprimirMensaje(AÑADIRLIBRO);
                nuevoLibro = scanner1.nextLine();
                cantidadLibros = leerInt(AÑADIRCANTIDADLIBROS, scanner1);
                inventarioLibros.add(nuevoLibro);
                unidadesInventarioLibros.add(cantidadLibros);
                imprimirMensaje("Libro añadido correctamente al inventario");
            } else if (opcionUsuario == 2) {
                System.out.println("Dime un libro para modificar su cantidad en inventario");
                libroModificar = scanner1.nextLine();
                if (buscarString(inventarioLibros, libroModificar)) {
                    for (int i = 0; i < inventarioLibros.size(); i++) {
                        if (inventarioLibros.get(i).equalsIgnoreCase(libroModificar)) {
                            cantidadModificar=leerInt(MODIFICARUNIDADES, scanner1);
                            unidadesInventarioLibros.set(i, cantidadModificar);
                        }
                    }
                } else {
                    System.out.println("Libro no encontrado");
                }
            } else if (opcionUsuario == 3) {
                if (inventarioLibros.isEmpty()) {
                    System.out.println("Inventario vacio");
                } else {
                    mostrarArrayString("Inventario de libros", inventarioLibros);
                }
            } else if (opcionUsuario == 4) {
                acabarPrograma = true;
            }
        }
    }
}
