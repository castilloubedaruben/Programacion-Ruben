    //5. **Determinar si un número está en un rango**:
    //Solicita un número e indica si está entre 10 y 20 (inclusive).

    // let numeroUsuario = Number(prompt("Indique un número"))
    
    // if (numeroUsuario <= 10) {
    //     console.log(numeroUsuario + " no está entre 10 y 20.")
    // } else if (numeroUsuario >= 20) {
    //     console.log(numeroUsuario + " no está entre 10 y 20.")
    // } else {
    //     console.log(numeroUsuario + " si está entre 10 y 20.")
    // }

package und4.Ejercicios.und1.Relacion3;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Indica un numero entre 10 y 20");
        numeroUsuario=scanner1.nextInt();
        scanner1.close();

        if (numeroUsuario<10 || numeroUsuario>20) {
            System.out.println(numeroUsuario + " no está entre 10 y 20.");
        } else {
            System.out.println(numeroUsuario + " está entre 10 y 20.");
        }
    }
}
