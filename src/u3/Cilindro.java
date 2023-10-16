package u3;

public class Cilindro extends FiguraGeometrica {
	private double r;
	private double h;
	

	public Cilindro(double r, double h) {
		this.r = r;
		this.h = h;
		calcularVolumen();
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public void calcularVolumen() {
		setVolumen((Math.PI)*(Math.pow(r, 2))*h);
	}
	
	public String toString() {
		return super.toString()+"Cilindro: "+getVolumen()+ "\n";
	}

}
