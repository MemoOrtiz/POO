package dudas;

import javax.swing.JOptionPane;

import misUtilerias.SalidaFormateada;


public class EjemplosDudas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sfjhfjgjdsvmafdbskbmsfgkmksgn";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		str += "afnjdfnbsjbnsgjbnsjgbnsjfnbfnbbmkgk";
		
		JOptionPane.showMessageDialog(null, str);
		//mucho texto
		SalidaFormateada.imprimeConScroll(str);
	}
	
}


