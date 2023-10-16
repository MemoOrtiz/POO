package u6.proyecto;

import java.io.Serializable;
import java.util.Objects;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String curp;
	private String nombre;
	private String telefono;
	private Fecha fechaNacimiento;

	public Persona(String nombre, String telefono, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona(String curp, String nombre, String telefono, Fecha fechaNacimiento) {

		this.curp = curp;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(curp, fechaNacimiento, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(curp, other.curp) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}

	public String toString() {
		String s = "";
		s += (curp==null?"":"\nCurp: " + curp);
		s += (nombre==null?"":"\nNombre: " + nombre);
		s += (telefono==null?"":"\nTelefono: " + telefono);
		s += (fechaNacimiento==null?"":"\nFecha de nacimiento: " + fechaNacimiento);
		return s;
	}
	
	

}
