// 20. Crea una función llamada contarPalabrasEnCadena que reciba una cadena y devuelva el número de palabras que contiene, 
// asumiendo que están separadas por espacios. Investiga el uso de split().

package und4.ejercicios.und3;

public class Ejercicio20 {
    public static int contarPalabrasEnCadena (String texto) {
        String textoSeparado[] = texto.split(" ");
        int totalPalabras=textoSeparado.length;
        return totalPalabras;
    }

    public static void main(String[] args) {
        String textoAContar = "Hola Ruben como llevas los ejercicios de Java";
        System.out.println(contarPalabrasEnCadena(textoAContar));
    }
}
