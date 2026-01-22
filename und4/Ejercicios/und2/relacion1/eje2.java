// 2. Añadir elementos
// Crea un array vacío llamado colores.
// Añade los colores "rojo", "verde" y "azul" al final del array y luego imprime el array.


package relacion1;

import java.util.ArrayList;
import java.util.Arrays;

public class eje2 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>(Arrays.asList("amarillo","naranja"));
        colores.add(2, "rojo");
        colores.add(3, "verde");
        colores.add(4, "azul");
        System.out.println(colores);
    }
}
