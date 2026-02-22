import java.util.ArrayList;

public class Puerto {
    private String nombre;
    String ubicacion;
    private int capacidadMaxima;
    String telefonoContacto;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<Amarre> amarres;

    public Puerto(String nombre, String ubicacion, String telefonoContacto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = 50;
        this.telefonoContacto = telefonoContacto;
        this.embarcaciones = new ArrayList<>();
        this.amarres = new ArrayList<>();
    }

    public Puerto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima > amarres.size()) {
            this.capacidadMaxima = capacidadMaxima;
        }
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public ArrayList<Embarcacion> getEmbarcaciones() {
        return embarcaciones;
    }

    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void registrarEmbarcacion(Embarcacion embarcacionAgregar) {
        embarcaciones.add(embarcacionAgregar);
    }

    public void agregarAmarre(Amarre amarreAgregar) {
        amarres.add(amarreAgregar);
    }

    public String asignarAmarre(String matriculaEmbarcacionAsignar, int amarreAsignar) {
        String mensaje="";
        int esloraEmbarcacion = buscarEmbarcacion(matriculaEmbarcacionAsignar).getEslora();
        double capacidadAmarre = 0;
        for (int i = 0; i < amarres.size(); i++) {
            if (amarres.get(i).getNumeroAmarre() == amarreAsignar) {
                capacidadAmarre=amarres.get(i).getLongitudMaxima();
            }

            if ((esloraEmbarcacion <= capacidadAmarre) && !amarres.get(i).getOcupacion()) {
                amarres.get(i).setOcupacion(true);
                mensaje = "Embarcacion asignada correctamente";
            } else {
                mensaje = "No se ha podido asignar embarcacion al amarre";
            }
        }
        return mensaje;
    }

    public String liberarAmarre(Amarre amarreAsignar) {
        String mensaje;
        if (!amarreAsignar.getOcupacion()) {
            amarreAsignar.setOcupacion(true);
            mensaje = "Amarre liberado";
        } else {
            mensaje = "No se ha podido liberar amarre";
        }
        return mensaje;
    }

    public ArrayList mostrarAmarrerLibres() {
        ArrayList amarresLibres = new ArrayList();
        for (Amarre amarre : amarres) {
            if (amarre.getOcupacion()) {
                amarresLibres.add(amarre);
            }
        }
        return amarresLibres;
    }

    public ArrayList mostrarAmarrerOcupados() {
        ArrayList amarresOcupados = new ArrayList();
        for (Amarre amarre : amarres) {
            if (!amarre.getOcupacion()) {
                amarresOcupados.add(amarre);
            }
        }
        return amarresOcupados;
    }

    public Embarcacion buscarEmbarcacion(String matriculaBuscar) {
        Embarcacion embarcacionBuscar = new Embarcacion();
        for (Embarcacion barco : embarcaciones) {
            if (barco.getMatricula().equals(matriculaBuscar)) {
                embarcacionBuscar = barco;
            }
        }
        return embarcacionBuscar;
    }

    public double calcularIngresosDiariosActuales() {
        double totalIngresosDiarios = 0;
        for (Amarre amarre : amarres) {
            if (!amarre.getOcupacion()) {
                totalIngresosDiarios += amarre.precioDiario;
            }
        }
        return totalIngresosDiarios;
    }

    public double calcularIngresosDiariosMaximos() {
        double totalIngresosDiarios = 0;
        for (Amarre amarre : amarres) {
            totalIngresosDiarios += amarre.precioDiario;
        }
        return totalIngresosDiarios;
    }

    @Override
    public String toString() {
        return "Puerto " + nombre + " | " + ubicacion + " | capacidad: " + capacidadMaxima
                + " | telefono de contacto: " + telefonoContacto + "\n Embarcaciones:\n" + embarcaciones
                + "\n Amarres:\n" + amarres;
    }
}
