package und5.relacion2;
import java.util.ArrayList;
import java.util.Arrays;

public class Faker {
    // Arrays con datos de ejemplo
    private static final String[] nombres = {
            "Juan", "Pedro", "María", "Ana", "Luis", "Sofía", "Carlos", "Laura", "Fernando", "Elena",
            "Miguel", "Isabel", "Javier", "Beatriz", "Andrés", "Carmen", "Hugo", "Valeria", "Ricardo", "Paula",
            "Gabriel", "Alejandra", "Roberto", "Manuela", "Diego", "Victoria", "Daniel", "Natalia", "Álvaro", "Marta"
    };

    private static final String[] apellidos = {
            "García", "Rodríguez", "Martínez", "López", "González", "Pérez", "Fernández", "Sánchez", "Ramírez",
            "Torres",
            "Díaz", "Jiménez", "Moreno", "Vargas", "Rojas", "Castro", "Mendoza", "Romero", "Herrera", "Ortega",
            "Navarro", "Delgado", "Cabrera", "Reyes", "Acosta", "Campos", "Peña", "Vega", "Guerrero", "Cruz"
    };

    private static final String[] ciudades = {
            "Madrid", "Barcelona", "Buenos Aires", "Ciudad de México", "Lima", "Bogotá", "Santiago", "Caracas",
            "Montevideo", "Quito", "La Paz", "San Salvador", "San José", "Managua", "Asunción", "Brasilia",
            "Lisboa", "Roma", "París", "Berlín", "Londres", "Nueva York", "Los Ángeles", "Chicago", "Toronto",
            "Tokio", "Seúl", "Pekín", "Bangkok", "Sídney", "Ámsterdam", "Dublín", "Moscú", "Atenas", "Dubái"
    };

    // Fragmentos de texto Lorem Ipsum ampliado
    private static final String[] palabrasLorem = {
            "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do",
            "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua", "ut",
            "enim", "ad", "minim", "veniam", "quis", "nostrud", "exercitation", "ullamco", "laboris",
            "nisi", "ut", "aliquip", "ex", "ea", "commodo", "consequat", "duis", "aute", "irure",
            "dolor", "in", "reprehenderit", "voluptate", "velit", "esse", "cillum", "fugiat", "pariatur"
    };

