package und5.relacion3.ejercicio2;

import java.util.ArrayList;

public class Gestoria {
    private String nombre;
    public String direccion;
    public String telefono;
    private String horario;
    private ArrayList<Cliente> clientes;
    private ArrayList<Tramite> tramites;
    private ArrayList<Expediente> expedientes;

    private final String ABIERTO = "ABIERTO";
    private final String EN_PROCESO = "EN PROCESO";
    private final String FINALIZADO = "FINALIZADO";

    public Gestoria(String nombre, String direccion, String telefono, String horario, ArrayList<Cliente> clientes,
            ArrayList<Tramite> tramites, ArrayList<Expediente> expedientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.clientes = clientes;
        setClientes(clientes);
        setTramites(tramites);
        setExpedientes(expedientes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    public ArrayList<Expediente> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(ArrayList<Expediente> expedientes) {
        this.expedientes = expedientes;
    }

    public boolean altaCliente(Cliente clienteRegistrar) {
        boolean clienteRepetido = false;

        for (int i = 0; i < clientes.size() && !clienteRepetido; i++) {
            if (clientes.get(i).getDni().equals(clienteRegistrar.getDni())) {
                clienteRepetido = true;
            }
        }
        if (!clienteRepetido) {
            clientes.add(clienteRegistrar);
        }
        return clienteRepetido;
    }

    public boolean altaTramite(Tramite tramiteRegistrar) {
        boolean tramiteRepetido = false;

        for (int i = 0; i < tramites.size() && !tramiteRepetido; i++) {
            if (tramites.get(i).getCodigo().equals(tramiteRegistrar.getCodigo())) {
                tramiteRepetido = true;
            }
        }
        if (!tramiteRepetido) {
            tramites.add(tramiteRegistrar);
        }
        return tramiteRepetido;
    }

    public boolean abrirExpediente(Cliente cliente, Tramite tramite, String estado, boolean pagado,
            String fechaApertura) {
        boolean expedienteRegistrado = false;
        if (clientes.contains(cliente) && tramites.contains(tramite)) {
            Expediente nuevoExpediente = new Expediente(cliente, tramite, pagado, telefono);
            expedientes.add(nuevoExpediente);
            expedienteRegistrado = true;
        }
        return expedienteRegistrado;
    }

    public boolean cambiarEstado(Expediente expedienteModificar) {
        boolean estadoCambiado = false;
        if (expedientes.contains(expedienteModificar)) {
            if (expedienteModificar.getEstado().equals(ABIERTO)) {
                expedienteModificar.setEstado(EN_PROCESO);
                estadoCambiado = true;
            } else if (expedienteModificar.getEstado().equals(EN_PROCESO)) {
                expedienteModificar.setEstado(FINALIZADO);
                estadoCambiado = true;
            }
        }
        return estadoCambiado;
    }

    public boolean marcarPagado(Expediente expedienteModificar) {
        boolean pagadoCorrecto = false;
        if (!expedienteModificar.getEstado().equals(ABIERTO)) {
            expedienteModificar.setPagado(true);
            pagadoCorrecto = true;
        }
        return pagadoCorrecto;
    }

}
