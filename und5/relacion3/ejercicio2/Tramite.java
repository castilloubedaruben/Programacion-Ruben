package und5.relacion3.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tramite {
    private String codigo;
    private String nombreTramite;
    private double precioBase;
    private boolean requiereCita;
    private int duracionDias;

    public static int numeroTramite=0;
    public static String prefijoTramite = "TRM-";
    public final static ArrayList<String> OPCIONESVALIDAS = new ArrayList<>(
            Arrays.asList("TRAMITE DE EXTRANJERIA", "GESTION DE HERENCIAS", "CONSTITUCION DE SOCIEDAD"));

    public Tramite(String nombreTramite, double precioBase, int duracionDias) {
        setCodigo();
        this.nombreTramite = nombreTramite;
        setPrecioBase(precioBase);
        setRequiereCita(requiereCita);
        setDuracionDias(duracionDias);
        numeroTramite++;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo=prefijoTramite+numeroTramite;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase >= 0) {
            this.precioBase = precioBase;
        }
    }

    public boolean isRequiereCita() {
        return requiereCita;
    }

    public void setRequiereCita(boolean requiereCita) {
        if (OPCIONESVALIDAS.contains(nombreTramite.toUpperCase())) {
            this.requiereCita = true;
        } else {
            this.requiereCita = false;
        }
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        if (duracionDias >= 1) {
            this.duracionDias = duracionDias;
        }
    }

    public String necesitaCita() {
        String mensaje = "No necesita cita previa";
        if (requiereCita) {
            mensaje = "Requiere solicitar cita previa";
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Datos del tramite " + codigo + ": " + nombreTramite + ". Tiene un precio de " + precioBase
                + " y una duracion de " + duracionDias + ". " + necesitaCita();
    }
}
