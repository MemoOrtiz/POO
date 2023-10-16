package u3;

import java.util.Objects;

public class Entrenador extends SeleccionFutbol{
private String idFederacion;

public Entrenador(int id, String nombre, String apellidos, int edad) {
	super(id, nombre, apellidos, edad);
	
}
public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
	super(id, nombre, apellidos, edad);
	this.idFederacion=idFederacion;
	
}


public String getIdFederacion() {
	return idFederacion;
}

public void setIdFederacion(String idFederacion) {
	this.idFederacion = idFederacion;
}
public void dirigirPartido() {
	System.out.println("Entrenador dirige partido");
}
public void dirigirEntrenamiento(){
	System.out.println("Entrenador dirige entrenamiento");
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(idFederacion);
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
	Entrenador other = (Entrenador) obj;
	return Objects.equals(idFederacion, other.idFederacion);
}

@Override
public String toString() {
	return "Entrenador [idFederacion=" + idFederacion + "]";
}

}
