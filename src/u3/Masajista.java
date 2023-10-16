package u3;

import java.util.Objects;

public class Masajista extends SeleccionFutbol {
private String titulacion;
private int añosExperiencia;

public Masajista(int id, String nombre, String apellidos, int edad) {
	super(id, nombre, apellidos, edad);
	
}
public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
	super(id, nombre, apellidos, edad);
	this.titulacion=titulacion;
	this.añosExperiencia=añosExperiencia;
	
}
public String getTitulacion() {
	return titulacion;
}
public void setTitulacion(String titulacion) {
	this.titulacion = titulacion;
}
public int getAñosExperiencia() {
	return añosExperiencia;
}
public void setAñosExperiencia(int añosExperiencia) {
	this.añosExperiencia = añosExperiencia;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(añosExperiencia, titulacion);
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
	Masajista other = (Masajista) obj;
	return añosExperiencia == other.añosExperiencia && Objects.equals(titulacion, other.titulacion);
}
public void darMasaje() {
	System.out.println("Masajista da masaje");
}

@Override
public String toString() {
	return "Masajista [titulacion=" + titulacion + ", añosExperiencia=" + añosExperiencia + "]";
}

}