    /**
     * Genera un número entero aleatorio entre min y max (inclusive).
     * 
     * @param min Valor mínimo.
     * @param max Valor máximo.
     * @return Número entero aleatorio.
     */
    public static int entero(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Genera un booleano aleatorio.
     * 
     * @return booleano aleatorio.
     */
    public static boolean booleano() {
        return (entero(0, 1) == 1);
    }

    /**
     * Genera un precio aleatorio en un rango dado.
     * 
     * @param min Valor mínimo del precio.
     * @param max Valor máximo del precio.
     * @return Precio aleatorio con dos decimales.
     */
    public static double precio(double min, double max) {
        return entero((int) min * 100, (int) max * 100) / 100.0;
    }

    /**
     * Genera un nombre aleatorio.
     * 
     * @return Nombre aleatorio.
     */
    public static String nombre() {
        int posicionAleatoria = entero(0, nombres.length - 1);
        return nombres[posicionAleatoria];
    }

    /**
     * Genera un apellido aleatorio.
     * 
     * @return Apellido aleatorio.
     */
    public static String apellido() {
        int posicionAleatoria = entero(0, apellidos.length - 1);
        return apellidos[posicionAleatoria];
    }

    /**
     * Genera un nombre completo aleatorio.
     * 
     * @return Nombre y apellido combinados.
     */
    public static String nombreCompleto() {
        return nombre() + " " + apellido() + " " + apellido();
    }

    /**
     * Genera una edad aleatoria entre 18 y 60 años.
     * 
     * @return Edad aleatoria.
     */
    public static int edad() {
        return entero(18, 60);
    }

    /**
     * Genera una ciudad aleatoria.
     * 
     * @return Ciudad aleatoria.
     */
    public static String ciudad() {
        int posicionAleatoria = entero(0, ciudades.length - 1);
        return ciudades[posicionAleatoria];
    }

    /**
     * Genera un número de teléfono aleatorio con formato "+34 XXX XXX XXX".
     * 
     * @return Número de teléfono aleatorio.
     */
    public static String telefono() {
        String telefono = "+34 ";

        telefono += entero(6, 9);

        for (int i = 2; i < 9; i++) {
            telefono += entero(0, 9);
            if (i % 3 == 0) {
                telefono += " ";
            }
        }

        telefono += entero(0, 9);

        return telefono;
    }

    /**
     * Genera un correo electrónico aleatorio basado en un nombre y apellido
     * aleatorio.
     * 
     * @return Correo electrónico aleatorio.
     */
    public static String correo() {
        return tildesCase(nombre() + apellido() + "@example.com").toLowerCase();
    }

    /**
     * Transforma una cadena eliminando las tildes.
     * 
     * @return Cadena de texto sin tildes.
     */
    public static String tildesCase(String cadena) {

        Character[] arrayVocalesConTilde = { 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í', 'Ó', 'Ú' };
        ArrayList<Character> vocalesConTilde = new ArrayList<>(Arrays.asList(arrayVocalesConTilde));

        Character[] arrayVocalesSinTilde = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        ArrayList<Character> vocalesSinTilde = new ArrayList<>(Arrays.asList(arrayVocalesSinTilde));

        String resultadoSinTildes = "";

        for (int i = 0; i < cadena.length(); i++) {
            char lectraActual = cadena.charAt(i);

            int posicionVocalConTilde = vocalesConTilde.indexOf(lectraActual);

            if (posicionVocalConTilde == -1) {
                resultadoSinTildes += lectraActual;
            }else{
                resultadoSinTildes += vocalesSinTilde.get(posicionVocalConTilde);
            }

            // resultadoSinTildes += posicionVocalConTilde == -1 ? lectraActual : vocalesSinTilde.get(posicionVocalConTilde);

        }

        return resultadoSinTildes;
    }

    // public static String tildesCase(String cadena) {

    //     String resultado = cadena;
    //     resultado = resultado.replace('á', 'a');
    //     resultado = resultado.replace('é', 'e');
    //     resultado = resultado.replace('í', 'i');
    //     resultado = resultado.replace('ó', 'o');
    //     resultado = resultado.replace('ú', 'u');
    //     resultado = resultado.replace('Á', 'A');
    //     resultado = resultado.replace('É', 'E');
    //     resultado = resultado.replace('Í', 'I');
    //     resultado = resultado.replace('Ó', 'O');
    //     resultado = resultado.replace('Ú', 'U');

    //     return resultado;
    // }

    /**
     * Genera un texto Lorem Ipsum con una cantidad específica de palabras.
     * 
     * @param cantidad Cantidad de palabras a generar.
     * @return Texto Lorem Ipsum generado.
     */
    public static String lorem(int cantidad) {
        String texto = "";

        for (int i = 0; i < cantidad; i++) {
            int posicionAleatoria = entero(0, palabrasLorem.length - 1);
            texto += palabrasLorem[posicionAleatoria] + " ";
        }

        return texto;
        
    }

    /**
     * Genera un texto Lorem Ipsum corto (5-10 palabras).
     * 
     * @return Texto Lorem Ipsum corto.
     */
    public static String loremCorto() {
        int cantidadPalabras = entero(5, 10);
        return lorem(cantidadPalabras);
    }

    /**
     * Genera un texto Lorem Ipsum largo (20-50 palabras).
     * 
     * @return Texto Lorem Ipsum largo.
     */
    public static String loremLargo() {
        int cantidadPalabras = entero(20, 50);
        return lorem(cantidadPalabras);
    }

}