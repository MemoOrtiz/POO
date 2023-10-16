package u3;

public class Paralelepipedo extends FiguraGeometrica {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	

	public Paralelepipedo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		calcularVolumen();
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public void calcularVolumen() {
		setVolumen(ladoA * ladoB * ladoC);
	}
	
	public String toString() {
		return super.toString()+"Paralelepípedo: "+  getVolumen()+"\n";
	}

}
