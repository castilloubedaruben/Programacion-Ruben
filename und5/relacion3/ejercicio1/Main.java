public class Main {

    public static void main(String[] args) {
        final int CANTIDADMAXIMA = 4;
        Embarcacion aleatorio = new Embarcacion();
        Amarre aleatoria = new  Amarre();
        
        Puerto puertoMotril = new Puerto("Puerto Ennies Lobby", Faker.ciudad(), Faker.entero(0, 100), Faker.telefono());
                
        for (int i = 0; i < CANTIDADMAXIMA; i++) {
            aleatorio = new Embarcacion(Faker.matriculaEmbarcacion(), Faker.nombreEmbarcacion(), Faker.entero(0, 100),
                    Faker.tipoEmbarcacion(), Faker.nombreCompleto(), Faker.fechaYYYYMMDD(i, i),
                    Faker.precio(1000.00, 5000.00));
            puertoMotril.agregarEmbarcacion(aleatorio);
        }

        for (int i = 0; i < CANTIDADMAXIMA; i++) {
            aleatoria = new Amarre(Faker.entero(0, 200), Faker.precio(0, 10), Faker.tipoAmarre());
            puertoMotril.agregarAmarre(aleatoria);
        }

        System.out.println(puertoMotril);
        puertoMotril.asignarEmbarcacionAmarre(aleatorio.getMatricula());
        System.out.println(puertoMotril);
    }

}