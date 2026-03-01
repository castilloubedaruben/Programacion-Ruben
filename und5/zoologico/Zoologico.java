package und5.zoologico;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoologico {

    private String nombre;
    private static ArrayList<Animal> animales;

    public Zoologico(String nombre, ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animalAgregar) {
        animales.add(animalAgregar);
    }

    public Animal buscarAnimal(String codigo) {
        Animal encontrado = null;
        for (int i = 0; i < animales.size() && encontrado == null; i++) {
            if (animales.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                encontrado = animales.get(i);
            }
        }
        return encontrado;
    }

    public boolean agregarEjemplares(String codigo, int cantidad) {
        boolean correcto = false;
        Animal animalAgregar = buscarAnimal(codigo);

        if (animalAgregar != null) {
            animalAgregar.setCantidad(animalAgregar.getCantidad() + cantidad);
            correcto = true;
        }
        return correcto;
    }

    public boolean eliminarAnimal(String codigo) {
        boolean eliminado = false;
        for (int i = 0; i < animales.size() && !eliminado; i++) {
            Animal animalEliminar = animales.get(i);
            if (animalEliminar.getCodigo().equalsIgnoreCase(codigo) && animalEliminar.getCantidad() == 0) {
                animales.remove(i);
                eliminado = true;
            }
        }
        return eliminado;
    }

public ArrayList<Boolean> retirarEjemplares(String codigoAnimal, int cantidadARetirar) {
    ArrayList<Boolean> controlErrores = new ArrayList<>(Arrays.asList(false, true));
    // 0 no existe = false | 1 hay suficientes animales = true
        boolean encontrado = false;

        for (int i = 0; i < animales.size() && !encontrado; i++) {
            Animal a = animales.get(i);

            if (a.getCodigo().equalsIgnoreCase(codigoAnimal)) {
                encontrado = true; 
                controlErrores.set(0, true); // cambia a true cuando encuentra el animal

                if (a.getCantidad() >= cantidadARetirar) {
                    a.setCantidad(a.getCantidad() - cantidadARetirar);
                } else {
                    controlErrores.set(1, false); // No hay suficientes animales
                }
            }
        }
        return controlErrores;
    }

    @Override
    public String toString() {
        return "Zoologico " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Animal> getAnimales() {
        return animales;
    }

    public static void setAnimales(ArrayList<Animal> animales) {
        Zoologico.animales = animales;
    }

}
