package pack;
import java.util.ArrayList;

public class Estudiante extends Persona{
	private ArrayList<Nota> notas = new ArrayList<>();
	//agregar metodo para buscar nota, nombre, etc
	private String materia;
	private String carrera;
	private String universidad;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
