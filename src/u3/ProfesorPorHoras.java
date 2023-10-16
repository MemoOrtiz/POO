package u3;

import java.util.Objects;

import u2.Fecha;

public class ProfesorPorHoras extends Profesor {
	private int horas;

	public ProfesorPorHoras(String nombre, int telefono, Fecha fechaNacimiento, String clave,int horas) {
		super(nombre, telefono, fechaNacimiento, clave);
		this.horas=horas;
		calcularSalario();
	}

	public ProfesorPorHoras(String curp, String nombre, int telefono, Fecha fechaNacimiento, String clave,int horas) {
		super(curp, nombre, telefono, fechaNacimiento, clave);
		this.horas=horas;
		calcularSalario();
	}
	public void calcularSalario(){
		if(horas<=40) {
			setSalario(horas*100);
		}else {
			int horasExc=horas-40;
			setSalario((40*100)+(horasExc*135));
		}		
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(horas);
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
		ProfesorPorHoras other = (ProfesorPorHoras) obj;
		return horas == other.horas;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nProfesorPorHoras "+ "\nHoras: " + horas ;
	}
	
	

}
