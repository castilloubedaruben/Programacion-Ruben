
package und4.Ejercicios.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej4Reparto {
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

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

    public static boolean confirmarTerrenoEnArray(ArrayList<String> array, String texto) {
        boolean encontrado = false;

        for (int i = 0; i < array.size() && !encontrado; i++) {
            if (array.get(i).equalsIgnoreCase(texto)) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static void mostrarArraysTractores(String mensaje, ArrayList<String> arrayTexto, ArrayList<Double> arrayValor, ArrayList<Double> arrayValor2,ArrayList<String> arrayTexto2) {
        imprimirMensaje(mensaje);

        for (int i = 0; i < arrayTexto.size(); i++) {
            System.out.println((i + 1) + " -> " + arrayTexto.get(i) + " | " + arrayValor.get(i) + "km | " + arrayValor2.get(i) + "L | Terreno:"+ arrayTexto2.get(i) );
        }
    }

        public static void eliminarPorIndiceTriple(String mensaje, ArrayList<?> array1, ArrayList<?> array2, ArrayList<?> array3, ArrayList<?> array4, Scanner sc) {
        if (array1.isEmpty()) {
            imprimirMensaje("Uno de los arrays está vacío");
        }
        int indiceUsuario = leerInt(mensaje, sc);

        while (indiceUsuario < 0 || indiceUsuario >= array1.size()) {
            imprimirMensaje("Indice incorrecto");
            indiceUsuario = leerInt(mensaje, sc);
        }

        array1.remove(indiceUsuario);
        array2.remove(indiceUsuario);
        array3.remove(indiceUsuario);
        array4.remove(indiceUsuario);
        imprimirMensaje("Eliminado correctamente");
}

    public static void main(String[] args) {
        ArrayList<String> tractores = new ArrayList<>();
        ArrayList<Double> km = new ArrayList<>();
        ArrayList<Double> litros = new ArrayList<>();
        ArrayList<String> terrenos = new ArrayList<>();

        ArrayList<String> terrenosDisponibles = new ArrayList<>(Arrays.asList("llano", "mixto", "montania"));
        Scanner scanner1 = new Scanner(System.in);

        boolean acabarPrograma = false;
        String nuevoTractor, nuevoTerreno,terrenoTractorACalcular;
        double kmViaje, litrosDisponibles;
        int opcionUsuario = -1, indiceUsuario;

        double gastoLlano = 0.12, gastoMixto=0.18, gastoMontaña=0.25;
        double calculoLitros,kmTractorACalcular,litrosTractorACalcular;
        
        final String MENU = "\nOPCIONES DISPONIBLES:\n1:Añadir ruta \n2:Listar rutas \n3: Calcular consumo \n4:Eliminar ruta \n0:Salir";
        final Integer MINIMOMENU = 0, MAXIMOMENU = 4;
        final String LLANO = "llano", MIXTO = "mixto", MONTAÑA = "montania";

        while (!acabarPrograma) {
            opcionUsuario = leerOpcionMenu(MENU, MINIMOMENU, MAXIMOMENU, scanner1);

            if (opcionUsuario == 1) {
                System.out.println("Introduce el tractor:");
                nuevoTractor = scanner1.nextLine();
                scanner1.nextLine();
                kmViaje = leerDouble("Introduce la distancia del viaje en km", scanner1);
                if (kmViaje <= 0) {
                    while (kmViaje <= 0) {
                        System.out.println("La distancia tiene que ser mayor que 0");
                        kmViaje = leerDouble("Introduce la distancia del viaje en km", scanner1);
                    }
                }
                litrosDisponibles = leerDouble("Introduce litros disponibles", scanner1);
                if (litrosDisponibles <= 0) {
                    while (litrosDisponibles <= 0) {
                        System.out.println("Los litros tienen que ser mayor que 0");
                        litrosDisponibles = leerDouble("Introduce litros disponibles", scanner1);
                    }
                }
                System.out.println("Elige un terreno (llano,mixto,montaña):");
                nuevoTerreno = scanner1.nextLine();
                while (!confirmarTerrenoEnArray(terrenosDisponibles, nuevoTerreno)) {
                    System.out.println("Terreno incorrecto! Elige un terreno (llano,mixto,montaña):");
                    nuevoTerreno = scanner1.nextLine();
                    confirmarTerrenoEnArray(terrenosDisponibles, nuevoTerreno);
                }
                tractores.add(nuevoTractor);
                km.add(kmViaje);
                litros.add(litrosDisponibles);
                terrenos.add(nuevoTerreno);
                scanner1.nextLine();
            } else if (opcionUsuario == 2) {
                if (tractores.isEmpty()) {
                    System.out.println("No hay rutas aun disponibles");
                } else {
                    mostrarArraysTractores("Rutas Registradas:", tractores, km, litros, terrenos);
                }
            } else if (opcionUsuario == 3) {
                indiceUsuario=leerInt("Introduce el indice de la ruta que quieres comprobar", scanner1);
                    if (indiceUsuario>tractores.size()-1 || indiceUsuario<0) {
                        while (indiceUsuario>tractores.size()-1 || indiceUsuario<0) {
                            System.out.println("Indice incorrecto");
                            indiceUsuario=leerInt("Introduce el indice de la ruta que quieres comprobar", scanner1);
                        }
                    }
                    kmTractorACalcular=km.get(indiceUsuario);
                    terrenoTractorACalcular=terrenos.get(indiceUsuario);
                    litrosTractorACalcular=litros.get(indiceUsuario);
                        if (terrenoTractorACalcular.equals(LLANO)) {
                            calculoLitros=kmTractorACalcular*gastoLlano;
                        } else if (terrenoTractorACalcular.equals(MONTAÑA)) {
                            calculoLitros=kmTractorACalcular*gastoMontaña;
                        } else {
                            calculoLitros=kmTractorACalcular*gastoMixto;
                        }
                        if (litrosTractorACalcular>calculoLitros) {
                            System.out.println("Viaje viable");
                        } else {
                            System.out.println("Viaje no viable, litros disponibles no son suficientes");
                        }
            } else if (opcionUsuario == 4) {
                eliminarPorIndiceTriple("Indique el indice que quieres eliminar", tractores, km, litros, terrenos, scanner1);
            } else if (opcionUsuario == 0) {
                acabarPrograma = true;
                System.out.println("Saliste del programa");
            }
        }
        scanner1.close();
    }
}