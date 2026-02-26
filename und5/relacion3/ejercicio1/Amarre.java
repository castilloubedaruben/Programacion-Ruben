public class Amarre {

    private int numeroAmarre;
    private double longitudMaxima;
    private boolean ocupacion;
    private double precioDiario;
    private String tipoAmarre;

    private static int contadorParaAmarre = 1; // static para que sea un atributo de la clase Amarre para cada objeto creado

    public Amarre(double longitudMaxima, String tipoAmarre) {
        // como hemos puesto un identificador que se genera solo, no se puede crear el
        // constructor con este atributo
        // ya que queremos que se genere solo y no sea modificable, por esto eliminamos
        // el setter para que no puedan modificarlo nunca
        this.numeroAmarre = contadorParaAmarre;
        this.longitudMaxima = longitudMaxima;
        calcularPrecioDiario(tipoAmarre);
        this.tipoAmarre = tipoAmarre;
        this.ocupacion = false;
        contadorParaAmarre++;
    }

    public Amarre() {
    }

    public int getNumeroAmarre() {
        return numeroAmarre;
    }

    public double getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }
    
    public boolean getOcupacion() {
        return ocupacion;
    }

    public String consultarOcupacion() {
        String mensajeOcupacion = "Amarre Disponible";
        if (ocupacion == true) {
            mensajeOcupacion = "Amaare Ocupado";
        }
        return mensajeOcupacion;
    }

    public void setOcupacion(boolean ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        this.tipoAmarre = tipoAmarre;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void calcularPrecioDiario(String tipoAmarre) {
        if (tipoAmarre.equals("Normal")) {
            this.precioDiario = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equals("Premium")) {
            this.precioDiario = 60 + (2.2 * longitudMaxima);
        } else {
            this.precioDiario = 120 + (3.5 * longitudMaxima);
        }
    }

    @Override
    public String toString() {
        return "Amarre --> " + numeroAmarre + " | Longitud permitida: " + longitudMaxima + " | "
                + consultarOcupacion() + " | Precio diario: " + precioDiario + "€ | Tipo de Amarre: " + tipoAmarre + "\n";
    }

}