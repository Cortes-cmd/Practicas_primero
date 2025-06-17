// El paquete al que pertenece el archivo
package com.akihabara.market.model;

//La clase con sus atributos particulares
public class DetallePedidoOtaku {
    private int idDetalle;
    private int idPedido;
    private int idProducto;
    private int cantidad;
    private double precio;

    // Constructores, el vacío y el que permite inicializar los atributos del detalle - pedido en este caso
    public DetallePedidoOtaku() {}

    public DetallePedidoOtaku(int idDetalle, int idPedido, int idProducto, int cantidad, double precio) {
        this.idDetalle = idDetalle;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters para obtener los valores privados desde fuera de la clase, y acceder a ellos
    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}

