public class Amarre {

    private String numeroAmarre;
    private int longitudMaxima;
    private boolean ocupacion;
    double precioDiario;
    String tipoAmarre;

    private static int contadorParaAmarre=1; // static para que sea un atributo de la clase Amarre para cada objeto creado
    
    public Amarre(int longitudMaxima, double precioDiario, String tipoAmarre) {
        // como hemos puesto un identificador que se genera solo, no se puede crear el constructor con este atributo
        // ya que queremos que se genere solo y no sea modificable, por esto eliminamos el setter para que no puedan modificarlo nunca
        this.numeroAmarre = "A-"+contadorParaAmarre;
        this.longitudMaxima = longitudMaxima;
        this.ocupacion = true;
        this.precioDiario = precioDiario;
        this.tipoAmarre = tipoAmarre;
        contadorParaAmarre++;
    }

    public Amarre() {
    }

    public String getNumeroAmarre() {
        return numeroAmarre;
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public boolean getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(boolean ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Amarre --> " + numeroAmarre + " | Longitud permitida: " + longitudMaxima + " | " 
                + ocupacion + " | Precio diario: " + precioDiario + " | Tipo de Amarre: " + tipoAmarre + "\n";
    }

}