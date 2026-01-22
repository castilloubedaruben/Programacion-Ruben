// 19. Crea una función llamada capitalizarPrimeraLetra que reciba una palabra y devuelva la misma palabra con la primera letra en mayúscula. 
// Investiga el uso de toUpperCase().

package und4.Ejercicios.und3;

public class Ejercicio19 {

    public static String capitalizarPrimeraLetra(String palabra) {
        String primeraLetra = palabra.substring(0, 1).toUpperCase();
        String restoPalabra = palabra.substring(1);
        
        return primeraLetra + restoPalabra;
    }

    public static void main(String[] args) {
        String palabra = "hola";
        System.out.println(capitalizarPrimeraLetra(palabra));
    }
}

