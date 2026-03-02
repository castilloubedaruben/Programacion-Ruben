package und5.zoologicoPruebaChatGPT;

public class Revision {
    private String codigoRevision;
    public String fecha;
    private String diagnostico;
    private double coste;
    private Animal animalDiagnosticar;

    private static int numeroRevisiones = 1;

    public Revision(Animal animal, String fecha, String diagnostico, double coste) {
        this.codigoRevision = "REV-" + numeroRevisiones;
        this.animalDiagnosticar = animal;
        this.fecha = fecha;
        setDiagnostico(diagnostico);
        setCoste(coste);

        numeroRevisiones++;
    }

    public static int getNumeroRevisiones() {
        return numeroRevisiones;
    }

    public static void setNumeroRevisiones(int numeroRevisiones) {
        Revision.numeroRevisiones = numeroRevisiones;
    }

    public String getCodigoRevision() {
        return codigoRevision;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico != null) {
            this.diagnostico = diagnostico;
        } else {
            this.diagnostico = "PENDIENTE";
        }
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        if (coste > 0) {
            this.coste = coste;
        }
    }

    public Animal getAnimalDiagnosticar() {
        return animalDiagnosticar;
    }

    public void setAnimalDiagnosticar(Animal animalDiagnosticar) {
        this.animalDiagnosticar = animalDiagnosticar;
    }

    @Override
    public String toString() {
        return codigoRevision + " - " + fecha + ". Animal para el diagnostico: " + animalDiagnosticar.getNombre() + ". Diagnostico:"
                + diagnostico
                + ". Coste: " + coste;
    }

}
