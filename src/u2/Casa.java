package u2;

public class Casa {
	private Persona propietario;
	private float superficieP1;
	private float superficieP2;
	
	public Casa(Persona propietario, float superficieP1, float superficieP2) {
		this.propietario = propietario;
		this.superficieP1 = superficieP1;
		this.superficieP2 = superficieP2;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public float getSuperficieP1() {
		return superficieP1;
	}

	public void setSuperficieP1(float superficieP1) {
		this.superficieP1 = superficieP1;
	}

	public float getSuperficieP2() {
		return superficieP2;
	}

	public void setSuperficieP2(float superficieP2) {
		this.superficieP2 = superficieP2;
	}
	
	public String toString() {
		String s="";
		s+="\nPropietario: "+propietario;
		s+="\nSuperficie 1: "+superficieP1;
		s+="\nSuperficie 2: "+superficieP2;
		return s;
	}
	
	
}
