//Paquete al que pertenece esta clase
package com.akihabara.market.model;

//Datos de la propia clase o atributos
public class ProductoOtaku {

	protected int id;
	String nombre;
	String categoria;
	Double precio;
	int stock;


//Constructor vacío
public ProductoOtaku() {};

//Constructor que inicializa los datos de la clase perse
public ProductoOtaku(int id,String nombre, String categoria, Double precio, int stock) {
	
	this.id= id;
	this.nombre= nombre;
	this.categoria= categoria;
	this.precio=precio;
	this.stock=stock;
}

//Getters para obtener los datos de la clase y setters para acceder a ellos
public String getNombre(){
	return nombre;
}

public String getCategoria(){
	return categoria;
}

public Double getPrecio(){
	return precio;
}

public int getStock(){
	return stock;
}

public int getId(){
	return id;
}

public void setNombre(String nombre) {
	this.nombre =nombre;
}

public void setCategoria(String categoria) {
	this.categoria =categoria;
}

public void setPrecio(double precio) {
	this.precio =precio;
}

public void setStock(int stock) {
	this.stock =stock;
}

public void setId(int id) {
	this.id =id;
}

//Método representativo de lo que contiene la propia clase, uso String Format para marcar cómo quiero ver precio, con 2 decimales en este caso, y el valor de precio donde se encuentra el "%"
public String toString() {
	
	return "------------------------------------\nDatos de Akihabara_Market \n -----------------------------------\n"
	 +		" Id: \n" +id+ "\nNombre: \n\n"+nombre+"\nCategoria: \n\n"+categoria+"\nPrecio: \n\n"+String.format("%.2f", precio)+"\nStock: \n\n"+stock+"\n\n";
}

}