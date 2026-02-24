package und5.relacion3.ejercicio2;

public class Cliente {
    private int id;
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    private String direccion;

    private static int contadorId = 0;

    public Cliente(String nombre, String dni, String telefono, String email, String direccion) {
        setId(contadorId);
        this.nombre = nombre;
        setDni(dni);
        setTelefono(telefono);
        setEmail(email);
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni != null) {
            this.dni = dni;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        String telefonoSinEspacios = telefono.trim();
        if (telefonoSinEspacios.length() < 9) {

        }
        this.telefono = telefonoSinEspacios;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ID Cliente: " + id + " - " + nombre + " - " + dni + ". Telefono " + telefono + ", correo de contacto: "
                + email + ", con direccion en " + direccion;
    }

}
