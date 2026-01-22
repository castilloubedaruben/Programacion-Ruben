// 4. ¿Es par?
// Crea una función llamada esPar que reciba un número y devuelva true si es par o false si es impar.

// function esPar(numero) {
//     let resultado = false
//     if (numero%2==0) {
//         resultado=true
//     } 
//     return(resultado)
// }
// let numeroUsuario=Number(prompt("Indique un numero para saber si es par o impar"))
// console.log(esPar(numeroUsuario));

package und4.ejercicios.und3;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static boolean esPar (int number) {
        boolean resultado ;
        if (number%2==0) {
            resultado=true;
        } else {
            resultado=false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Indica un numero entero para saber sies par");
        int numeroComprobarPar = scanner1.nextInt();
        scanner1.close();

        System.out.println(esPar(numeroComprobarPar));
    }
}
