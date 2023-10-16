package u3;

public class Producto {
	protected String nombre;
	protected double precio;

	public Producto(String nombre) {
		this.nombre = nombre;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public double calcular(int cantidad) {
		return cantidad * precio;
	}
	
	//public int contar() {
	//}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Producto \nNombre " + nombre + "\nPrecio " + precio;
	}

}
