package u6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArchivoDeBajoNivel {
	public void crearArchivoDeBytes(String nombreArchivo) {
		byte[] arregloDeBytes = { 10, 20, 30, 40, 50, 60, 70, 80 };
		try {
			// apertura del archivo binario para la escritura
			File objFile = new File("D:/Eclipse/Workspace/POO/POO/archivosCreados/"+nombreArchivo);
			FileOutputStream flujoSalida = new FileOutputStream(objFile);
			// proceso del archivo
			flujoSalida.write(arregloDeBytes);
			// cerrar el archivo
			flujoSalida.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo");
		} catch (IOException e) {
			System.out.println("No se pudo escribir en el archivo");
		}
	}

	public void leerArchivoDeBytes(String nombreArchivo) {
		try {
			// abrir archivo binario para lectura
			File objFile = new File(nombreArchivo);
			FileInputStream flujoEntrada = new FileInputStream(objFile);
			// procesar archivo-read-
			int cantBytes = (int) objFile.length();
			byte[] arregloDeBytes = new byte[cantBytes];

			flujoEntrada.read(arregloDeBytes);

			System.out.println(Arrays.toString(arregloDeBytes));
			// cerrar
			flujoEntrada.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo");
		} catch (IOException e) {
			System.out.println("No se pudo escribir en el archivo");
		}
	}

	public boolean esValido(String nombreArchivo) {
		if (nombreArchivo.endsWith(".dat")) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ArchivoDeBajoNivel obj = new ArchivoDeBajoNivel();
		String nombreArchivo = "";
		do {
			nombreArchivo = JOptionPane.showInputDialog("Nombre del archivo con extension? ");
		} while (!obj.esValido(nombreArchivo));
		obj.crearArchivoDeBytes(nombreArchivo);
		obj.leerArchivoDeBytes(nombreArchivo);

	}
}
