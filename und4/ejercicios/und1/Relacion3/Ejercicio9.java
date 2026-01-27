//9. Sumar los dígitos de un número de dos cifras:
//Pide un número de dos cifras e imprime la suma de sus dígitos.
//Si el número introducido no es de dos cifras, se debe avisar al usuario.

// let numeroDosCifras = Number(prompt("Indique un numero de dos cifras"))

// if (numeroDosCifras <10) {
//     console.log("El número introducido es menor de dos cifras")
// } else if (numeroDosCifras >99) {
//     console.log("El número introducido es mayor de dos cifras")
// } else {
//     let numeroDosCifras = String(numeroDosCifras)
//     let digito1 = Number(numeroDosCifras[0])
//     let digito2 = Number(numeroDosCifras[1])
//     let sumaDigitos = digito1 + digito2
//     console.log("La suma de los digitos de tu número es igual a " + sumaDigitos)
// }

package und4.ejercicios.und1.Relacion3;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        int numeroDosCifras, digito1, digito2, sumaDigitos=0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Indique un numero de dos cifras");
        numeroDosCifras=scanner1.nextInt();
        scanner1.close();

        if (numeroDosCifras<10 || numeroDosCifras>99) {
            System.out.println(" Indique un numero de dos cifras");
        } else {
            digito1=numeroDosCifras/10;
            digito2=numeroDosCifras%10;
            sumaDigitos=digito1+digito2;
        }
        System.out.println(" El resultado de la suma de los digitos de " + numeroDosCifras + " es: "+ sumaDigitos);
    }
}
