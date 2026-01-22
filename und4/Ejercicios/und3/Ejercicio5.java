    // 5. Calcular el factorial de un número
    // Haz una función llamada factorial que reciba un número y devuelva su factorial calculado de forma iterativa.

    // function factorial(numero) {
    //     let resultado = 1
    //     for (let i = 1; i <= numero; i++) {
    //         resultado = resultado * i;
    //     }
    //     return resultado
    // }
    // let numeroUsuario = Number(prompt("Indica un numero"))
    // console.log(factorial(numeroUsuario));

package und4.ejercicios.und3;

import java.util.Scanner;

public class Ejercicio5 {

    public static int factorial (int number) {
        int resultado=1;
        for (int i = 1; i <= number; i++) {
            resultado*=i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indica un numero para calcular su factorial");
        int numeroACalcular = scanner1.nextInt();

        System.out.println(factorial(numeroACalcular));
    }
}
