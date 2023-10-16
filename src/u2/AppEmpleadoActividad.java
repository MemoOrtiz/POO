package u2;

import javax.swing.JOptionPane;

public class AppEmpleadoActividad {

	public static void main(String[] args) {
		int tam = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de empleados"));
		EmpleadoAct[] arregloEmpleados = new EmpleadoAct[tam];
		int seguir = 0;

		for (int i = 0; i < arregloEmpleados.length && seguir == 0; i++) {
			String nombre = JOptionPane.showInputDialog("Dime el nombre del empleado " + (i + 1) + ":");
			int departamento = Integer
					.parseInt(JOptionPane.showInputDialog("Ingresa el departamento del empleado " + (i + 1) + ":"));
			int horasTrabajadas = Integer.parseInt(
					JOptionPane.showInputDialog("Ingresa las horas trabajadas del empleado " + (i + 1) + ":"));
			double pagoPorHora = Float
					.parseFloat(JOptionPane.showInputDialog("Dame el pago por hora del empleado " + (i + 1) + ":"));
			arregloEmpleados[i] = new EmpleadoAct(nombre, departamento, horasTrabajadas, pagoPorHora);
			seguir = JOptionPane.showConfirmDialog(null, "Desea seguir capturando?");
		}
		// mostrar la lista de empleados con su salario
		String salida = "";
		for (EmpleadoAct elemento : arregloEmpleados) {
			if (elemento != null) {
				salida += "Empleado: " + elemento.getNombre() + "\nSalario: " + elemento.getSalario();
			}
		}
		JOptionPane.showMessageDialog(null, salida);

		// mostrar la lista de empleados que trabajan 40 horas o menos
		String salida2 = "Los empleados que trabajan 40 horas o menos son:\n ";
		for (EmpleadoAct elemento : arregloEmpleados) {
			if (elemento != null) {
				if (elemento.getHorasTrabajadas() <= 40) {
					salida2 += elemento.getNombre();
				}
			}
		}
		JOptionPane.showMessageDialog(null, salida2);

		// mostrar la lista de empleados de cierto departamento cuyo salario sea mayor a
		// 1000
		String salida3 = "Los empleados con sueldo mayor a 1000 son:\n";
		int departamento = Integer.parseInt(
				JOptionPane.showInputDialog("Dime el departamento que deseas conocer los salarios mayores a 1000"));
		for (EmpleadoAct elemento : arregloEmpleados) {
			if (elemento != null) {

				if (elemento.getDepartamento() == departamento) {
					if (elemento.getSalario() > 1000) {
						salida3 += "Empleado: " + elemento.getNombre() + "\nSalario: " + elemento.getSalario();
					}
				} else {

				}
			}
		}
		JOptionPane.showMessageDialog(null, salida3);
		
		//comentar de comentario
		// Empleados de cierto departamento que su sueldo sea mayor a 1000.00
		//String departamentosRegistrados = " ";
		//for (EmpleadoAct unEmpleado : arregloEmpleados) {
			//if (unEmpleado != null) {
				//departamentosRegistrados += unEmpleado.getDepartamento() + ",";
			//}
		//}
		//departamentosRegistrados = departamentosRegistrados.substring(0, departamentosRegistrados.length() - 1);

//		String[] losDepartamentos = departamentosRegistrados.split(",");
//
	//	String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione uno: ", "Departamentos Registrados",
		//		JOptionPane.PLAIN_MESSAGE, null, losDepartamentos, losDepartamentos[0]);

		
		//JOptionPane.showMessageDialog(null, salida4);
	}

}
