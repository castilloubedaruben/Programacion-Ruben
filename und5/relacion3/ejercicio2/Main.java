package und5.relacion3.ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ruben", "75571151G", "958266316", "R@gmail.com", "aqui");
        Cliente cliente2 = new Cliente("Reda", "23571145F", "958253630", "Reda@gmail.com", "alli");
        Cliente cliente3 = new Cliente("Alex", "56571198P", "958212534", "Alex@gmail.com", "otro sitio");
        Tramite tramite1 = new Tramite("Tramite de extranjeria", 25.60, 4);
        Tramite tramite2 = new Tramite("Tramite de otra cosa", 45.20, 9);
        Tramite tramite3 = new Tramite("Gestion de herencias", 30.80, 15);
        // Expediente expediente1 = new Expediente(cliente1, tramite1, "05-05-2025");
        // Expediente expediente2 = new Expediente(cliente2, tramite2, "10-08-2025");
        // Expediente expediente3 = new Expediente(cliente3, tramite3, "05-02-2026");
        Gestoria gestoria = new Gestoria("Gestoria Ruben", "Calle Alonso Cano nº23", "958553593", "08:00-15:00",
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        gestoria.altaCliente(cliente1);
        gestoria.altaCliente(cliente2);
        gestoria.altaCliente(cliente3);
        gestoria.altaTramite(tramite1);
        gestoria.altaTramite(tramite2);
        gestoria.altaTramite(tramite3);
        gestoria.abrirExpediente(cliente1, tramite1, "05-02-2026");
        gestoria.abrirExpediente(cliente2, tramite2, "15-02-2026");
        gestoria.abrirExpediente(cliente3, tramite3, "25-02-2026");
        gestoria.abrirExpediente(cliente1, tramite3, "01-03-2026");

        // Expediente expedienteModificar=gestoria.buscarExpediente(0);

        // gestoria.cambiarEstado(expedienteModificar);
        // System.out.println(expedienteModificar);
        // gestoria.cambiarEstado(expedienteModificar);
        // System.out.println(expedienteModificar);

        // expedienteModificar=gestoria.buscarExpediente(2);
        // System.out.println(gestoria.cambiarEstado(expedienteModificar));

        // System.out.println(gestoria.mostrarPorEstado("ABIERTO"));

        System.out.println(gestoria);
    }
}
