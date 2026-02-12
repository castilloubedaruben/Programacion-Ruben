package und5.relacion2.eje1;

import java.util.ArrayList;

// Luego, crea una clase Universidad que tenga un array de estudiantes y métodos para:

//  Agregar estudiantes
//  Mostrar todos los estudiantes
//  Buscar un estudiante por su número de matrícula

public class Universidad {

    ArrayList<Estudiante> alumnado;

    public Universidad() {
        this.alumnado = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        alumnado.add(estudiante);
    }

    public String mostrarAlumnado(){
        String stringAlumnado = "";
        for (Estudiante estudiante : alumnado) {
            stringAlumnado += "--" + estudiante + "\n";
        }
        return stringAlumnado;
    }

    public Estudiante buscarEstudiante(String numeroDeMatricula) {
        Estudiante estudianteBuscar = new Estudiante();
        for (Estudiante estudiante : alumnado) {
            if (estudiante.getNumeroDeMatricula().equals(numeroDeMatricula)) {
                estudianteBuscar=estudiante;
            }
        }
        return estudianteBuscar;
    }

}
