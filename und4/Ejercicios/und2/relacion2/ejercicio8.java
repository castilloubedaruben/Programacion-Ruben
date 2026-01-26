
import java.util.ArrayList;
import java.util.Scanner;

// 8. Gestión de Reservas de un Restaurante
// Escribe un programa para gestionar las reservas en un restaurante. 
// Usa dos arrays: uno para los nombres de los clientes que han hecho una reserva y otro para almacenar el número de personas que cada cliente ha reservado. 
// El programa debe mostrar un menú con las siguientes opciones:
// Añadir una nueva reserva (nombre del cliente y número de personas).
// Ver la lista de reservas actuales.
// Calcular el total de personas reservadas para ese día.
// Cancelar una reserva existente (por nombre del cliente).
// Salir del programa.
public class ejercicio8 {

    public static void mostrarMenu() {
        System.out.println("\nElige una opcion:\n1:Añadir una nueva reserva\n2:Ver la lista de reservas actuales\n3:Total de personas reservadas para ese día\n4:Cancelar una reserva existente\n5:Salir");
    }

    public static String cancelarReserva(String clienteAnular,ArrayList<String> arrayClientes, ArrayList<Integer> arrayPersonasPorReserva) {
        String mensaje="";
        boolean encontrarReserva=false;
                for (int i = 0; i < arrayClientes.size() && !encontrarReserva; i++) {
                    if (clienteAnular.equalsIgnoreCase(arrayClientes.get(i))) {
                        encontrarReserva=true;
                        arrayClientes.remove(i);
                        arrayPersonasPorReserva.remove(i);
                        mensaje="Reserva eliminada correctamente!";
                    } 
                }
                if (!encontrarReserva) {
                    mensaje="Nombre de la reserva no encontrada";
                }
        return mensaje;
    }
    public static void main(String[] args) {
        ArrayList<String> nombreReserva = new ArrayList<>();
        ArrayList<Integer> numeroPersonasReserva = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        int opcionUsuario, numeroPersonas=0, totalPersonasRestaurante=0;
        String nombreCliente,nombreClienteAnular,mensajeCancelacionReserva;
        boolean salirPrograma = false, reservaEncontrada=false;
        

        while (!salirPrograma) {
            try {
                mostrarMenu();
                opcionUsuario = Integer.parseInt(scanner1.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("VALOR ERRONEO! Introduce un numero entero entre 1-5");
                opcionUsuario = -1;
            }
            if (opcionUsuario == 1) {
                System.out.println("Indique el nombre para hacer la reserva");
                nombreCliente=scanner1.nextLine();
                try {
                    System.out.println("Indique el numero de personas de la reserva");
                    numeroPersonas=Integer.parseInt(scanner1.nextLine());
                    if (numeroPersonas<=0) {
                        System.out.println("ERROR! Introduce un numero positivo");
                    } else {
                        nombreReserva.add(nombreCliente);
                        numeroPersonasReserva.add(numeroPersonas);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ERROR! Introduce un numero entero, no caracteres");
                } 
            } else if (opcionUsuario == 2) {
                for (int i = 0; i < nombreReserva.size(); i++) {
                    System.out.println("Reservas de hoy --> " + (i+1) + ": "+ nombreReserva.get(i) + " para " + numeroPersonasReserva.get(i) + " personas\n");
                }
            } else if (opcionUsuario == 3) {
                totalPersonasRestaurante=0; // reiniciarlo porque si no cada vez que pulso la opcion 3 contabiliza los que ya habia guardados antes en la variable (ERROR ENCONTRADO POST REVISION)
                for (Integer personas : numeroPersonasReserva) {
                    totalPersonasRestaurante+=personas;
                }
                System.out.println("Total de comensales en el dia de hoy "+totalPersonasRestaurante);
            } else if (opcionUsuario == 4) {
                System.out.println("Indique el nombre del cliente para anular la reserva:");
                nombreClienteAnular=scanner1.nextLine();
                mensajeCancelacionReserva=cancelarReserva(nombreClienteAnular,nombreReserva,numeroPersonasReserva);
                System.out.println(mensajeCancelacionReserva);
            } else if (opcionUsuario == 5) {
                salirPrograma = true;
            } else {
                System.out.println("Elige una opcion entre 1-5");
            }
        }
        scanner1.close();
    }
}
