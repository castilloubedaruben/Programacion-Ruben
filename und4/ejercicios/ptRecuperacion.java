package und4.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ptRecuperacion {

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static void mostrarArrayString(String mensaje, ArrayList<String> array) {
        imprimirMensaje(mensaje);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Elemento " + (i + 1) + " : " + array.get(i));
        }
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
                    imprimirMensaje("No se puede añadir notas por debajo de 0");
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero entero valido");
            }
        }
        return numero;
    }

    public static void mostrarArrayTriple(String mensaje, ArrayList<String> arrayTexto, ArrayList<Double> arrayValor1, ArrayList<Integer> arrayValor2) {
        imprimirMensaje(mensaje);

        for (int i = 0; i < arrayTexto.size(); i++) {
            System.out.println("Estudiante - " + arrayTexto.get(i) + " - " + arrayValor1.get(i) + " - " + arrayValor2.get(i));
        }
    }

    public static double leerDouble(String mensaje, Scanner sc) {
        double numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                imprimirMensaje(mensaje);
                numero = Double.parseDouble(sc.nextLine());
                if (numero < 0 || numero > 10) {
                    imprimirMensaje("No se puede añadir notas por debajo de 0 y por encima de 10");
                } else {
                    correcto = true;
                }
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero decimal valido");
            }
        }
        return numero;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Double> notas = new ArrayList<Double>();
        ArrayList<Integer> asistencias = new ArrayList<Integer>();

        boolean acabarPrograma = false, alumnoEncontrado = false;
        String nuevoEstudiante, eliminarEstudiante, mejorEstudianteNota = "", mejorEstudianteAsistencia = "";
        double nuevaNota, mejorNota;
        int nuevaAsistencia, mayorAsistencia, opcionUsuario;
        final String MENU = "\nOpciones:\n1:Añadir estudiante (nombre, nota, asistencia) \n2:Mostrar listado completo \n3:Mostrar estudiante con mas nota y con mas asistencia \n4:Eliminar estudiante \n5:Salir";
        final int OPCIONMINIMAMENU = 1;
        final int OPCIONMAXIMAMENU = 5;

        while (!acabarPrograma) {
            opcionUsuario = leerOpcionMenu(MENU, OPCIONMINIMAMENU, OPCIONMAXIMAMENU, scanner1);
            if (opcionUsuario == 1) {
                System.out.println("Nombre del estudiante:");
                nuevoEstudiante = scanner1.nextLine();
                nuevaNota = leerDouble("Nota del estudiante", scanner1);
                nuevaAsistencia = leerInt("Asistencia del estudiante", scanner1);
                nombres.add(nuevoEstudiante);
                notas.add(nuevaNota);
                asistencias.add(nuevaAsistencia);
                System.out.println("Añadido con existo!");
            } else if (opcionUsuario == 2) {
                if (nombres.isEmpty()) {
                    System.out.println("No se han guardado todavia datos en los arrays");
                } else {
                    mostrarArrayTriple("LISTADO ESTUDIANTES:", nombres, notas, asistencias);
                }

            } else if (opcionUsuario == 3) {
                if (notas.isEmpty() || asistencias.isEmpty()) {
                    System.out.println("No hay valores aun añadidos");
                } else {
                    mejorNota = notas.get(0);
                    mayorAsistencia = asistencias.get(0);
                    mejorEstudianteNota=nombres.get(0);
                    mejorEstudianteAsistencia=nombres.get(0);

                    for (int i = 0; i < notas.size(); i++) {
                        if (mejorNota < notas.get(i)) {
                            mejorNota = notas.get(i);
                            mejorEstudianteNota = nombres.get(i);
                        }
                    }

                    for (int i = 0; i < asistencias.size(); i++) {
                        if (mayorAsistencia < asistencias.get(i)) {
                            mayorAsistencia = asistencias.get(i);
                            mejorEstudianteAsistencia = nombres.get(i);
                        }
                    }
                    System.out.println("Mejor nota: " + mejorEstudianteNota +" "+ mejorNota);
                    System.out.println("Mejor asistencia: " + mejorEstudianteAsistencia +" "+ mayorAsistencia);
                }

            } else if (opcionUsuario == 4) {
                if (nombres.isEmpty()) {
                    System.out.println("No hay estudiantes aun añadidos");
                } else {
                    System.out.println("Indica estudiante a eliminar");
                    eliminarEstudiante = scanner1.nextLine();
                        for (int i = 0; i < nombres.size(); i++) {
                            if (nombres.get(i).equalsIgnoreCase(eliminarEstudiante)) {
                                nombres.remove(i);
                                notas.remove(i);
                                asistencias.remove(i);
                                System.out.println("Estudiante eliminado con existo");
                                alumnoEncontrado = true;
                            }
                        }
                        if (!alumnoEncontrado) {
                            System.out.println("Alumno no encontrado");
                        }
                }
                alumnoEncontrado = false;
            } else if (opcionUsuario == 5) {
                acabarPrograma = true;
            }
        }
    }
}
