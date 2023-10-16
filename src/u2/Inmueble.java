package u2;

public class Inmueble {
	private float superficie;
	private int habitaciones;
	private double precio;
	private Fecha fecha;
	private Persona propietario;
	private Piscina piscina;
	private Cochera cochera;
	
	public Inmueble(float superficie, int habitaciones, double precio, Fecha fecha, Persona propietario,
			Piscina piscina, Cochera cochera) {
		this.superficie = superficie;
		this.habitaciones = habitaciones;
		this.precio = precio;
		this.fecha = fecha;
		this.propietario = propietario;
		this.piscina = piscina;
		this.cochera = cochera;
	}
	
	public Inmueble() {
	}

	public float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Piscina getPiscina() {
		return piscina;
	}

	public void setPiscina(Piscina piscina) {
		this.piscina = piscina;
	}

	public Cochera getCochera() {
		return cochera;
	}

	public void setCochera(Cochera cochera) {
		this.cochera = cochera;
	}

	@Override
	public String toString() {
		return "Inmueble [superficie=" + superficie + ", habitaciones=" + habitaciones + ", precio=" + precio
				+ ", fecha=" + fecha + ", propietario=" + propietario + ", piscina=" + piscina + ", cochera=" + cochera
				+ "]";
	}
	
}
