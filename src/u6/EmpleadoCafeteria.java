package u6;

import java.util.Objects;

public class EmpleadoCafeteria {
	private String sucursal;
	private String nombre;
	private String telefono;
	private String direccion;
	private String cargo;
	private String turno;
	private double sueldoQuincenal;

	public EmpleadoCafeteria(String sucursal, String nombre, String telefono, String direccion, String cargo,
			String turno, double sueldoQuincenal) {
		super();
		this.sucursal = sucursal;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.cargo = cargo;
		this.turno = turno;
		this.sueldoQuincenal = sueldoQuincenal;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getSueldoQuincenal() {
		return sueldoQuincenal;
	}

	public void setSueldoQuincenal(double sueldoQuincenal) {
		this.sueldoQuincenal = sueldoQuincenal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargo, direccion, nombre, sucursal, sueldoQuincenal, telefono, turno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoCafeteria other = (EmpleadoCafeteria) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(sucursal, other.sucursal)
				&& Double.doubleToLongBits(sueldoQuincenal) == Double.doubleToLongBits(other.sueldoQuincenal)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(turno, other.turno);
	}

	@Override
	public String toString() {
		return "\nSucursal: " + sucursal + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: "
				+ direccion + "\nCargo: " + cargo + "\nTurno: " + turno + "\nSueldo Quincenal: " + sueldoQuincenal;
	}

}
