public class Main {

    public static void main(String[] args) {
        final int CANTIDADMAXIMAAMARRES = 10;
        final int CANTIDADEMARCACIONES = 5;
        Embarcacion aleatorio = new Embarcacion();
        Amarre aleatoria = new  Amarre();
        
        Puerto puertoMotril = new Puerto("Puerto Ennies Lobby", Faker.ciudad(), Faker.entero(0, 100), Faker.telefono());
                
        // for (int i = 0; i < CANTIDADEMARCACIONES; i++) {
        //     aleatorio = new Embarcacion(Faker.matriculaEmbarcacion(), Faker.nombreEmbarcacion(), Faker.entero(0, 100),
        //             Faker.tipoEmbarcacion(), Faker.nombreCompleto(), Faker.fechaYYYYMMDD(i, i),
        //             Faker.precio(1000.00, 5000.00));
        //     puertoMotril.agregarEmbarcacion(aleatorio);
        // }

        for (int i = 0; i < CANTIDADMAXIMAAMARRES; i++) {
            aleatoria = new Amarre(Faker.entero(0, 200), Faker.precio(0, 10), Faker.tipoAmarre());
            puertoMotril.agregarAmarre(aleatoria);
        }

        Embarcacion barco1 = new Embarcacion("15632", null, CANTIDADMAXIMAAMARRES, null, null, null, 800);
        if (barco1.valorEstimado<0) {
            barco1.valorEstimado=0;
            System.out.println("No se puede negativos");
        }
        System.out.println(barco1);

        // System.out.println(puertoMotril);
        
        // System.out.println(puertoMotril);
    }

}