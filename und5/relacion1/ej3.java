// Ejercicio 3: Clase Alumno
// Crea una clase Alumno con atributos nombre, materia y calificacion. 
// Agrega un método aprobo() que devuelva True si la calificación es mayor o igual a 6, y False en caso contrario.

package und5.relacion1;

public class ej3 {
    public static void main(String[] args) {
        Alumno primerAlumno = new Alumno("Ruben", "Programacion", 5);
        Alumno segundoAlumno = new Alumno("Reda", "BBDD", 8);
        Alumno tercerAlumno = new Alumno("Iker", "LLMM", 4);
        System.out.println(primerAlumno.aprobar());
        System.out.println(segundoAlumno.aprobar());
        System.out.println(tercerAlumno.aprobar());
        
    }
}

class Alumno {
    String nombre;
    String materia;
    double calificacion;

    Alumno(String nombre, String materia, int calificacion) {
        this.nombre=nombre;
        this.materia=materia;
        this.calificacion=calificacion;
    }

    boolean aprobar() {
        boolean aprueba=false;
        if (calificacion>=6) {
            aprueba=true;
        } 
        return aprueba;
    }
}