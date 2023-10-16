package u2;

import javax.swing.JOptionPane;

import misUtilerias.SalidaFormateada;

public class AppConcierto {
	public static void main(String[] args) {
		int numFunciones = 0;
		int seguir = 0;
		String nombreArtista = JOptionPane.showInputDialog(null, "Cual es el nombre del artista? ");
		numFunciones = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de Funciones: "));

		Funcion funciones[] = new Funcion[numFunciones];
		for (int i = 0; seguir == 0 && i < numFunciones; i++) {
			String nombreLugar = JOptionPane.showInputDialog(null,
					"Ingrese el nombre del lugar la Función " + (i + 1) + ":");
			int capacidad = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Ingrese la capacidad del lugar de la Función " + (i + 1) + ":"));
			int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Dia de la Función " + (i + 1) + ":"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Mes de la Función " + (i + 1) + ":"));
			int año = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de la Función " + (i + 1) + ":"));
			float hora = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la hora de la Función " + (i + 1) + ":"));

			Fecha fecha = new Fecha(dia, mes, año);
			Lugar lugar = new Lugar(nombreLugar, capacidad);
			funciones[i] = new Funcion(fecha, hora, lugar);
			seguir = JOptionPane.showConfirmDialog(null, "Desea seguir capturando?");
		}

		String salida = "Las funciones son las siguientes";

		// todos los datos de la funcion
		for (Funcion cadaFuncion : funciones) {
			if (cadaFuncion != null) {
				salida = salida + cadaFuncion.toString();
			}
		}
		JOptionPane.showMessageDialog(null, salida);
		SalidaFormateada.imprimeConScroll(salida);
		
		String lugaresRegistrados="";
		for(Funcion cadaFuncion: funciones) {
			if(cadaFuncion!=null) {
				String nombre = cadaFuncion.getLugar().getNombre();
				if(!lugaresRegistrados.contains(nombre)) {
					lugaresRegistrados = lugaresRegistrados + nombre + ",";
				}
					
			}
		}
		lugaresRegistrados= lugaresRegistrados.substring(0,lugaresRegistrados.length()-1);
		
		String[] losLugares = lugaresRegistrados.split(",");
		
		//String ayuda ="";
		//for(int i=0;i<losLugares.length;i++) {
			//ayuda = 
			//if(losLugares[i].equals(losLugares[i])) {
			//checar arraylist
			//}
	//	}

		String funcionAsistir=(String) JOptionPane.showInputDialog(null, "A cual funcion le interesa asistir? ","Funciones",JOptionPane.PLAIN_MESSAGE,null,losLugares,losLugares[0]);
		String salida2 = "Las funciones en el mismo lugar son las siguientes: ";
		int c = 0;
		
		for (Funcion cadaFuncion : funciones) {
			if (cadaFuncion != null) {
				if (cadaFuncion.getLugar().getNombre().equals(funcionAsistir)){
					c=c+1;
					salida2 = salida2+"\n" + cadaFuncion.getLugar().getNombre();
				}
			}
		}salida2=salida2 +"\nLa cantidad es: "+c;
				JOptionPane.showMessageDialog(null, salida2);
				
				//ConciertoMusica ConciertoArtista = new ConciertoMusica(funciones,nombreArtista);
			
		//mostrar los nombres de los lugares en un listado usando el formato buscado con jop
		//String lugaresRegistrados="";
		//for(Funcion cadaFuncion: funciones) {
			//if(lugaresRegistrados.contains(cadaFuncion.getLugar().getNombre())) {
				//lugaresRegistrados = lugaresRegistrados + cadaFuncion.getLugar().getNombre() + ",";
		//	}
	//	}
		//lugaresRegistrados= lugaresRegistrados.substring(0,lugaresRegistrados.length()-1);
		//JOptionPane.showMessageDialog(null, lugaresRegistrados);
		
//		String[] losLugares = lugaresRegistrados.split(",");
		
	//	String seleccion = (String)JOptionPane.showInputDialog(null, "Selecciona uno: ",
		//		"Lugares Registrados", JOptionPane.QUESTION_MESSAGE,
			//	null, losLugares,losLugares[0]);
		
	//	JOptionPane.showMessageDialog(null,"Lugar seleccionado" + seleccion);
	}
}
