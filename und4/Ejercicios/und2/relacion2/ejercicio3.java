package relacion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        ArrayList<String> productosDisponibles = new ArrayList<>(Arrays.asList("Manzanas", "Platanos", "Leche", "Pan", "Huevos", "Azucar", "Harina", "Arroz", "Pasta", "Cafe"));
        ArrayList<Double> preciosProductosDisponibles = new ArrayList<>(Arrays.asList(1.20, 0.80, 1.50, 1.00, 2.00, 1.10, 0.90, 0.70, 1.30, 3.00));
        ArrayList<String> productosComprados = new ArrayList<>();
        ArrayList<Integer> cantidadesCompradas = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        String comprar = "";
        int cantidadAComprar=0;
        double totalCompra = 0, compraActual;
        boolean productoEncontrado = false;

        for (int i = 0; i < productosDisponibles.size(); i++) {
            System.out.println(productosDisponibles.get(i) + ": precio de venta - " + preciosProductosDisponibles.get(i));
        }
        while (!comprar.equalsIgnoreCase("fin")) {
            try {
                System.out.println("Que producto quieres comprar?");
                comprar = scanner1.nextLine();
                comprar = comprar.toLowerCase();
            } catch (Exception e) {
                System.out.println();
            }
            if (!comprar.equals("fin")) {
                try {
                    System.out.println("Que cantidad quieres comprar?");
                    cantidadAComprar = Integer.parseInt(scanner1.nextLine());
                } catch (Exception e) {
                    System.out.println("Error: debes introducir un número entero válido.");
                }
                scanner1.nextLine();
                for (int i = 0; i < productosDisponibles.size() && productoEncontrado == false; i++) {
                    if (comprar.equalsIgnoreCase(productosDisponibles.get(i))) {
                        productoEncontrado = true;
                        compraActual = cantidadAComprar * preciosProductosDisponibles.get(i);
                        totalCompra += compraActual;
                        productosComprados.add(comprar);
                        cantidadesCompradas.add(cantidadAComprar);
                        System.out.println("COMPRA REALIZADA CON EXITO!");
                    }
                }
            }
            if (productoEncontrado == false) {
                System.out.println("Producto no encontrado. Elige un producto de los disponibles!");
            }
            productoEncontrado=false;
        }
        System.out.printf("El total de la compra es de %.2f", totalCompra);
        System.out.println("\nTu cesta de la compra:\n" + productosComprados + "\n" + cantidadesCompradas);
    }
}
