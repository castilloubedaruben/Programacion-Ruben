package und5.relacion2.ejercicio4;
import java.util.ArrayList;

public class Playlist {
    
    ArrayList<Cancion> listaCanciones;

    public Playlist() {
        listaCanciones= new ArrayList<>();
    } 

    public void agregarCacion(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    @Override
    public String toString() {
        return "Playlist : " + listaCanciones;
    }
    
    public int duracionPlaylist() {
        int totalDuracion=0;
            for (Cancion canciones : listaCanciones) {
                totalDuracion+=canciones.getDuracion();
            }
            return totalDuracion;
    }
    
}
