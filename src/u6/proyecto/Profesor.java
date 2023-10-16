package u6.proyecto;

import java.util.Objects;

public abstract class Profesor extends Persona {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String clave;
	private double salario;
	
	public Profesor(String nombre, String telefono, Fecha fechaNacimiento, String clave) {
		super(nombre, telefono, fechaNacimiento);
		this.clave=clave;
		
	}

	public Profesor(String curp, String nombre, String telefono, Fecha fechaNacimiento, String clave) {
		super(curp, nombre, telefono, fechaNacimiento);
		this.clave=clave;
		
	}
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario=salario;
	}

	public abstract void calcularSalario();



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(clave);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(clave, other.clave);
	}

	@Override
	public String toString() {
		return super.toString()+"\nclave: " + clave + "\nSalario: " + salario ;
	}

}
