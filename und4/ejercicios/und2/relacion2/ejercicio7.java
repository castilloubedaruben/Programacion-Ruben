// 7. Control de Gastos Mensuales
// Escribe un programa que permita al usuario llevar un control de sus gastos mensuales.
// Usa dos arrays: uno para los nombres de los gastos (por ejemplo, "comida", "transporte", etc.) y otro para las cantidades gastadas en cada categoría.

//  El programa debe mostrar un menú con las siguientes opciones:
// Añadir un nuevo gasto (nombre y cantidad).
// Ver el total de gastos hasta el momento.
// Ver los gastos más altos y más bajos del mes.
// Ver el promedio de gasto diario (suponiendo un mes de 30 días).
// Salir del programa.

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    public static void mostrarMenu() {
        System.out.println("\nElige una opcion:\n1:Añadir un nuevo gasto\n2:Total de gastos hasta el momento\n3:Gasto más alto y más bajo del mes\n4:Promedio de gasto diario\n5:Salir");
    }

    public static double calcularTotalGastos(ArrayList<Double> gastosTotales) {
        double sumaGastos=0;
        for (double gasto : gastosTotales) {
                    sumaGastos+=gasto;
                }
        return sumaGastos;
    }

    public static void main(String[] args) {
        ArrayList<String> gastos = new ArrayList<String>();
        ArrayList<Double> importeGastos = new ArrayList<Double>();
        Scanner scanner1 = new Scanner(System.in);

        String nuevoGasto;
        int opcionUsuario=0;
        double totalGastos=0,mediaGastoMensual=0,importeGasto,gastoMasAlto,gastoMasBajo;
        boolean finalizarPrograma = false;
        final int DIASMES = 30;


        while (!finalizarPrograma) {
            try {
                mostrarMenu();
                opcionUsuario=Integer.parseInt(scanner1.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("VALOR ERRONEO! Introduce un numero entero entre 1-5");
                opcionUsuario = -1;
            }
            if (opcionUsuario==1) {
                System.out.println("Añade un nuevo gasto:");
                nuevoGasto=scanner1.nextLine();
                gastos.add(nuevoGasto);
                try {
                    System.out.println("Importe del nuevo gasto:");
                    importeGasto=Double.parseDouble(scanner1.nextLine());
                    importeGastos.add(importeGasto);
                } catch (NumberFormatException e) {
                    System.out.println("ERROR! Introduce un numero valido");
                }
            } else if (opcionUsuario==2) {
                System.out.printf("El total de gastos hasta el momento es de %.2f\n",calcularTotalGastos(importeGastos));
            } else if (opcionUsuario==3) {
                gastoMasAlto=importeGastos.get(0);
                gastoMasBajo=importeGastos.get(0);
                for (int i = 0; i < importeGastos.size(); i++) {
                    if (gastoMasAlto<importeGastos.get(i)) {
                        gastoMasAlto=importeGastos.get(i);
                    } if (gastoMasBajo>importeGastos.get(i)) {
                        gastoMasBajo=importeGastos.get(i);
                    }
                }
                System.out.printf("El gasto mas alto es %.2f y el mas bajo es %.2f",gastoMasAlto,gastoMasBajo,"\n");
            } else if (opcionUsuario==4) {
                mediaGastoMensual=calcularTotalGastos(importeGastos)/DIASMES;
                System.out.printf("El gasto medio diario es de %.2f",mediaGastoMensual);
            } else if (opcionUsuario==5) {
                finalizarPrograma=true;
            } else {
                System.out.println("Elige una opcion entre 1-5");
            } 
        }
        scanner1.close();
    }
}