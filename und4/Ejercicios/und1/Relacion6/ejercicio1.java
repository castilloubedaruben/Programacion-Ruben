  // 1. Calificaciones de estudiantes
  // Crea un programa que reciba las calificaciones de N estudiantes (se piden calificaciones hasta que el usuario introduzca un "-1") y calcule el promedio.
  // Luego muestra cuántos estudiantes están aprobados (>=5) y cuántos suspensos.

  // Ejemplo:

  // Introduce la calificacion del alumno 1: 4
  // Introduce la calificacion del alumno 2: 1
  // Introduce la calificacion del alumno 3: 10
  // Introduce la calificacion del alumno 4: 8
  // Introduce la calificacion del alumno 5: -1

  // Hay 2 alumnos aprobados y 2 alumnos suspensos.
  // La calificación media es 5.75

package und4.Ejercicios.und1.Relacion6;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        double notas=0,calificacionMedia=0;
        int contador=1,alumnosAprobados=0,alumnosSuspensos=0,totalNotas=0;
        final int FINBUCLE = -1, APROBADO=5;

        Scanner scanner1=new Scanner(System.in);
        
        while (notas!=FINBUCLE) {
            System.out.println("Indique una calificación");
            notas=scanner1.nextInt();
            System.out.println("La calificacion del alumno " + contador + " : " + notas);
            if (notas!=-1) {
                totalNotas+=notas;
                if (notas>=APROBADO) {
                    alumnosAprobados++;
                    contador++;
                } else {
                    alumnosSuspensos++;
                    contador++;
                }
            }
        }
        scanner1.close();
        calificacionMedia=totalNotas/(contador-1);
        System.out.println("Hay un total de " + alumnosAprobados+ " alumnos aprobados y " + alumnosSuspensos + " alumnos suspensos.\nLa calificacion media es de " + calificacionMedia);
    }
}
