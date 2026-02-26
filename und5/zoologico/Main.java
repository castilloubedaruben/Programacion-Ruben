package und5.zoologico;

import java.util.ArrayList;
import java.util.Scanner;

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
        Animal animal1 = new Animal(Faker.animales(), Faker.entero(1, 20), Faker.precio(5.00, 50.00));
        Animal animal2 = new Animal(Faker.animales(), Faker.entero(1, 20), Faker.precio(5.00, 50.00));
        Animal animal3 = new Animal(Faker.animales(), Faker.entero(1, 20), Faker.precio(5.00, 50.00));
        Zoologico zoologico = new Zoologico("Selvo", "Malaga", 500, "09-20", new ArrayList<>());

        zoologico.agregarAnimal(animal1);
        zoologico.agregarAnimal(animal2);
        zoologico.agregarAnimal(animal3);

        Scanner sc = new Scanner(System.in);
        final String MENU = "\nOpciones:\n1:Mostrar animales\n2:Buscar animal por codigo\n3:Agregar ejemplares de un animal \n4:Retirar ejemplares de un animal \n5:Eliminar un animal \n6:Salir";
        boolean salirPrograma = false;
        int opcionUsuario = 0;

        while (!salirPrograma) {
                opcionUsuario=leerOpcionMenu(MENU, 1, 6, sc);
            if (opcionUsuario == 1) {
                zoologico.mostrarAnimales("Animales disponibles");
            } else if (opcionUsuario == 2) {
                // System.out.println("Indique el codigo del animal a buscar");
                // String codigoAnimalBuscar=sc.nextLine();
                // Animal animalEncontrado;
                // if (zoologico.buscarAnimal(codigoAnimalBuscar)) {
                //     for (int i = 0; i < zoologico.getAnimales().size(); i++) {
                //         animales.get(i).getCodigo.equalsIgnoreCase(codigoAnimalBuscar);
                //         animalEncontrado=zoologico.getAnimales().get(i);
                //     }
                // } else {
                //     System.out.println("Animal no encontrado");
                // }
                
            } else if (opcionUsuario == 3) {
                System.out.println("Indique el codigo del animal a buscar");
                String codigoAnimalBuscar=sc.nextLine();
                int cantidad=leerInt("Indique la cantidad a añadir", sc);
                if (zoologico.agregarEjemplares(codigoAnimalBuscar, cantidad)) {
                    System.out.println(cantidad + " animales añadidos correctamente");
                } else {
                    System.out.println("No se han podido añadir animales");
                }
                
            } else if (opcionUsuario == 4) {

            } else if (opcionUsuario == 5) {

            } else {
                salirPrograma = true;
            }
        }
    }
}
