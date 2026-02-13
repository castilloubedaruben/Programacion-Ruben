package und5.relacion2.ejercicio2;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> coleccion;

    public Biblioteca() {
        coleccion = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        coleccion.add(libro);
    }

    public void prestarLibro(Libro libro) {
        if (libro.getDisponible()) {
            libro.setDisponible(false);
        }
    }
    
    public void devolverLibro(Libro libro) {
        if (!libro.getDisponible()) {
            libro.setDisponible(true);
        }
    }

    @Override
    public String toString() {
        String informacionColeccion="";
            for (Libro libro : coleccion) {
                informacionColeccion+= "|" + libro + "\n" ;
            }
        return informacionColeccion;
    }
    
}
