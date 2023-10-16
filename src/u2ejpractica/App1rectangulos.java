package u2ejpractica;

// calcular el area de una cruz dentro de un rectangulo
// de 12x10 quitando en cada esquina de este los
// siguientes elementos(rectangulos + pequeños):
// 3x2, 3x1.5, 2.7x 3.5, 3x1.5
public class App1rectangulos {
	public static void main(String[]Args) {
		Rectangulo recGde = new Rectangulo(12,10);
		Rectangulo esq1 = new Rectangulo(3,2);
		Rectangulo esq2 = new Rectangulo(3,1.5);
		Rectangulo esq3 = new Rectangulo(2.7,3.5);
		Rectangulo esq4 = new Rectangulo(3,1.5);
		
		double areaBuscada = recGde.getArea()-
				(esq1.getArea() + esq2.getArea() + esq3.getArea() + esq4.getArea());
		
		System.out.println("Area central: "+areaBuscada);
	}
	 
}
