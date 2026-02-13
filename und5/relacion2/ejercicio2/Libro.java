package und5.relacion2.ejercicio2;

public class Libro {

    private String id;
    private String titulo;
    private String autor;
    private String sinopsis;
    private boolean disponible;

    public Libro(String id, String titulo, String autor, String sinopsis, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.disponible = disponible;
    }

    public Libro() {
        this.id = null;
        this.titulo = null;
        this.autor = null;
        this.sinopsis = null;
        this.disponible = false;
    }

    public String getId() {
        String idMostrar = this.id;
        if (this.id == null) {
            idMostrar = "No se puede consultar id vacio";
        }
        return idMostrar;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        StringBuilder mostrarLibro = new StringBuilder();
        mostrarLibro.append("Libro:");
        mostrarLibro.append("id=").append(id);
        mostrarLibro.append(", titulo=").append(titulo);
        mostrarLibro.append(", autor=").append(autor);
        mostrarLibro.append(", sinopsis=").append(sinopsis);
        if (disponible) {
            mostrarLibro.append("libro disponible");
        } else {
            mostrarLibro.append("libro no disponible");
        }
        return mostrarLibro.toString();
    }

}
