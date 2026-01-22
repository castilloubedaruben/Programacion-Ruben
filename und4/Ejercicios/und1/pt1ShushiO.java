package und4.Ejercicios.und1;

import java.util.Scanner;

public class pt1ShushiO {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int totalPedidos = 0, totalArroz = 0, contador = 0;
        double totalAgua = 0;
        boolean stockSuperado = false;
        final int PRECIOMAKI = 8, PRECIONIGIRI = 10, PRECIOSASHIMI = 12;
        final int GASTOARROZMAKI = 120, GASTOARROZNIGIRI = 50, GASTOARROZSASHIMI = 0;
        final double GASTOAGUAMAKI = 0.10, GASTOAGUANIGIRI = 0.05, GASTOAGUASASHIMI = 0.02;
        String tipoPlatoElegido = "";
        int numeroUnidadesPedidas = 0, precioPedido = 0, totalArrozPedidoGastado = 0, arrozConsumidoTotal = 0;
        double totalAguaPedidoGastada = 0, aguaConsumidaTotal = 0;

        System.out.println("Indique el numero de pedidos");
        while (totalPedidos <= 0) {
            totalPedidos = scanner1.nextInt();
        }
        System.out.println("Indique cantidad de arroz");
        while (totalArroz <= 0) {
            totalArroz = scanner1.nextInt();
        }
        System.out.println("Indique cantidad litros de agua");
        while (totalAgua <= 0) {
            totalAgua = scanner1.nextInt();
            scanner1.nextLine();
        }

        System.out.println("Numero de pedidos: " + totalPedidos + "\nStock de arroz(g): " + totalArroz
                + "\nStock de agua(L): " + totalAgua);

        for (int i = 0; i < totalPedidos && !stockSuperado; i++) {
            System.out.println("\nElige un plato: Maki, Nigiri, Sashimi");
            tipoPlatoElegido = scanner1.nextLine();
            while (!tipoPlatoElegido.equalsIgnoreCase("maki") && !tipoPlatoElegido.equals("nigiri")
                    && !tipoPlatoElegido.equals("sashimi")) {
                System.out.println("Introduce un tipo de plato correcto");
                tipoPlatoElegido = scanner1.nextLine();
            }

            System.out.println("Elige numero de unidades");
            numeroUnidadesPedidas = scanner1.nextInt();
            scanner1.nextLine();
            while (numeroUnidadesPedidas <= 0) {
                System.out.println("Introduce un numero correcto");
                numeroUnidadesPedidas = scanner1.nextInt();
                scanner1.nextLine();
            }
            if (tipoPlatoElegido.equals("maki")) {
                precioPedido = numeroUnidadesPedidas * PRECIOMAKI;
                totalArrozPedidoGastado = numeroUnidadesPedidas * GASTOARROZMAKI;
                totalAguaPedidoGastada = numeroUnidadesPedidas * GASTOAGUAMAKI;

            } else if (tipoPlatoElegido.equals("nigiri")) {
                precioPedido = numeroUnidadesPedidas * PRECIONIGIRI;
                totalArrozPedidoGastado = numeroUnidadesPedidas * GASTOARROZNIGIRI;
                totalAguaPedidoGastada = numeroUnidadesPedidas * GASTOAGUANIGIRI;

            } else {
                precioPedido = numeroUnidadesPedidas * PRECIOSASHIMI;
                totalArrozPedidoGastado = numeroUnidadesPedidas * GASTOARROZSASHIMI;
                totalAguaPedidoGastada = numeroUnidadesPedidas * GASTOAGUASASHIMI;

            }
            contador++;
            arrozConsumidoTotal += totalArrozPedidoGastado;
            aguaConsumidaTotal += totalAguaPedidoGastada;

            if (arrozConsumidoTotal >= totalArroz || aguaConsumidaTotal >= totalAgua) {
                stockSuperado = true;
                if (arrozConsumidoTotal >= totalArroz) {
                    System.out.println("Stock de arroz superado! No se pueden servir mas pedidos");
                } else {
                    System.out.println("Stock de agua superado! No se pueden servir mas pedidos");
                }
            } else {
                System.out.println("---- Pedido " + contador + " ----\nTipo de plato:" + tipoPlatoElegido
                        + "\nUnidades:"
                        + numeroUnidadesPedidas + "\nPlato:" + tipoPlatoElegido + " | Unidades: "
                        + numeroUnidadesPedidas
                        + " | Importe cobrado: " + precioPedido + "€" +
                        "\nArroz gastado: " + totalArrozPedidoGastado + "g | Acumulado: " + arrozConsumidoTotal + "g"
                        + "\nAgua gastada: " + totalAguaPedidoGastada + "L | Acumulado: " + aguaConsumidaTotal);
            }
        }

        scanner1.close();
    }
}
