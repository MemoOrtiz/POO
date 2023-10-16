package u2;

public class MiListaCumpleaños {

	public static void main(String[] args) {
		
		Cumpleaños miLista = new Cumpleaños();
		Fecha[] listaFechas = new Fecha[5];
		
		listaFechas[0] = new Fecha(1,2,1950);
		listaFechas[1] = new Fecha(28,2,2001);
		listaFechas[2] = new Fecha(14,2,1980);
		listaFechas[3] = new Fecha(30,5,2005);
		listaFechas[4] = new Fecha(15,8,2004);
		
		miLista.setFechas(listaFechas);
		
		System.out.println(miLista.toString());
		
		if(miLista.buscar(new Fecha(14,2,1960))){
			System.out.println("Fecha encontrada");
		}

	}

}
