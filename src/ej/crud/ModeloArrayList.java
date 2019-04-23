package ej.crud;

/**
 * Implementa la parte de Modelo de Datow
 * 
 * @author orodicio
 * @version 1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModeloArrayList extends ModeloAbs {
	private ArrayList<Producto> lista;

	public ModeloArrayList() {
		lista = new ArrayList<Producto>();
	}

	// Implementar los metodos abstractos de ModeloAbs
	public boolean insertarProducto(Producto p) {
		return lista.add(p);

	}

	public boolean borrarProducto(int codigo) {
		return lista.removeIf(producto -> producto.getCodigo() == codigo);
	}

	public Producto buscarProducto(int codigo) {
		Producto buscado = null;
		for (Producto p : lista) {
			if (p.getCodigo() == codigo) {
				buscado = p;
				break;
			}
		}
		return buscado;
	}

	public void listarProductos() {
		lista.forEach(producto -> System.out.println(producto));
	}

	public boolean modificarProducto(Producto nuevo) {

		Producto p = buscarProducto(nuevo.getCodigo());
		if (p == null) {
			return false;
		}
		p.setPrecio(nuevo.getPrecio());
		p.setStock(nuevo.getStock());
		p.setStock_min(nuevo.getStock_min());
		return true;
	}

	public void ListarMenosStockmin() {
		List<Producto> resultado = lista.stream().filter(producto -> producto.getStock_min() > producto.getStock())
				.collect(Collectors.toList());
		resultado.forEach(producto -> System.out.println(producto));
	}
}
