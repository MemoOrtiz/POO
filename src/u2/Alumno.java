package u2;

public class Alumno {
	private String noControl;
	private int semestre;
	private Reticula reticula;
	
	public Alumno(String noControl, int semestre, Reticula reticula) {
		this.noControl = noControl;
		this.semestre = semestre;
		this.reticula = reticula;
	}

	public String getNoControl() {
		return noControl;
	}

	public void setNoControl(String noControl) {
		this.noControl = noControl;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public Reticula getReticula() {
		return reticula;
	}

	public void setReticula(Reticula reticula) {
		this.reticula = reticula;
	}

	public String mostrarAsignaturasCursadas(int semestre) {
		return reticula.getAsignaturasCursadas(semestre);
	}
	public int calTotalCreditos() {
		Asignatura[] arregloAsignaturas = reticula.getArregloDeAsignaturas();
		int total=0;
		for(Asignatura elemento : arregloAsignaturas) {
			if(elemento.isCursada()) {
				total = total + elemento.getCreditos();
			}
		}return total;
	}

	@Override
	public String toString() {
		return "Alumno [noControl=" + noControl + ", semestre=" + semestre + ", reticula=" + reticula + "]";
	}
	
}
