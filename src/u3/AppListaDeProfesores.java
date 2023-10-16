package u3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import misUtilerias.SalidaFormateada;
import u2.Fecha;
import u2.Persona;

public class AppListaDeProfesores {

	public static void main(String[] args) {
		int cantidadProfesores = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Dime la cantidad de profesores a ingresar: "));
		ArrayList<Persona> lista = new ArrayList<>(cantidadProfesores);
		int seguir = 0;

		while(seguir==0) {
			String curp = JOptionPane.showInputDialog(null, "Dime el curp: ");
			String nombre = JOptionPane.showInputDialog(null, "Dime el nombre del profesor: ");
			int telefono = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Dime el telefono del profesor: "));
			int dia = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Dime el dia de nacimiento: "));
			int mes = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Dime el mes de nacimiento: "));
			int año = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Dime el año de nacimiento: "));
			Fecha fechaNacimiento = new Fecha(dia, mes, año);
			
			String clave = JOptionPane.showInputDialog("Inserta la clave del profesor: ");
			
			int completo= JOptionPane.showConfirmDialog(null, "Es horario completo?");
			if(completo==0) {
				lista.add(new ProfesorTiempoCompleto(curp,nombre,telefono, fechaNacimiento,clave));
				
			}else {
			int horas = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Dime las horas que impartirá el profesor: "));
			lista.add(new ProfesorPorHoras(curp,nombre,telefono, fechaNacimiento,clave,horas));
			}
			seguir = JOptionPane.showConfirmDialog(null, "Ingresar otro profesor ?");
			}
		
		//lista completa
		String salida="Lista de profesores \n";
		
		for(Persona unProfesor:lista) {
			salida+=unProfesor.toString() + "\n-----------------\n";
		}//JOptionPane.showMessageDialog(null, "La cantidad de profesores es: "+ lista.size()+ "\n"+salida);
		SalidaFormateada.imprimeConScroll("La cantidad de profesores es: "+ lista.size()+ "\n"+salida);
		
		//lista con clave y nombre de cada profesor con salario mayor a 2000
		String salida2="Lista de profesores con salario mayor a 2000 \n";
		for(Persona unProfesor:lista) {
			Profesor profesorC=((Profesor)unProfesor);
			if(unProfesor!=null && profesorC.getSalario()>2000) {
				
				salida2+="\nClave de profesor: \n"+ profesorC.getClave()+ "\nNombre profesor: \n" + unProfesor.getNombre();
			}
		}JOptionPane.showMessageDialog(null, salida2);
		
		//lista de los profesores que cumplan el mes de abril
		String salida3="Lista de profesores que cumplen el mes de abril \n";
		for(Persona unProfesor:lista) {
			if(unProfesor!=null && unProfesor.getFechaNacimiento().getMes()==4) {
				salida3+=unProfesor.getNombre()+"\n";
			}
		}JOptionPane.showMessageDialog(null, salida3);
		
		}
	}

