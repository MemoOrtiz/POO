package u3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppProductos {

	public static void main(String[] args) {
		
		ArrayList<Producto>lista= new ArrayList<>();
		lista.add(new ConCaducidad("Leche",23.50,4));
		lista.add(new ConCaducidad("Crema",19.70,2));
		lista.add(new SinCaducidad("Shampoo",73.40,"Higiene Personal"));
		lista.add(new ConCaducidad("Queso", 47.50,1));
		lista.add(new SinCaducidad("Jabon de barra", 22.80,"Limpieza"));
		
		String salida="";
		for(Producto elemento:lista) {
			salida+=elemento.toString()+ "\nPago por 5 productos: "+ elemento.calcular(5)+"\n";
		}JOptionPane.showMessageDialog(null, salida);
		
		int cantConCaducidad=0;
		int cantSinCaducidad=0;
		for(Producto elemento:lista) {
			if(elemento instanceof ConCaducidad) {
				cantConCaducidad++;
			}else {
				cantSinCaducidad++;
			}
		}JOptionPane.showMessageDialog(null,
				"\n#Productos con caducidad"+ cantConCaducidad+
				"\n#Productos sin caducidad"+ cantSinCaducidad);
		
	}

}
