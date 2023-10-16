package u6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class AppCreaArchivoTextoDeRegistros {
	public static void main(String[] args) {
		// Abrir el archivo
		File archivo = new File("Registros1.txt");
		FileWriter fWriter = null;
		PrintWriter pWriter = null;

		try {
			fWriter = new FileWriter(archivo);
			pWriter = new PrintWriter(fWriter);
			// procesarlo - registro con numero, nombre y edad.
			int seguir = 0;
			while (seguir == 0) {
				int numero = Integer.parseInt(JOptionPane.showInputDialog("numero?"));
				String nombre = JOptionPane.showInputDialog("Nombre?");
				int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad?(1-120)"));
				pWriter.print(numero);
				pWriter.print(", ");
				pWriter.print(nombre + ", ");
				pWriter.print(edad);
				seguir = JOptionPane.showConfirmDialog(null, "capturar otro?");
			}
			// cerrarlo
			pWriter.close();
			fWriter.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "no se ha podido cerrar el archivo");
		}

	}
}
