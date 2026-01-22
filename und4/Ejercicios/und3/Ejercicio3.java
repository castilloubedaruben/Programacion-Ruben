// 3. Número al cuadrado
// Haz una función llamada alCuadrado que reciba un número y devuelva su cuadrado.
// function alCuadrado(numero) {
//     return numero*numero
//     // return numero**2 tambien se puede hacer asi el cuadrado
// }
// let numeroUsuario=Number(prompt("Indique un numero para saber su cuadrado"))
// console.log(alCuadrado(numeroUsuario));
package und4.ejercicios.und3;

import java.util.Scanner;

public class Ejercicio3 {

    public static int alCuadrado(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Dime un numero entero para calcular su cuadrado:");
        int numeroCalcularCuadrado = scanner1.nextInt();
        scanner1.close();

        System.out.println(alCuadrado(numeroCalcularCuadrado));
    }
}
