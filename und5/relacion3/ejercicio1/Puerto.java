import java.util.ArrayList;

import und5.relacion2.eje1.barco;

public class Puerto {
    private String nombre;
    String ubicacion;
    private int capacidadMaxima;
    String telefonoContacto;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<Amarre> amarres;
    
    public Puerto(String nombre, String ubicacion, int capacidadMaxima, String telefonoContacto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.telefonoContacto = telefonoContacto;
        this.embarcaciones=new ArrayList<>();
        this.amarres=new ArrayList<>();
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
        this.capacidadMaxima = capacidadMaxima;
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

    public void agregarEmbarcacion(Embarcacion embarcacionAgregar) {
        embarcaciones.add(embarcacionAgregar);
    }

    public void agregarAmarre(Amarre amarreAgregar) {
        amarres.add(amarreAgregar);
    }

    public Embarcacion buscarMatriculaEmbarcacion(String matriculaBuscar) {
        Embarcacion embarcacionBuscar = new Embarcacion();
        for (Embarcacion barco : embarcaciones) {
            if (barco.getMatricula().equals(matriculaBuscar)) {
                embarcacionBuscar=barco;
            }
        }
        return embarcacionBuscar;
    }

    public String asignarEmbarcacionAmarre(String matriculaEmbarcacionAsignar) {
        String mensaje="No se ha podido asignar el amarre";
        int esloraEmbarcacion=buscarMatriculaEmbarcacion(matriculaEmbarcacionAsignar).getEslora();
        for (int i = 0; i < amarres.size(); i++) {
            if (esloraEmbarcacion<=amarres.get(i).getLongitudMaxima()) {
                amarres.get(i).setOcupacion(false);
                mensaje="Barco asignado con exito! Ocupacion modificada";
            }
        }
        return mensaje;
    }

    @Override
    public String toString() {
        return "Puerto " + nombre + " | " + ubicacion + " | capacidad: " + capacidadMaxima
                + " | telefono de contacto: " + telefonoContacto + "\n Embarcaciones:\n" + embarcaciones + "\n Amarres:\n" + amarres;
    }
}
