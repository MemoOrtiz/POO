package u3;

public class Cubo extends FiguraGeometrica {
	private double arista;
	
	
	public Cubo(double arista) {
		this.arista = arista;
		calcularVolumen();
	}

	public void calcularVolumen() {
	setVolumen(Math.pow(arista, 3));
	}

	public double getArista() {
		return arista;
	}

	public void setArista(double arista) {
		this.arista = arista;
	}


	public String toString() {
		return super.toString()+"Cubo: "+ getVolumen() + "\n";
	}
	
	
	
}
