package u2;

import javax.swing.JOptionPane;

public class AppListaBotones {
//Crear un arreglo de referencias a objetos de tipo Boton
//mostar la lista de botones y mostrar todos los datos de los botones
//cuyo texto inicie con las letras M,P o S
	
	public static void main(String[] args) {
		Boton []arregloBoton = new Boton[10];
		int seguir=0;
		
		for(int i=0;seguir==0 && i<arregloBoton.length;i++) {
		float ancho = Float.parseFloat(JOptionPane.showInputDialog("Ancho del boton: "));
		float alto = Float.parseFloat(JOptionPane.showInputDialog("Alto del boton: "));
		String texto = JOptionPane.showInputDialog("Texto del boton: ");
		arregloBoton[i]= new Boton(ancho,alto,texto);
		seguir = JOptionPane.showConfirmDialog(null, "Capturar otro boton?");
		System.out.println("El valor del showConfirmDialog: "+seguir);
		}
		String salida="";
		for(Boton cadaBoton:arregloBoton) {
			if(cadaBoton != null) {
			salida = salida + cadaBoton.toString()+ "\n------------";
			}
		}
		JOptionPane.showMessageDialog(null,salida);
		
		//Listar los botones que empiezan conM,P oS Forma 1 con CharAt
		
		salida = "";
		for(Boton cadaBoton: arregloBoton) {
			if(cadaBoton!=null &&(cadaBoton.getTexto().toUpperCase().charAt(0)=='M'||
					cadaBoton.getTexto().toUpperCase().charAt(0)=='P'||
					cadaBoton.getTexto().toUpperCase().charAt(0)=='S')) {
				salida= salida+ cadaBoton.toString() + "\n----------------";
			}
			
		}JOptionPane.showMessageDialog(null,salida);
		
		//Listar los botones que empiezan conM,P oS Forma 2 con substring
		
		String letrasBuscadas= "MPS";
		salida = "";
		for(Boton cadaBoton :arregloBoton) {
			if(cadaBoton != null && cadaBoton.getTexto().length()>0 &&
				letrasBuscadas.contains(cadaBoton.getTexto().toUpperCase().substring(0,1))) {
				salida = salida + cadaBoton.toString() + "\n------------";
			}
		}JOptionPane.showMessageDialog(null,salida);
	}
}
