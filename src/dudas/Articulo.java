package dudas;

import java.util.Objects;

public class Articulo {
	private int clave;
	private double precio;
	private String promo;
	
	public Articulo(int clave, double precio, String promo) {
		this.clave = clave;
		this.precio = precio;
		this.promo = promo;
	}
	public Articulo(int clave, double precio) {
		this.clave = clave;
		this.precio = precio;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(clave, precio, promo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return clave == other.clave && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(promo, other.promo);
	}
	@Override
	public String toString() {
		return "\nClave: " + clave + "\nPrecio: " + precio + "\nPromo: " + promo;
	}

	
	

}
