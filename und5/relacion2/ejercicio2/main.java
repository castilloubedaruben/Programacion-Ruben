package und5.relacion2.ejercicio2;

public class main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("01", "Titulo1", "Ruben", "Libro sobre LLMM", true);
        Libro libro2 = new Libro("02", "Titulo2", "Iker", "Libro sobre programacion", true);

        Biblioteca libreriaGranada = new Biblioteca();
        libreriaGranada.agregarLibro(libro1);
        libreriaGranada.agregarLibro(libro2);
        libreriaGranada.prestarLibro(libro1);
        System.out.println(libreriaGranada);
        libreriaGranada.devolverLibro(libro1);
        System.out.println(libreriaGranada);
        
    }
}
