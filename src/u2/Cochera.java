package u2;

public class Cochera {
	private float superficieCochera;
	private int plazas;
	private boolean automatica;
	
	public Cochera(float superficieCochera, int plazas, boolean automatica) {
		this.superficieCochera = superficieCochera;
		this.plazas = plazas;
		this.automatica = automatica;
	}

	public float getSuperficie() {
		return superficieCochera;
	}

	public void setSuperficie(float superficieCochera) {
		this.superficieCochera = superficieCochera;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public boolean isAutomatica() {
		return automatica;
	}

	public void setAutomatica(boolean automatica) {
		this.automatica = automatica;
	}

	
	public String toString() {
		return "Cochera [superficie=" + superficieCochera + ", plazas=" + plazas + ", automatica=" + automatica + "]";
	}
	

}
