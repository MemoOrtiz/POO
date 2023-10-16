package u2;

import java.util.Objects;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año) {
		//hacer validaciones del dia mes y año
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		
	}
	//o hacer las validaciones  en unmetodo private

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(año, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return año == other.año && dia == other.dia && mes == other.mes;
	}

	//@Override
	//public int hashCode() {
		//return Objects.hash(año, dia, mes);
	//}

	//@Override
	//public boolean equals(Object obj) {
		//if (this == obj)  //compara las 2 referencias(si son iguales)
		//	return true;
		//if (obj == null) // si el objeto es igual null(null es vacio) no son iguales
			//return false;
		//if (getClass() != obj.getClass()) //si son de la misma clase tendría que regresar true, si no es falso
			//return false;
		//Fecha other = (Fecha) obj;
		//return año == other.año && dia == other.dia && mes == other.mes;
		
		//Fecha other = (Fecha)obj; //casting
		
		//if(this.dia==other.dia&&this.mes==other.mes&&this.año==other.año) {
			//return true;
		//}
	//}

	
	public String toString(){
		String f="";
		f += "";
		f +="\nDía: "+dia;
		f +="\nMes: "+mes;
		f +="\nAño: "+año;
		return f;
	}
}
	 	
