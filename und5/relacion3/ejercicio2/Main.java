package und5.relacion3.ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ruben", "75571151G", "958266312351", "R@gmail.com", "aqui");
        Tramite tramite1 = new Tramite("Tramite de extranjeria", 0, 4);
        Tramite tramite2 = new Tramite("Tramite de otra cosa", 0, 9);
        Expediente expediente1 = new Expediente(cliente1, tramite1, "05-05-2005");
        Gestoria gestoria = new Gestoria("nombre", "direccion", "telefono", "horario", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        System.out.println(cliente1);
        System.out.println(tramite1);
        System.out.println(tramite2);
        System.out.println(expediente1);
        System.out.println(gestoria.cambiarEstado(expediente1));
        System.out.println(gestoria.marcarPagado(expediente1));
        System.out.println(expediente1);
        
        
    }
}
