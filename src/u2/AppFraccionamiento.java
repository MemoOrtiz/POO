package u2;

import javax.swing.JOptionPane;

public class AppFraccionamiento {
	// suma de 70 de ambas plantas

	public static void main(String[] args) {

		//String menu = "1.-";

		int numCasas;
		numCasas = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de casas: "));
		Casa[] arregloCasas = new Casa[numCasas];

		String salida = "";

		for (int i = 0; i < arregloCasas.length; i++) {
			String nombre = JOptionPane.showInputDialog("Nombre del propietario: "+(i+1));
			int telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono del propietario "+(i+1)+":"));
			
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia del Nacimiento del propietario "+(i+1)+":"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes del Nacimiento del propietario "+(i+1)+":"));
			int año = Integer.parseInt(JOptionPane.showInputDialog("Año del Nacimiento del propietario "+(i+1)+":"));
			float superficieP1 = Float.parseFloat(JOptionPane.showInputDialog("Superficie Planta 1 de la casa "+(i+1)+":"));
			float superficieP2 = Float.parseFloat(JOptionPane.showInputDialog("Superficie Planta 2 de la casa "+(i+1)+":"));

			Fecha fechaNacimiento = new Fecha(dia, mes, año);
			Persona propietario = new Persona(nombre, telefono, fechaNacimiento);
			arregloCasas[i] = new Casa(propietario, superficieP1, superficieP2);
		}
		// Datos de la casa de manera completa
		int num = 1;
		for (Casa cadaCasa : arregloCasas) {
			if (cadaCasa != null) {
				salida = salida + "Casa " + num++;
				salida = salida + cadaCasa.toString() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, salida);

		salida = "Propietarios de casas con superficie mayor a 70 metros cuadrados: \n";
		;
		//foreach for enriquecido
		for (Casa cadaCasa : arregloCasas) {   
			if (cadaCasa != null) {
				if (cadaCasa.getSuperficieP1() + cadaCasa.getSuperficieP2() > 70.0) {
					salida = salida + cadaCasa.getPropietario().getNombre() + "\n";

				}
			}
		}
		JOptionPane.showMessageDialog(null, salida);

	}

}
