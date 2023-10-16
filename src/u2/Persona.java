package u2;

import java.util.Objects;

public class Persona {
	private String curp;
	private String nombre;
	private int telefono;
	private Fecha fechaNacimiento;

	public Persona(String nombre, int telefono, Fecha fechaNacimiento) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Persona(String curp, String nombre, int telefono, Fecha fechaNacimiento) {

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

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
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
		s += (telefono==0?"":"\nTelefono: " + telefono);
		s += (fechaNacimiento==null?"":"\nFecha de nacimiento: " + fechaNacimiento);
		return s;
	}
	//return "Galleta["+
			//(forma == null?"":"forma= "+forma)+
			//(color ==null?"":"color= "+color)+
			//"]";
			
//ahorita me dicrssss tengo libre asi que si
	//tuvo diarrea el profe		
	

}
