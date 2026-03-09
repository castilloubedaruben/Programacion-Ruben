public class Televisor extends Electrodomestico{

    private int tamañoPantalla;

    public Televisor(String marca, String modelo, int tamañoPantalla) {
        super(marca, modelo);
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return super.toString() + ". Televisor de " + tamañoPantalla + " pulgadas." ;
    }
}