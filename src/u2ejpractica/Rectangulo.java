package u2ejpractica;

public class Rectangulo {
	private double largo;
	private double ancho;
	
	public Rectangulo() {
		largo = 25.0;
		ancho = 50.0;
	}
	public Rectangulo(double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}
	public double getArea() {
		return largo*ancho;
	}
	public void setLargo(double largo) {
		this.largo= largo;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public double getAncho() {
		return ancho;
	}
	public String toString() {
		return "Rectangulo: \nLargo: " + largo+
				"\nAncho: "+ ancho+
				"\nArea: " + getArea();
	}
}
