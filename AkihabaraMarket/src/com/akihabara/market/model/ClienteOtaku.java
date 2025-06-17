// El paquete al que pertenece el archivo
package com.akihabara.market.model;  

//Se importa la clase Date de SQL para representar la fecha de registro del cliente
import java.sql.Date;  

public class ClienteOtaku {  
    // Clase pública que representa a un cliente otaku con sus datos personales

    protected String dni;  
    private String nombre;  
    private String email;  
    private String telefono;  
    private Date fechaRegistro;  
    
    // Constructor vacío como se requería
    public ClienteOtaku() {}  

    // Constructor que inicializa todos los atributos del cliente, el que se usará para crear objetos de esta clase
    public ClienteOtaku(String dni, String nombre, String email, String telefono, Date fechaRegistro) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro; ç
    }

    // Getters que permiten acceder a los valores privados desde fuera de la clase

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    // Setters que permiten modificar los valores privados desde fuera de la clase

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        // Método que devuelve una representación de los datos de un cliente
        return "------------------------------------\nDatos del Cliente\n------------------------------------\n"
                + "DNI: " + dni
                + "\nNombre: " + nombre
                + "\nEmail: " + email
                + "\nTeléfono: " + telefono
                + "\nFecha de Registro: " + fechaRegistro + "\n";
    }
}

