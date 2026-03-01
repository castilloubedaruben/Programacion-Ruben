package und5.zoologico;

import java.util.ArrayList;
import java.util.Scanner;
import und5.zoologico.Faker;

public class Main {

    /*
     * 
     * @param mensajeAMostrar
     */
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    /**
     * Lee un numero entero del usuario con control de errores
     *
     * @param mensaje Mensaje que se muestra al usuario
     * @param sc      Scanner ya creado en el main
     * @return numero entero valido introducido por el usuario Si esta funcion
     *         va con un control de errores de un parametro minimo y maximo debo
     *         pasarle
     *         los rangos como parametros
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
     * Lee una opcion valida de un menu
     *
     * @param mensaje Mensaje del menu a mostrar
     * @param min     Valor minimo permitido
     * @param max     Valor maximo permitido
     * @param sc      Scanner ya creado en el main
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

    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico("Selvo", new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        final int CANTIDADANIMALES = 10;

        for (int i = 0; i < CANTIDADANIMALES; i++) {
            zoologico.agregarAnimal(new Animal(Faker.nombreAnimal(), Faker.cantidadAnimal(), Faker.precio(5.00, 100.00)));
        }

        final String MENU = "\n===== GESTIÓN DE ZOOLOGICO =====:\n1:Mostrar animales\n2:Buscar animal por codigo\n3:Agregar ejemplares de un animal \n4:Retirar ejemplares de un animal \n5:Eliminar un animal \n6:Salir";
        boolean salirPrograma = false;
        int opcionUsuario = 0;

        while (!salirPrograma) {
            opcionUsuario = leerOpcionMenu(MENU, 1, 6, sc);
            if (opcionUsuario == 1) {
                for (Animal animal : zoologico.getAnimales()) {
                    imprimirMensaje(animal.toString());
                }
            } else if (opcionUsuario == 2) {
                imprimirMensaje("Indique el código del animal a buscar:");
                String codigoAnimalBuscar = sc.nextLine();
                Animal animalBuscar = zoologico.buscarAnimal(codigoAnimalBuscar);
                if (animalBuscar != null) {
                    imprimirMensaje(animalBuscar.toString());
                } else {
                    imprimirMensaje("Animal no encontrado.");
                }

            } else if (opcionUsuario == 3) {
                imprimirMensaje("Indique el código del animal:");
                String codigo = sc.nextLine();
                int cantidad = leerInt("Indique cantidad a añadir:", sc);
                if (zoologico.agregarEjemplares(codigo, cantidad)) {
                    imprimirMensaje("Ejemplares añadidos correctamente.");
                } else {
                    imprimirMensaje("Animal no encontrado.");
                }

            } else if (opcionUsuario == 4) {
                imprimirMensaje("Indique el código del animal:");
                String cod = sc.nextLine();
                int cant = leerInt("Indique cantidad a retirar:", sc);

                ArrayList<Boolean> controlErroresRetirarAnimales = zoologico.retirarEjemplares(cod, cant);

                if (!controlErroresRetirarAnimales.get(0)) {
                    imprimirMensaje("Animal no encontrado.");
                } else if (!controlErroresRetirarAnimales.get(1)) {
                    imprimirMensaje("No se puede retirar más ejemplares de los disponibles.");
                } else {
                    imprimirMensaje("Ejemplares retirados correctamente.");
                }
            } else if (opcionUsuario == 5) {
                imprimirMensaje("Indique el código del animal a eliminar:");
                String codigo = sc.nextLine();
                Animal animalAEliminar = zoologico.buscarAnimal(codigo);

                if (animalAEliminar == null) {
                    imprimirMensaje("Animal no encontrado.");
                } else if (animalAEliminar.getCantidad() > 0) {
                    imprimirMensaje("No se puede eliminar un animal con ejemplares disponibles.");
                } else {
                    zoologico.eliminarAnimal(codigo);
                    imprimirMensaje("Animal eliminado correctamente.");
                }
            } else {
                salirPrograma = true;
            }
        }
    }
}
