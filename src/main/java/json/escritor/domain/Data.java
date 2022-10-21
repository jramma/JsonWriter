package json.escritor.domain;

import java.util.ArrayList;

public class Data {

	private String cliente;
	private Integer maquinas;
	private ArrayList<Producto> productos;

	public Data(String cliente, Integer maquinas, ArrayList<Producto> productos) {
		this.cliente = cliente;
		this.maquinas = maquinas;
		this.productos = productos;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Integer getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(Integer maquinas) {
		this.maquinas = maquinas;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

}
