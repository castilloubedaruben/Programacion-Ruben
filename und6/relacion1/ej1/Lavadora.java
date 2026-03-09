public class Lavadora extends Electrodomestico {

    private int capacidadCarga;

    public Lavadora(String marca, String modelo, int capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ". Es una lavadora";
    }
}