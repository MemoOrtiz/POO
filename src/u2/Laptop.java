package u2;

public class Laptop {
	private Pantalla pantalla;
	private Teclado teclado;
	private int mram;
	private int capacidad;
	private String procesador;

	public Laptop(Pantalla pantalla, Teclado teclado, int mram, int capacidad, String procesador) {
		this.pantalla = pantalla;
		this.teclado = teclado;
		this.mram = mram;
		this.capacidad = capacidad;
		this.procesador = procesador;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public int getMram() {
		return mram;
	}

	public void setMram(int mram) {
		this.mram = mram;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String toString() {
		return "Laptop [pantalla=" + pantalla + ", teclado=" + teclado + ", mram=" + mram + ", capacidad=" + capacidad
				+ ", procesador=" + procesador + "]";
	}
	
	
}
