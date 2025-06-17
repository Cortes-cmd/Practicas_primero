//Paquete al que pertenece la clase
package com.akihabara.market.model;

importación de sql.Date para usarla en fecha
import java.sql.Date;
import java.util.List;

//Declaración de los datos de la clasePedido
public class PedidoOtaku {
    private int idPedido;
    private String dniCliente;
    private Date fecha;
    private List<DetallePedidoOtaku> detalles;

    // Constructores, uno vacío y el que nos permite usar los atributos de la clase
    public PedidoOtaku() {}

    public PedidoOtaku(int idPedido, String dniCliente, Date fecha) {
        this.idPedido = idPedido;
        this.dniCliente = dniCliente;
        this.fecha = fecha;
    }

    // Getters y Setters para obtener los datos privados y acceder a ellos
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public String getDniCliente() { return dniCliente; }
    public void setDniCliente(String dniCliente) { this.dniCliente = dniCliente; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public List<DetallePedidoOtaku> getDetalles() { return detalles; }
    public void setDetalles(List<DetallePedidoOtaku> detalles) { this.detalles = detalles; }
    
    @Override
    //Método para mostrar una representación de los datos almacenados por esta clase
    public String toString() {
        return "------------------------------------\nPedido\n------------------------------------\n"
                + "ID Pedido: " + idPedido
                + "\nDNI Cliente: " + dniCliente
                + "\nFecha: " + fecha
                + "\nDetalles:\n" + detalles.toString();
    }

}

