// 15. Crea una función llamada filtrarNumerosMayores que reciba un array de números y un valor, 
// y devuelva un nuevo array con los números mayores que el numeroComprobar dado.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15 {

    public static ArrayList<Integer> comprobarNumero(ArrayList<Integer> arrayNumeros, int numeroComprobar) {
        String mensaje="";
        ArrayList<Integer> arrayARellenar = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        try {
            numeroComprobar = Integer.parseInt(sc.nextLine());
            for (int numero : arrayNumeros) {
                if (numeroComprobar < numero) {
                    arrayARellenar.add(numero);
                }
            }
            System.out.println(arrayARellenar);
        } catch (NumberFormatException e) {
            mensaje="numeroComprobar ERRONEO! Introduce un numero entero";
        }
        return arrayARellenar;
    }
    public static void main(String[] args) {
        
    ArrayList<Integer> numeroEnteros = new ArrayList<>(Arrays.asList(20, 16, 12, 8, 4));
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Indica un numero entero para comprobar numeroComprobares mayores a este");
    int numeroUsuario=scanner1.nextInt();
    System.out.println(comprobarNumero(numeroEnteros, numeroUsuario));
    scanner1.close();
    }
}
