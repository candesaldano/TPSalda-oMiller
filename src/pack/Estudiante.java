package pack;

public class Estudiante extends Persona{
	String materias;
	int[] notas;//corregir
	String carreras;
	String universidad;
	public String getMaterias() {
		return materias;
	}
	public void setMaterias(String materias) {
		this.materias = materias;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public String getCarreras() {
		return carreras;
	}
	public void setCarreras(String carreras) {
		this.carreras = carreras;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public Estudiante(String materias, int[] notas, String carreras, String universidad) {
		super();
		this.materias = materias;
		this.notas = notas;
		this.carreras = carreras;
		this.universidad = universidad;
	}
	
	public Estudiante() {
		
	}

}
