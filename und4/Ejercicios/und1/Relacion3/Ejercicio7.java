//**Simular una calculadora simple**:
//Pide dos números y una operación (`+`, `-`, `*`, `/`) e imprime el resultado correspondiente.
// let resultado
// let numero1 = Number(prompt("Indique un primer número"))
// let numero2 = Number(prompt("Indique un segundo número"))
// let indiqueOperacion = (prompt("Indique una operacion: +, -, *, /"))

// if (!isNaN(numero1) && !isNaN(numero2)) {

//     if (indiqueOperacion == "+") {
//         resultado = numero1 + numero2
//         console.log("El resultado de la suma es: " + resultado)
//     } else if (indiqueOperacion == "-") {
//         resultado = numero1 - numero2
//         console.log("El resultado de la resta es: " + resultado)
//     } else if (indiqueOperacion == "*") {
//         console.log("El resultado de la multiplicacion es: " + resultado)
//         resultado = numero1 * numero2
//     } else if (indiqueOperacion == "/") {
//         resultado = numero1 / numero2
//         if (numero2 == 0) {
//             console.log("No se puede dividir entre 0")
//         } else
//         console.log("El resultado de la division es: " + (resultado))
//     }
// } else {
//     console.log("Por favor introduce un numero válido.")
// }

package und4.Ejercicios.und1.Relacion3;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        double resultado = 0;
        double numero1Usuario, numero2Usuario;
        String indiqueOperacion;
    
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indica un primer numero");
        numero1Usuario=scanner1.nextInt();
        System.out.println("Indica un segundo numero");
        numero2Usuario=scanner1.nextInt();
        System.out.println("Indique una operacion: +, -, *, /");
        indiqueOperacion=scanner1.next();
        scanner1.close();

        if (indiqueOperacion.equals("+")) {
            resultado=numero1Usuario+numero2Usuario;
        } else if (indiqueOperacion.equals("-")) {
            resultado=numero1Usuario-numero2Usuario;
        } else if (indiqueOperacion.equals("*")) {
            resultado=numero1Usuario*numero2Usuario;
        } else {
            if (numero2Usuario==0) {
                System.out.println("No se puede dividir entre 0");
            } else {
                resultado=numero1Usuario/numero2Usuario;
            }
        }
        System.out.println("El resultado de la operacion " + indiqueOperacion + " es : " + resultado);
    }
}
