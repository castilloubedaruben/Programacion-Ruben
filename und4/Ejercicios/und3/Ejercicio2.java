// 2. Suma de dos números
// Crea una función llamada sumar que reciba dos números y devuelva su suma.

// function sumar(numero1,numero2) {
//     return numero1+numero2
// }
// let numeroUsuario1=Number(prompt("Indique un numero"))
// let numeroUsuario2=Number(prompt("Indique un numero"))
// console.log(sumar(numeroUsuario1,numeroUsuario2));

package und4.ejercicios.und3;

public class Ejercicio2 {
    public static double sumarDosNumeros (double primerNumero, double segundoNumero) {
        return primerNumero+segundoNumero;
    };
    
    public static void main(String[] args) {
        int numero1=15,numero2=6;
        
        System.out.println(sumarDosNumeros(numero1, numero2));
}
}
