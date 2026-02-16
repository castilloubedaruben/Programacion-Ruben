package und5.relacion2.ejercicio5;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1=new Pelicula("A", "aventura", "asddf", 126);
        Pelicula pelicula2=new Pelicula("B", "accion", "ttry", 164);
        Pelicula pelicula3=new Pelicula("C", "thriller", "kjnbv", 99);
        Cine Netflix = new Cine();

        Netflix.agregarPelicula(pelicula1);
        Netflix.agregarPelicula(pelicula2);
        Netflix.agregarPelicula(pelicula3);
        System.out.println(Netflix);
        System.out.println(Netflix.duracionMediaPeliculas());
        System.out.println(Netflix.buscarPelicula("hola"));
        System.out.println(Netflix.buscarPelicula("A"));
        System.out.println(Netflix.buscarPelicula("b"));
    }
}
