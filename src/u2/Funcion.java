package u2;

import java.util.Objects;

public class Funcion {
	private Fecha fecha;
	private float hora;
	private Lugar lugar;
	
	public Funcion(Fecha fecha, float hora, Lugar lugar) {
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public float getHora() {
		return hora;
	}

	public void setHora(float hora) {
		this.hora = hora;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(lugar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcion other = (Funcion) obj;
		return Objects.equals(lugar, other.lugar);
	}

	public String toString() {
		return "\n--------------\nFuncion\n" + fecha + "\nHora =" + hora +  lugar ;
	}
	
}
