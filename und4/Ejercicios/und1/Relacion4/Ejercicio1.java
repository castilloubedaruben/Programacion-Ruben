// <!-- 🔹 Ejercicio 1 – Bucle for

// Escribe un programa que pida al usuario un número entero positivo y muestre la tabla de multiplicar de ese número (del 1 al 10) usando un bucle for.

// 👉 Ejemplo de salida si el usuario introduce 3:
// 3 x 1 = 3  
// 3 x 2 = 6  
// 3 x 3 = 9  
// ...  
// 3 x 10 = 30   -->

package und4.ejercicios.und1.Relacion4;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int digitoACalcular,resultado;
        final int VECESMULTIPLICAR = 10;
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Indique un numero del 1 al 10");
        digitoACalcular= scanner1.nextInt();
        scanner1.close();

        for (int i = 1; i < VECESMULTIPLICAR; i++) {
            resultado=digitoACalcular*i;
            System.out.println(digitoACalcular+" x " + i + " = " + resultado);
        }
    }
}
