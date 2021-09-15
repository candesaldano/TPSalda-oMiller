package pack;

public class Profesor {
	private String materia;
	private String cargo;
	private String carrera;
	private String universidad;
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
	public Profesor(String materia, String cargo, String carrera, String universidad) {
		super();
		this.materia = materia;
		this.cargo = cargo;
		this.carrera = carrera;
		this.universidad = universidad;
	}
}