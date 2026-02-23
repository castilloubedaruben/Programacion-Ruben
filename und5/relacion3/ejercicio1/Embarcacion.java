public class Embarcacion {
    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private String anioFabricacion;
    double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario,
            String anioFabricacion, double valorEstimado) {
        setMatricula(matricula);
        this.nombre = nombre;
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
        this.valorEstimado = valorEstimado;
    }

    public Embarcacion() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        String prefijoMatricula = "BOAT-";
        if (matricula.startsWith(prefijoMatricula)) {
            this.matricula = matricula;
        } else {
            this.matricula = prefijoMatricula + matricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Embarcacion --> " + nombre + " - " + matricula + " | Eslora:" + eslora + "m | Tipo de embarcacion: "
                + tipo
                + " propiedad de: " + propietario + " | Año de fabricacion: " + anioFabricacion + " | Valor estimado: "
                + valorEstimado + "\n";
    }
}
