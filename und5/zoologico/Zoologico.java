package und5.zoologico;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private int capacidad;
    private String horario;
    private static ArrayList<Animal> animales;
    
    public Zoologico(String nombre, String ubicacion, int capacidad, String horario, ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.horario = horario;
        this.animales = new ArrayList<>();
    }
    
    
    /*
    * 
    * @param mensajeAMostrar
    */
   public static void imprimirMensaje(String mensajeAMostrar) {
       System.out.println(mensajeAMostrar);
    }
    
    /**
     * Muestra un ArrayList de animales numerado por pantalla
    *
    * @param mensaje Texto que se muestra antes del listado
    */
   public static void mostrarAnimales(String mensaje) {
       imprimirMensaje(mensaje);
       
       for (int i = 0; i < animales.size(); i++) {
           System.out.println("Animal " + (i + 1) + " - " + animales.get(i));
        }
    }
    
    public void agregarAnimal(Animal animalAgregar) {
        animales.add(animalAgregar);
    }
    
    public boolean buscarAnimal(String codigoAnimal) {
        boolean animalEncontrado = false;
        for (int i = 0; i < animales.size() && !animalEncontrado; i++) {
            if (animales.get(i).getCodigo().equalsIgnoreCase(codigoAnimal)) {
                animalEncontrado = true;
            }
        }
        return animalEncontrado;
    }
    
    public boolean agregarEjemplares(String codigoAnimal, int cantidad) {
        boolean añadirCorrecto=false;
        for (int i = 0; i < animales.size(); i++) {
            if (buscarAnimal(codigoAnimal)) {
                Animal animalModificarEjemplares = animales.get(i);
                int cantidadActual=animalModificarEjemplares.getCantidad();
                animalModificarEjemplares.setCantidad(cantidadActual+=cantidad);
                añadirCorrecto=true;
            }
        }
        return añadirCorrecto;
    }
    
    @Override
    public String toString() {
        return "Zoologico " + nombre + ", ubicado en " + ubicacion + ", tiene una capacidad para " + capacidad
        + " personas. Horario de visitas: " + horario;
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
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public static ArrayList<Animal> getAnimales() {
        return animales;
    }
    
    public static void setAnimales(ArrayList<Animal> animales) {
        Zoologico.animales = animales;
    }
    
}
