package und4.Ejercicios.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej1TractoMatch {

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static void mostrarMenu() {
        System.out.println(
                "\nOPCIONES DISPONIBLES:\n1:Añadir tractor \n2:Listar tractores \n3:Evaluar tractor \n4:Eliminar tractor\n0:Salir");
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

    public static int leerOpcionMenu(int min, int max, Scanner sc) {
        int opcion;
        boolean correcta = false;

        do {
            opcion = leerInt("Elige una opcion:", sc);

            if (opcion >= min && opcion <= max) {
                correcta = true;
            } else {
                imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
            }
        } while (!correcta);
        return opcion;
    }

    public static void mostrarCaracteristicasTractores(String mensaje, ArrayList<String> arrayTexto,
            ArrayList<Integer> arrayValor, ArrayList<String> arraytexto2) {
        imprimirMensaje(mensaje);

        for (int i = 0; i < arrayTexto.size(); i++) {
            System.out.println((i + 1) + " -> " + arrayTexto.get(i) + " | " + arrayValor.get(i) + "CV | trabajo: "
                    + arraytexto2.get(i));
        }
    }

    public static boolean confirmarTractorEliminar(ArrayList<String> array, String texto) {
        boolean encontrado = false;

        for (int i = 0; i < array.size() && !encontrado; i++) {
            if (array.get(i).equalsIgnoreCase(texto)) {
                encontrado = true;
            }
        }
        return encontrado;
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

    public static void main(String[] args) {
        ArrayList<String> marcasTractores = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ArrayList<Integer> potenciaTractores = new ArrayList<>(Arrays.asList(120, 60, 95, 85));
        ArrayList<String> trabajos = new ArrayList<>(Arrays.asList("arado", "siembra", "transporte", "arado"));
        Scanner scanner1 = new Scanner(System.in);

        String nuevoTractor, trabajo, eliminarTractor, tractorEvaluar="", trabajoDeTractorEvaluar = "";
        int potenciaTractor, opcionUsuario, potenciaTractorEvaluar = 0;
        boolean salir = false, encontrado=false;
        final int OPCIONMINIMAMENU = 0, OPCIONMAXIMAMENU = 4, MINIMAPOTENCIA = 0;
        final String ARADO = "arado", SIEMBRA = "siembra", TRANSPORTE = "transporte";

        while (!salir) {
            mostrarMenu();
            opcionUsuario = leerOpcionMenu(OPCIONMINIMAMENU, OPCIONMAXIMAMENU, scanner1);
            if (opcionUsuario == 1) {
                System.out.println("Marca del tractor:");
                nuevoTractor = scanner1.nextLine();
                System.out.println("Trabajo del tractor:");
                trabajo = scanner1.nextLine();
                    while (!trabajo.equals(ARADO) && !trabajo.equals(SIEMBRA) && !trabajo.equals(TRANSPORTE)) {
                        System.out.println("Unicos trabajos permitidos son: siembra, arado, transpote");
                        System.out.println("Trabajo del tractor:");
                        trabajo = scanner1.nextLine();
                    }
                trabajos.add(trabajo);

                potenciaTractor = leerInt("Potencia del tractor:", scanner1);
                if (potenciaTractor > MINIMAPOTENCIA) {
                    marcasTractores.add(nuevoTractor);
                    potenciaTractores.add(potenciaTractor);
                    
                } else {
                    System.out.println("\nDatos introducidos no validos! Tractor no guardado en la base de datos");
                }

            } else if (opcionUsuario == 2) {
                if (marcasTractores.isEmpty()) {
                    System.out.println("\nNo se han guardado datos aún");
                } else {
                    mostrarCaracteristicasTractores("Listado Tractores", marcasTractores, potenciaTractores, trabajos);
                }
            } else if (opcionUsuario == 3) {
                while (!encontrado) {
                    System.out.println("Indica el tractor que quieres evaluar:");
                    tractorEvaluar = scanner1.nextLine();
                    if (buscarString(marcasTractores, tractorEvaluar)) {
                        for (int i = 0; i < marcasTractores.size(); i++) {
                            if (marcasTractores.get(i).equalsIgnoreCase(tractorEvaluar)) {
                                trabajoDeTractorEvaluar = trabajos.get(i);
                                potenciaTractorEvaluar = potenciaTractores.get(i);
                            }
                        }
                        encontrado=true;
                    } else {
                        System.out.println("Tractor indicado no encontrado");
                    }
                    
                }
                if ((trabajoDeTractorEvaluar.equals("arado") && potenciaTractorEvaluar >= 120)
                        || (trabajoDeTractorEvaluar.equals("transporte") && potenciaTractorEvaluar >= 90)
                        || (trabajoDeTractorEvaluar.equals("siembra") && potenciaTractorEvaluar >= 70)) {
                    System.out.println(tractorEvaluar + " potencia: " + potenciaTractorEvaluar + " y trabajo: "
                            + trabajoDeTractorEvaluar + " es APTO");
                } else {
                    System.out.println(tractorEvaluar + " potencia: " + potenciaTractorEvaluar + " y trabajo: "
                            + trabajoDeTractorEvaluar + " es NO APTO");
                }
            } else if (opcionUsuario == 4) {
                System.out.println("Que tractor deseas eliminar");
                eliminarTractor = scanner1.nextLine();
                if (confirmarTractorEliminar(marcasTractores, eliminarTractor)) {
                    for (int i = 0; i < marcasTractores.size(); i++) {
                        if (marcasTractores.get(i).equalsIgnoreCase(eliminarTractor)) {
                            marcasTractores.remove(i);
                            potenciaTractores.remove(i);
                            trabajos.remove(i);
                        }
                    }
                    System.out.println("Eliminado con exito");
                } else {
                    System.out.println("Tractor indicado no encontrado");
                }
            } else if (opcionUsuario == 0) {
                salir = true;
            }
        }
    }
}
