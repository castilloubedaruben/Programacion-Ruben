package und5.relacion3.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Expediente {
    private int numeroExpediente;
    private Cliente cliente;
    private Tramite tramite;
    private String estado;
    private boolean pagado;
    public String fechaApertura;

    public static ArrayList<String> ESTADOSCORRECTOS = new ArrayList<>(Arrays.asList("ABIERTO", "EN PROCESO", "FINALIZADO"));
    public static int contadorNumeroExpediente=0;

    public Expediente(Cliente cliente, Tramite tramite, String fechaApertura) {
        setNumeroExpediente();
        this.cliente = cliente;
        this.tramite = tramite;
        this.estado="ABIERTO";
        this.pagado=false;
        this.fechaApertura = fechaApertura;

        contadorNumeroExpediente++;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente() {
        this.numeroExpediente = contadorNumeroExpediente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        if (this.pagado) {
            this.pagado=true;
        } else {
            if (estado.equals("ABIERTO")) {
                this.pagado=false;
            } else {
                this.pagado=pagado;
            }
        }
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (ESTADOSCORRECTOS.contains(estado.toUpperCase())) {
            this.estado = estado;
        } else {
            this.estado="ABIERTO";
        }
    }

    @Override
    public String toString() {
        return "Expediente" + numeroExpediente + ". "+ cliente + ". " + tramite
                + ".Estado " + estado + ". Pagado: " + pagado + ". Abierto el dia " + fechaApertura;
    }

}
