package und5.zoologico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Caballo", 2, 10.20);
        Animal animal2 = new Animal("perro", 2, 10.20);
        Animal animal3 = new Animal("loro", 2, 10.20);
        Zoologico zoologico = new Zoologico("Selvo", "Malaga", 500, "09-20", new ArrayList<>());

        zoologico.agregarAnimal(animal1);
        zoologico.agregarAnimal(animal2);
        zoologico.agregarAnimal(animal3);
        zoologico.mostrarAnimales("Animales disponibles:");

        

    }
}
