package u1;

public class App1Asignaturas {
	
	public static void main(String[]Arg) {
		Asignatura clase7 = new Asignatura("AEC1008","Contabilidad Financiera",
				2,2,4,2,false);
		Asignatura clase8 = new Asignatura("SCD1020", "Programacion Orientada a Objetos",
				2,3,5,2,false);
		
		System.out.println(clase7);
		//es lo mismo que:
		System.out.println(clase7.toString());
		//siempre y cuando este definido el toString en la clase instanciable
		//si no esta definido en la clase instanciable me sale lo siguiente:
		//tipoObjeto@direccion de memoria
		//paquete+clase
	}
}

