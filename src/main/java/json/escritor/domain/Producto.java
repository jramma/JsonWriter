package json.escritor.domain;

public class Producto {
	private String modelo;
	private String marca;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Producto(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}
	public Producto() {
	}
	@Override
	public String toString() {
		return "Producto [modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	
}
