package u2;

import javax.swing.JOptionPane;

public class AppSerie2 {

	public static void main(String[] args) {
		
		int cantidad=0;
		cantidad= Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de Series:  "));
		
		Serie[] arregloSerie =new Serie[cantidad];
		 for(int i=0; i<arregloSerie.length;i++) {
			 String nombre = JOptionPane.showInputDialog("Dime el  nombre del productor");
			 String correo = JOptionPane.showInputDialog("Dime el correo del productor");
			 int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad del productor"));
			 String nombreSerie  = JOptionPane.showInputDialog("Dime el nombre de la serie");
			 int temporadas = Integer.parseInt(JOptionPane.showInputDialog("Dime las temporadas de la serie"));
			 Productor productor = new Productor(nombre,correo,edad);
			 arregloSerie[i] = new Serie(nombreSerie,temporadas,productor);
		 }
		 String salida = "";
		//int num=0;
		 for(Serie cadaSerie:arregloSerie) {
			 if(cadaSerie!=null) {
			//num++;
				 
			salida+="La serie "+cadaSerie.toString();
			 }
		 }JOptionPane.showMessageDialog(null, salida);
		 
		 String seriesRegistradas ="";
		 for(Serie cadaSerie:arregloSerie) {
			 if(cadaSerie!=null) {
				 seriesRegistradas += cadaSerie.getProductor().getNombre()+",";
			 }
			 }seriesRegistradas = seriesRegistradas.substring(0,seriesRegistradas.length()-1);
			 String [] seriesA = seriesRegistradas.split(",");
			 
			String serieElegir = (String) JOptionPane.showInputDialog(null, "Cual desea conocer? "
					,"Funciones",JOptionPane.PLAIN_MESSAGE,null,seriesA,seriesA[0]);
			String salida2 = "Las series con el mismo productor son las siguientes ";
			 for(Serie cadaSerie:arregloSerie) {
				 if(cadaSerie!=null) {
					 if(cadaSerie.getProductor().getNombre().equals(serieElegir)) {
						 salida2+="\n"+cadaSerie.getProductor().getNombre();
					 }
				 }
			 }JOptionPane.showMessageDialog(null,salida2);
	}

}
