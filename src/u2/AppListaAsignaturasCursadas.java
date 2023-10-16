package u2;

import javax.swing.JOptionPane;

public class AppListaAsignaturasCursadas {

	public static void main(String[] args) {

		int seguir = 0;
		int numMaterias = 0;
		numMaterias = Integer
				.parseInt(JOptionPane.showInputDialog("Dime el numero de materias que quieras ingresar: "));
		Asignatura[] arregloAsignatura = new Asignatura[numMaterias];

		for (int i = 0; i < numMaterias && seguir==0; i++) {
			String nombre = JOptionPane.showInputDialog("Dime  el nombre de la materia: ");
			String clave = JOptionPane.showInputDialog("Dime la clave de la materia: ");
			int hrsTeorica = Integer.parseInt(JOptionPane.showInputDialog("Dime las horas teoricas de la materia"));
			int hrsPractica = Integer.parseInt(JOptionPane.showInputDialog("Dime las horas practicas de la materia"));
			int creditos = Integer.parseInt(JOptionPane.showInputDialog("Dime los creditos de la materia"));
			int semestre = Integer.parseInt(JOptionPane.showInputDialog("Dime el semestre de la materia"));
			boolean cursada = (0 == JOptionPane.showConfirmDialog(null, "¿Esta cursada la materia?", "Selección",
					JOptionPane.YES_NO_OPTION));
			arregloAsignatura[i] = new Asignatura( clave,nombre, hrsTeorica, hrsPractica, creditos, semestre, cursada);
			seguir = JOptionPane.showConfirmDialog(null, "Desea seguir capturando?");
		}
		String salida = "Las materias cursadas son: \n";
		for (Asignatura cadaMateria : arregloAsignatura) {
			if (cadaMateria != null) {
				if (cadaMateria.isCursada())
					;
				salida += "\n"+cadaMateria.getNombre();
			}
		}
		JOptionPane.showMessageDialog(null, salida);
	}

}
