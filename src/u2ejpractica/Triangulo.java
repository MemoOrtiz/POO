package u2ejpractica;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo() {
		ladoA = 1.0;
		ladoB = 1.0;
		ladoC = 1.0;
	}

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getPerimetro() {
		double p = (ladoA + ladoB + ladoC) / 2;
		return p;
	}

	public double getArea() {
		double p = getPerimetro();
		double a = Math.sqrt((p * (p - ladoA) * (p - ladoB) * (p - ladoC)));
		return a;

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

	public String toString() {
		String s = "";
		s += "Lado A: " + ladoA;
		return s;
	}

}
