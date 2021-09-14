package pack;
import java.util.ArrayList;

public class Estudiante extends Persona{
	private ArrayList<Nota> notas = new ArrayList<>();
	//agregar metodo para buscar nota, nombre, etc
	private String materias;
	private String carrera;
	private String universidad;

	public String getMaterias() {
		return materias;
	}

	public void setMaterias(String materias) {
		this.materias = materias;
	}

	public Nota getNotas(int index) {
		return this.notas.get(index);
	}

	public int getSizeNotas() {
		return this.notas.size();
	}

	public void setNotas(Nota n) {
		this.notas.add(n);
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

}
