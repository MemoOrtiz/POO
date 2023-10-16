package dudas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class AppLeerArticulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Articulo> lista = new ArrayList<>();
//Abrir archivo de texto para lectura
BufferedReader br = new BufferedReader(new FileReader("ArchivoTexto1.txt"));
//Procesar contenido del archivo
int cont=0;
while(br.ready()) {
	String linea = br.readLine();
	if(cont==0) {
		String[] titulos = linea.split(",");
	}else {
	 String [] datos =linea.split(",");
	 int clave= Integer.parseInt(datos[0]);
	 double precio = Double.parseDouble(datos[1]);
	 if(datos.length==3) {
		 lista.add(new Articulo(clave, precio, datos[2]));
	 }else if(datos.length==2){
		 lista.add(new Articulo(clave, precio));
	 }
	}
}
	}

}
