package und5.zoologicoPruebaChatGPT;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoologico {

    private String nombre;
    private ArrayList<Animal> animales;
    private ArrayList<Revision> revisiones;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
        this.revisiones = new ArrayList<>();
    }

    public void agregarAnimal(Animal animalAgregar) {
        animales.add(animalAgregar);
    }

    public boolean registrarRevision(String codigoAnimal, String fecha, String diagnostico, double coste) {
        Animal animalRevision = buscarAnimal(codigoAnimal);
        Revision revisionRegistrar = new Revision(animalRevision, fecha, diagnostico, coste);
        boolean correcto = false;
        if (animalRevision != null) {
            revisiones.add(revisionRegistrar);
            correcto = true;
        }
        return correcto;
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

    public ArrayList<Revision> listarRevisionesDeAnimal(String codigoAnimal) {
        Animal animalListar = buscarAnimal(codigoAnimal);
        ArrayList<Revision> revisionesAnimal = new ArrayList<>();

        if (animalListar != null) {
            for (Revision revision : revisiones) {
                if (revision.getAnimalDiagnosticar().equals(animalListar)) {
                    revisionesAnimal.add(revision);
                }
            }
        }
        return revisionesAnimal;
    }

    public double calcularGastoVeterinarioTotal() {
        double gastoTotal = 0;
        for (Revision revision : revisiones) {
            gastoTotal += revision.getCoste();
        }
        return gastoTotal;
    }

    public double calcularValorTotalZoologico() {
        double valorTotal = 0;
        for (Animal animal : animales) {
            valorTotal += animal.getCantidad() * animal.getPrecio();
        }
        return valorTotal;
    }

    public Animal animalConMasEjemplares() {
        Animal animalTop;
        if (animales.isEmpty()) {
            animalTop = null;
        }

        animalTop = animales.get(0);
        for (int i = 1; i < animales.size(); i++) {
            if (animales.get(i).getCantidad() > animalTop.getCantidad()) {
                animalTop = animales.get(i);
            }
        }
        return animalTop;
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

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

}
