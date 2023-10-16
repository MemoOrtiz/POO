package u6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

/**
 * Leer un archivo de texto (csv) linea por línea y se crearan objetos que seran
 * insertados en una lista
 * 
 * @author Master
 *
 */
public class BDCafeteria {

	public static void main(String[] args) {
		BufferedReader br = null;
		String nombreArchivo = "";
		ArrayList<EmpleadoCafeteria> lista = new ArrayList<>();
		JFileChooser chooser = new JFileChooser(".");

		int selected = chooser.showOpenDialog(null);
		if (selected == JFileChooser.APPROVE_OPTION) {
			nombreArchivo = chooser.getSelectedFile().getName();
		}
		// Abrir archivo
		try {
			br = new BufferedReader(new FileReader(nombreArchivo));
			int cont = 0;
			while (br.ready()) {
				if (cont == 0) {
					br.readLine();
				} else {
					String linea = br.readLine();
					String[] partesDeLinea = linea.split(",");
//					for(String parte : partesDeLinea) {
//						System.out.println(parte + "\n");
//					}
					EmpleadoCafeteria emp = new EmpleadoCafeteria(partesDeLinea[0], partesDeLinea[1], partesDeLinea[2],
							partesDeLinea[3], partesDeLinea[4], partesDeLinea[5], Double.parseDouble(
									partesDeLinea[6].replaceAll("\"", "").replace("$", "").replace(",", "").trim()));
					lista.add(emp);
				}
				cont++;
			}

			br.close();
			System.out.println(lista);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo");
		} catch (IOException e) {
			System.out.println("Conflicto para leer del archivo");
		}
	}

}