package u2;

public class Articulo {
	private String clave;
	private String descripcion;
	private int existencia;
	private double precio;
	
	public Articulo(String clave, String descripcion, int existencia,double precio) {
		this.clave = clave;
		this.descripcion = descripcion;
		this.existencia = existencia;
		this.precio = precio;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}

	@Override
	public String toString() {
		return "Articulo [clave=" + clave + ", descripcion=" + descripcion + ", existencia=" + existencia + ", precio="
				+ precio + "]";
	}


	
	
}
