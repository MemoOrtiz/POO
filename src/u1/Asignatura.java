package u1;

import java.util.Objects;

public class Asignatura {
	private String clave;
	private String nombre;
	private int hrsTeoricas;
	private int hrsPracticas;
	private int creditos;
	private int semestre;
	private boolean cursada;
	
	public Asignatura(String clave, String nombre, int hrsTeoricas, int hrsPracticas, int creditos, int semestre,
			boolean cursada) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.hrsTeoricas = hrsTeoricas;
		this.hrsPracticas = hrsPracticas;
		this.creditos = creditos;
		this.semestre = semestre;
		this.cursada = cursada;
	}

	public Asignatura(String clave, String nombre, int hrsTeoricas, int hrsPracticas, int creditos, int semestre) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.hrsTeoricas = hrsTeoricas;
		this.hrsPracticas = hrsPracticas;
		this.creditos = creditos;
		this.semestre = semestre;
	}

	public Asignatura(String clave, String nombre, int hrsTeoricas, int hrsPracticas, int creditos) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.hrsTeoricas = hrsTeoricas;
		this.hrsPracticas = hrsPracticas;
		this.creditos = creditos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clave, creditos, hrsPracticas, hrsTeoricas, nombre, semestre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asignatura other = (Asignatura) obj;
		return Objects.equals(clave, other.clave) && creditos == other.creditos && hrsPracticas == other.hrsPracticas
				&& hrsTeoricas == other.hrsTeoricas && Objects.equals(nombre, other.nombre)
				&& semestre == other.semestre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHrsTeoricas() {
		return hrsTeoricas;
	}

	public void setHrsTeoricas(int hrsTeoricas) {
		this.hrsTeoricas = hrsTeoricas;
	}

	public int getHrsPracticas() {
		return hrsPracticas;
	}

	public void setHrsPracticas(int hrsPracticas) {
		this.hrsPracticas = hrsPracticas;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public boolean isCursada() {
		return cursada;
	}

	public void setCursada(boolean cursada) {
		this.cursada = cursada;
	}

	//
	@Override
	public String toString() {
		return "Asignatura:\nClave=" + clave + 
				"\nNombre =" + nombre +
				"\nHoras Teoricas= " + hrsTeoricas + 
				"\nHoras Practicas= "+ hrsPracticas + 
				"\nCreditos= " + creditos + 
				"\nSemestre= " + semestre + 
				"\nCursada= " + (cursada? "Si":"No");
				//operador ternario- if/else
	}
}
