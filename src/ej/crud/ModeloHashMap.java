package ej.crud;

/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author orodicio
 * @version 1
 */
import java.util.HashMap;

public class ModeloHashMap extends ModeloAbs {
	private HashMap<Integer, Producto> lista;

	public ModeloHashMap() {
		lista = new HashMap<Integer, Producto>();
	}

	// Implementar los metodos abstractos de ModeloAbs
	public boolean insertarProducto(Producto p) {

		lista.put(p.getCodigo(), p);
		return true;

	}

	public boolean borrarProducto(int codigo) {
		lista.remove(codigo);
		return true;
	}

	public Producto buscarProducto(int codigo) {
		return lista.get(codigo);
	}

	public void listarProductos() {
		for (Producto value : lista.values()) {
			System.out.println(value);
		}
	}

	public boolean modificarProducto(Producto nuevo) {
		lista.put(nuevo.getCodigo(), nuevo);
		return true;
	}

	public void ListarMenosStockmin() {
		for (Producto value : lista.values()) {
			if (value.getStock_min() > value.getStock()) {
				System.out.println(value);
			}
		}
	}

}
