package u2;

import u1.Asignatura;

public class App1Asignaturass {
	
	public static void main(String[]Arg) {
		Asignatura clase7 = new Asignatura("AEC1008","Contabilidad Financiera",
				2,2,4,2,false);
		Asignatura clase8 = new Asignatura("SCD1020", "Programacion Orientada a Objetos",
				2,3,5,2,false);
		Persona per = new Persona("hola","hola", 15,new Fecha(1,15,10));
		
		System.out.println(clase7);
		System.out.println(clase7.toString());
		
		System.out.println(per);
	}
}
