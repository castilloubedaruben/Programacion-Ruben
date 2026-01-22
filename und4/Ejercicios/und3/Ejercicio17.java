// 17. Revertir una cadena
// Crea una función llamada revertirCadena que reciba una cadena de texto
// y devuelva la misma cadena con los caracteres en orden inverso.

package und4.Ejercicios.und3;

public class Ejercicio17 {

    public static String revertirCadenaTexto(String texto) {
        String textoRevertido="";
        texto=texto.trim(); // preguntar en clase porque no funciona

        for (int i = texto.length()-1; i >= 0; i--) {
            char letra=texto.charAt(i);
            textoRevertido+=letra;
        }
        return textoRevertido ;
    }

    public static void main(String[] args) {
        String cadenaInvertir="Hola Ruben";
        System.out.println(revertirCadenaTexto(cadenaInvertir));
    }
}

