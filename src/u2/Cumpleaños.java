package u2;

import java.util.Arrays;

public class Cumpleaños {
	private Fecha[] fechas;

	public Cumpleaños() {
		fechas = new Fecha[5];
	}

	public Cumpleaños(int tam) {
		fechas = new Fecha[tam];
	}

	public Cumpleaños(Fecha[] fechas) {
		this.fechas = fechas;
	}

	public Fecha[] getFechas() {
		return fechas;
	}

	public void setFechas(Fecha[] fechas) {
		this.fechas = fechas;
	}

	public void insertar(Fecha fecha) {
		if (!buscar(fecha)) {
			for (int i = 0; i < fechas.length; i++) {
				if (fechas[i] == null) {
					fechas[i] = fecha;
					break;
				}
			}
		}
	}

	public boolean buscar(Fecha fecha) {
		for (int i = 0; i < fechas.length; i++) {
			if (fechas[i] != null && fechas[i].equals(fecha)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cumpleaños [fechas=" + Arrays.toString(fechas) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fechas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cumpleaños other = (Cumpleaños) obj;
		return Arrays.equals(fechas, other.fechas);
	}

}
