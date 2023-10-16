package u3;

public class Esfera extends FiguraGeometrica {
	private double rad;
	
	
	public Esfera(double rad) {
		this.rad = rad;
		calcularVolumen();
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public void calcularVolumen() {
	setVolumen((4/3)*((Math.PI)*(Math.pow(rad, 3))));

	}
	public String toString() {
		return super.toString()+"Esfera: "+getVolumen()+ "\n";
	}

}
