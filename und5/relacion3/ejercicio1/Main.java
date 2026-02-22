public class Main {

    public static void main(String[] args) {
        final int CANTIDADEMARCACIONES = 5;
        final int CANTIDADMAXIMAAMARRES = 10;
        int contador =0;
        Embarcacion aleatorio = new Embarcacion();
        Amarre aleatoria = new  Amarre();
        
        Puerto puertoMotril = new Puerto("Puerto Ennies Lobby", Faker.ciudad(), Faker.telefono());
                
        for (int i = 0; i < CANTIDADEMARCACIONES; i++) {
            aleatorio = new Embarcacion("A"+contador++, Faker.nombreEmbarcacion(), Faker.entero(0, 50),
                    Faker.tipoEmbarcacion(), Faker.nombreCompleto(), Faker.fechaYYYYMMDD(i, i),
                    Faker.precio(1000.00, 5000.00));
            puertoMotril.registrarEmbarcacion(aleatorio);
        }

        for (int i = 0; i < CANTIDADMAXIMAAMARRES; i++) {
            aleatoria = new Amarre(Faker.longitudMaximaAmarre(), Faker.tipoAmarre());
            puertoMotril.agregarAmarre(aleatoria);
        }
        System.out.println(puertoMotril);
        System.out.println(puertoMotril.asignarAmarre("BOAT-A1",4));
        System.out.println(puertoMotril.asignarAmarre("BOAT-A2",2));
        System.out.println(puertoMotril.asignarAmarre("BOAT-A3",8));
        System.out.println(puertoMotril.asignarAmarre("BOAT-A4",9));
        System.out.println(puertoMotril.mostrarAmarrerLibres()); 
        System.out.println(puertoMotril.mostrarAmarrerOcupados()); 
        System.out.println(puertoMotril.calcularIngresosDiariosActuales());
        System.out.println(puertoMotril.calcularIngresosDiariosMaximos());

    }

}