package u6.proyecto;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import misUtilerias.SalidaFormateada;

public class ProyectoFinalPOO {
	/*
	 * Resuelva utilizando como base su solución desarrollada para el ejercicio
	 * T3y4.1 Jerarquía de clases - Práctica 1 – Persona, de la unidad 3y4. En su
	 * block de notas, coloque las siguientes líneas en un archivo de texto, cada
	 * línea contiene los datos correspondientes a un profesor de tiempo completo
	 * (curp, nombre, teléfono, fecha de nacimiento y clave) o por horas (curp,
	 * nombre, teléfono, fecha de nacimiento, clave y horas) con cada dato separado
	 * por una coma:
	 * 
	 * Crear una aplicación en java que tenga:
	 * 
	 * - Un método que lea el archivo de texto anterior separe cada dato en una
	 * variable del tipo adecuado para poder crear un objeto ProfesorTiempoCompleto
	 * o ProfesorPorHoras, según l
	 * a cantidad de datos en la línea leída del archivo,
	 * cree el objeto y guárdelo en un archivo binario de objetos. - Un método que
	 * lea el archivo binario de objetos y los coloque en un ArrayList de
	 * referencias a Persona y regrese el ArrayList<Persona> - Un método principal
	 * que presente un menú con las opciones:
	 * 
	 * o Crear archivo de objetos (llamar al primer método) o Leer archivo de
	 * objetos (llamar al segundo método) o Listar todas las personas o Listar el
	 * nombre y el teléfono de las personas con un salario menor al indicado por el
	 * usuario (ejemplo: 4,200.00) o Listar la clave, el nombre y la CURP de las
	 * personas que cumplan años en el mes indicado por el usuario (ejemplo: 12). o
	 * Salir  
	 */
	public static void main(String[] args) {
		ArrayList<Persona> objsPersona = new ArrayList<Persona>();
		String menu = """
				1. Crear archivo de objetos
				2. Leer archivo de objetos
				3. Listar personas
				4. Listar nombre y telefono menor a salario indicado
				5. Listar la clave, el nombre y la CURP de personas que cumplan años en el mes indicado.
				6. Terminar el programa
				""";
		int opcion = 0;
		while (opcion != 6) {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
				switch (opcion) {
				case 1:
					escribirArchivoObjetos();
					JOptionPane.showMessageDialog(null, "Operación realizada con éxito");
					break;

				case 2:
					objsPersona = leerObjetosDeArchivo();
					JOptionPane.showMessageDialog(null, "Operación realizada con éxito");
					break;
				case 3:
					SalidaFormateada.imprimeConScroll(objsPersona.toString());
					break;
				case 4:
					String salida = "";
					double salariomax = 0.0;
					do {
						try {
							salariomax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario "));
							break;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "ERROR: Ingrese numeros, no letras");
						}
					} while (true);
					for (Persona cadaPersona : objsPersona) {

						if (cadaPersona != null) {
							Profesor cadaProfe = ((Profesor) cadaPersona);

							if (cadaProfe.getSalario() < salariomax) {
								salida += "\nNombre: " + cadaProfe.getNombre() + "\nTelefono: "
										+ cadaProfe.getTelefono()+"\n";
							}
						}

					}
					if (salida.equals("")) {
						JOptionPane.showMessageDialog(null,
								"No se encontro ningun profesor con salario menor a " + salariomax);
					}else {
						SalidaFormateada.imprimeConScroll(salida);
					}
					break;
				case 5:
					String sal = "";
					int mes = 0;
					do {
						try {
							mes = Integer.parseInt(JOptionPane.showInputDialog("Dime el mes  a comparar: "));
							break;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "ERROR: Ingrese numeros, no letras");
						}
					} while (true);
					
					for (Persona cadaPersona : objsPersona) {

						if (cadaPersona != null) {
							Profesor profe = ((Profesor) cadaPersona);
							if (cadaPersona.getFechaNacimiento().getMes() == mes) {
								sal += "\nLa clave del profesor es: " + profe.getClave() + "\nEl nombre del profesor es: " + profe.getNombre()
										+ "\nEl curp del profesor es: " + profe.getCurp()+"\n";
							}
							
						}
						
					}
					if (sal.equals("")) {
						JOptionPane.showMessageDialog(null,
								"No se encontró ningún profesor que cumpla años en ese mes ");
					}else {
						SalidaFormateada.imprimeConScroll(sal);	
					}
					
					
					
					break;

				case 6:
					JOptionPane.showMessageDialog(null, "Fin de la aplicación");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción no valida");
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "ERROR: Ingrese numeros, no letras ");
			}
		}
	}

	// Método 1
	public static void escribirArchivoObjetos() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("./datosProyecto.txt"));
			ObjectOutputStream archivoBin = new ObjectOutputStream(
					new FileOutputStream(new File("./objetosProfesor.dat")));
			while (br.ready()) {
				String lineaActual = br.readLine();
				String[] propiedades = lineaActual.split(",");
				String[] fechaSubstrings = propiedades[3].split("-");
				Fecha fecha = new Fecha(Integer.parseInt(fechaSubstrings[0]), Integer.parseInt(fechaSubstrings[1]),
						Integer.parseInt(fechaSubstrings[2]));
				Profesor elprofe = null;
				if (propiedades.length == 6) {
					elprofe = new ProfesorPorHoras(propiedades[0], propiedades[1], (propiedades[2]), fecha,
							propiedades[4], Integer.parseInt(propiedades[5]));

				} else if (propiedades.length == 5) {
					elprofe = new ProfesorTiempoCompleto(propiedades[0], propiedades[1], (propiedades[2]), fecha,
							propiedades[4]);
				}
				archivoBin.writeObject(elprofe);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo");
		} catch (IOException e) {
			System.out.println("Conflicto para leer del archivo");
		}
	}

	// Método 2

	public static ArrayList<Persona> leerObjetosDeArchivo() {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		try {
			ObjectInputStream entradaDeObjetos = new ObjectInputStream(
					new FileInputStream(new File("./objetosProfesor.dat")));
			do {
				personas.add((Persona) entradaDeObjetos.readObject());
			} while (true);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no reconocida");
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo");
		} catch (EOFException e) {
			System.out.println("Fin del archivo, todos los objetos leídos");
		} catch (IOException e) {
			System.out.println("Conflicto para leer del archivo");
		}
		return personas;
		
	}
}
