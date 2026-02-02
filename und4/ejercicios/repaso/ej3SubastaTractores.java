package und4.ejercicios.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ej3SubastaTractores {
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static void mostrarMenu() {
        System.out.println("\nOPCIONES:\n1:Añadir lote \n2:Listar lotes \n3:Hacer puja \n4:Ver ganador actual\n5:Eliminar lote\n0:Salir");
    }

    public static void listarLotes(String mensaje, ArrayList<String> arrayTexto, ArrayList<Integer> arrayValor, ArrayList<Integer> arrayValor2,ArrayList<String> arrayTexto2) {
        imprimirMensaje(mensaje);

        for (int i = 0; i < arrayTexto.size(); i++) {
            System.out.println((i) + "-> " + arrayTexto.get(i) + " | Puja inicial: " + arrayValor.get(i) + " | Mejor puja: " + arrayValor2.get(i) + " | Mejor postor: " + arrayTexto2.get(i));
        }
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
    public static void main(String[] args) {
        ArrayList<String> Modelo = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<Integer> PrecioInicial = new ArrayList<>(Arrays.asList(1000, 1600, 500));
        ArrayList<Integer> MejorPuja = new ArrayList<>(Arrays.asList(0, 0, 0));
        ArrayList<String> MejorPostor = new ArrayList<>(Arrays.asList("NADIE", "NADIE", "NADIE", "NADIE"));
        Scanner scanner1 = new Scanner(System.in);
    
        String nuevoModelo, mejorPostor="NADIE", nuevoPostor;
        int NuevoPrecioInicial, mejorPuja=0, nuevaPuja, opcionUsuario=-1, elegirIndice;
        boolean acabarPrograma = false;
        
        while (!acabarPrograma) {
            mostrarMenu();
            opcionUsuario=leerOpcionMenu(0, 5, scanner1);
            if (opcionUsuario==1) {
                System.out.println("Introduce el modelo:");
                nuevoModelo=scanner1.nextLine();
                Modelo.add(nuevoModelo);
                NuevoPrecioInicial=leerInt("Introduce el precio inicial", scanner1);
                    while (NuevoPrecioInicial<0) {
                        System.out.println("No puede ser una puja inicial negativa");
                        NuevoPrecioInicial=leerInt("Introduce el precio inicial", scanner1);
                    }
                PrecioInicial.add(NuevoPrecioInicial);
                MejorPuja.add(0);
                MejorPostor.add(mejorPostor);
            } else if (opcionUsuario==2) {
                if (Modelo.isEmpty()) {
                    System.out.println("No hay lotes disponibles actualmente");
                } else {
                    listarLotes("LOTES DISPONIBLES", Modelo, PrecioInicial, MejorPuja, MejorPostor);
                }
            } else if (opcionUsuario==3) {
                elegirIndice=leerInt("Elige un lote disponible (numero)", scanner1);
                if (elegirIndice>Modelo.size()-1) {
                    System.out.println("No hay ningun lote con ese indice");
                } else {
                    Modelo.get(elegirIndice);
                }
                System.out.println("Nombre el nuevo postor:");
                nuevoPostor=scanner1.nextLine();
                nuevaPuja=leerInt("Introduce la nueva puja", scanner1);
                    while (nuevaPuja<0) {
                        System.out.println("No se permiten pujas menores de 0");
                        nuevaPuja=leerInt("Introduce la nueva puja", scanner1);
                    } 
                if ((MejorPuja.get(elegirIndice) >= nuevaPuja) || (nuevaPuja<=PrecioInicial.get(elegirIndice))) {
                    if (MejorPuja.get(elegirIndice) >= nuevaPuja) {
                        System.out.println("Puja inferior a la actual. Rechazada!");
                    } else {
                        System.out.println("Puja inferior al precio inicial. Rechazada!");
                    }
                } else {
                    MejorPuja.set(elegirIndice, nuevaPuja);
                    MejorPostor.set(elegirIndice, nuevoPostor);
                }
            } else if (opcionUsuario==4) {
                elegirIndice=leerInt("Elige un lote disponible (numero)", scanner1);
                if (elegirIndice>Modelo.size()-1) {
                    System.out.println("No hay ningun lote con ese indice");
                } else {
                    if (MejorPuja.get(elegirIndice)==0) {
                        System.out.println("Sin pujas todavía");
                    } else {
                        System.out.println((elegirIndice) + "-> " + Modelo.get(elegirIndice) + " | Mejor postor: " + MejorPostor.get(elegirIndice) + " | Mejor puja: " + MejorPuja.get(elegirIndice));
                    }
                }
            } else if (opcionUsuario==5) {
                elegirIndice=leerInt("Elige un lote disponible (numero)", scanner1);
                if (elegirIndice>Modelo.size()-1) {
                    System.out.println("No hay ningun lote con ese indice");
                } else {
                    Modelo.remove(elegirIndice);
                    PrecioInicial.remove(elegirIndice);
                    MejorPostor.remove(elegirIndice);
                    MejorPuja.remove(elegirIndice);
                    System.out.println("Lote "+ elegirIndice + " eliminado con exito");
                }
            } else if (opcionUsuario==0) {
                acabarPrograma=true;
                System.out.println("Saliste del programa! Hasta la proxima!");
            }
        }
    }
}
