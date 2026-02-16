package und5.relacion2.ejercicio4;

public class main {
    public static void main(String[] args) {
        Cancion cancion1 =  new Cancion("A", "lohkhjfg", 2);
        Cancion cancion2 =  new Cancion("B", "asdfafd", 1);
        Cancion cancion3 =  new Cancion("C", "rtytrh", 3);
        Cancion cancion4 = new Cancion("D", "yryhf", 6);
        Playlist miLista = new Playlist();

        miLista.agregarCacion(cancion1);
        miLista.agregarCacion(cancion2);
        miLista.agregarCacion(cancion3);
        miLista.agregarCacion(cancion4);
        System.out.println(miLista);
        System.out.println(miLista.duracionPlaylist());
    }
}
