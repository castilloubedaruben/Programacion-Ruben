package und5.relacion2.ejercicio5;

import java.util.ArrayList;

public class Cine {
    ArrayList<Pelicula> listaPeliculas;

    public Cine() {
        listaPeliculas=new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
    }

    @Override
    public String toString() {
        return "Cine --" + listaPeliculas;
    }

    public boolean buscarPelicula(String tituloPeliculaBuscar) {
        boolean encontrada=false;
        Pelicula peliculaActual; // creo una variable de peliculaCtual para guardar la pelicula de i de cada iteracion
        // para compararla, si no no puedo acceder al metodo getTitulo()
        for (int i = 0; i < listaPeliculas.size() && !encontrada; i++) {
            peliculaActual=listaPeliculas.get(i);
            if (peliculaActual.getTitulo().equalsIgnoreCase(tituloPeliculaBuscar)) {
                encontrada=true;
            }
        }
        return encontrada;
    }

    public int duracionMediaPeliculas() {
        int totalDuracionPeliculas=0;
        int mediaPeliculas=listaPeliculas.size();
        int resultado;
        for (Pelicula pelicula : listaPeliculas) {
            totalDuracionPeliculas+=pelicula.getDuracion();
        }
        resultado= totalDuracionPeliculas/mediaPeliculas;
        return resultado;
    }
}
