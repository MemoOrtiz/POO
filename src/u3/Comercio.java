package u3;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Comercio {
	protected String nombre;
	protected double ganancias;

	public Comercio(String nombre) {
		this.nombre = nombre;
	}

	public abstract void calcularGanancias();

	public double getGanancias() {
		return ganancias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ganancias, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Double.doubleToLongBits(ganancias) == Double.doubleToLongBits(other.ganancias)
				&& Objects.equals(nombre, other.nombre);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("###.##");

		return "\nNombre: " + nombre + 
				"\nGanancias:" + df.format(ganancias);
	}

}
