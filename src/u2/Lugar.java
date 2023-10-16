package u2;

import java.util.Objects;

public class Lugar {
	private String nombreLugar;
	private int capacidad;
	
	public Lugar(String nombreLugar, int capacidad) {
		this.nombreLugar = nombreLugar;
		this.capacidad = capacidad;
	}
	public String getNombre() {
		return nombreLugar;
	}
	public void setNombre(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(capacidad, nombreLugar);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lugar other = (Lugar) obj;
		return capacidad == other.capacidad && Objects.equals(nombreLugar, other.nombreLugar);
	}
	public String toString() {
		return "\nLugar \nNombre=" + nombreLugar + "\nCapacidad =" + capacidad ;
	}
	
}
