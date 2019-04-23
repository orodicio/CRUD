package ej.crud;

/**
 * Write a description of class Producto here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Producto {
	// instance variables - replace the example below with your own
	private int codigo; // Código del producto, se utiliza para buscar
	private String nombre; // Nombre un texto
	private int stock; // existencia actuales
	private int stock_min; // Número mínimo de existencias recomedadas
	private float precio; // Precio

	/**
	 * Constructor for objects of class Producto
	 */

	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return codigo + ":" + nombre + ":" + stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int valor) {
		stock = valor;
	}

	public int getStock_min() {
		return stock_min;
	}

	public void setStock_min(int valor) {
		stock_min = valor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float valor) {
		precio = valor;
	}
}
