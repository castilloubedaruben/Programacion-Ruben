// 16. Verificar si un número está en un array
// Crea una función llamada verificarNumeroEnArray que reciba un número y un array, y devuelva true si el número está presente en el array o false si no lo está.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio16 {

    public static String verificarNumeroEnArray(ArrayList<Integer> arrayNumeros, int valorVerificar) {
        String mensaje="";
        boolean valorEncontrado = false;
        while (!valorEncontrado) {
            if (arrayNumeros.contains(valorVerificar)) {
                mensaje = "Valor encontrado!";
                valorEncontrado = true;
            } else {
                mensaje = "Valor no encontrado!";
            }
        }
        return mensaje;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeroEnteros = new ArrayList<>(Arrays.asList(20, 16, 12, 8, 4));
        Scanner scanner1 = new Scanner(System.in);
        int numeroUsuario;

        try {
            System.out.println("Indica un numero para comprobar si esta en el array");
            numeroUsuario = Integer.parseInt(scanner1.nextLine());
            System.out.println(verificarNumeroEnArray(numeroEnteros, numeroUsuario));
        } catch (Exception e) {
            System.out.println("ERROR! Introduce un numero, no caracteres");
        }
    }
}
