// 18. Contar vocales en una cadena
// Crea una función llamada contarVocalesEnCadena que reciba una cadena de texto 
// y devuelva la cantidad total de vocales que contiene.

package und4.ejercicios.und3;

public class Ejercicio18 {
    
    public static int  contarVocalesEnCadena(String texto) {
        int totalVocales=0;
        for (int i = 0; i < texto.length(); i++) {
            String textoMinusculas=texto.toLowerCase();
            char letra =textoMinusculas.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'u') {
                    totalVocales++;
                }
        }
        return totalVocales;
    }

    public static void main(String[] args) {
        String saludo = "HolA rUben";
        System.out.println(contarVocalesEnCadena(saludo));
    }
}
