package u2;

public class Reticula {
	private Asignatura[] arregloDeAsignaturas;

	public Reticula() {
		arregloDeAsignaturas = new Asignatura[5];

	}

	public Reticula(Asignatura[] arregloDeAsignaturas) {
		this.arregloDeAsignaturas = arregloDeAsignaturas;
	}

	public Asignatura[] getArregloDeAsignaturas() {
		return arregloDeAsignaturas;
	}

	public void setArregloDeAsignaturas(Asignatura[] arregloDeAsignaturas) {
		this.arregloDeAsignaturas = arregloDeAsignaturas;
	}

	public boolean buscar(Asignatura unaAsignatura) {
		// foreach o for enriquecido
		for (Asignatura elemento : arregloDeAsignaturas) {
			if (elemento != null) {
				if (elemento.equals(unaAsignatura)) {
					return true;
				}
			}
		}
		return false;
	}

	public String getAsignaturasCursadas(int semestre) {
		String lasAsignaturas = "";
		for (Asignatura cadaAsignatura : this.arregloDeAsignaturas) {
			if (cadaAsignatura.isCursada() && cadaAsignatura.getSemestre() == semestre) {
				lasAsignaturas += cadaAsignatura.getNombre() + "\n";
			}
		}
		return lasAsignaturas;
	}

	public boolean insertar(Asignatura unaAsignatura) {
		if (!buscar(unaAsignatura)) {
			for (int i = 0; i < this.arregloDeAsignaturas.length; i++) {
				if (this.arregloDeAsignaturas[i] == null) {
					this.arregloDeAsignaturas[i] = unaAsignatura;
					return true;
				}
			}
		}
		return false;
	}

	public int contar() {
		int c = 0;
		for (int i = 0; i < arregloDeAsignaturas.length; i++) {
			if (arregloDeAsignaturas[i] != null) {
				if (arregloDeAsignaturas[i].isCursada()) {
					c++;
				}
			}
		}
		return c;
	}

	public String toString() {
		String lasAsignaturas = "";
		for (Asignatura cadaAsignatura : arregloDeAsignaturas) {
			lasAsignaturas += cadaAsignatura + "\n";
		}
		return "Reticula [arregloDeAsignaturas=" + lasAsignaturas + "]";
	}

}
