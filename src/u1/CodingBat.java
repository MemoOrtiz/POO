package u1;

public class CodingBat {

	public static void main(String[] args) {
		String cadena1= "Chocolate";
		String cadena2= new String ("Caramelo");
		
		System.out.println("hamburguer".substring(4,8));
		System.out.println(cadena1.substring(0,3));
		System.out.println(cadena2.substring(0,3));
		
		System.out.println("      hola      ".stripLeading()); //quito espacios de la izq
		System.out.println("      hola      ".stripTrailing());//quito espacios der
		System.out.println("      hola      ".stripIndent());//quito espacios izq/der
		
		System.out.println("Hola".charAt(0)); //primer caracter
		System.out.println("1234".charAt("1234".length()-1)); //ultimo caracter
	}

}
