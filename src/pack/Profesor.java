package pack;

public class Profesor {
	private String materias;
	private String cargo;
	private String carreras;
	private String universidad;
	
	public String getMaterias() {
		return materias;
	}
	public void setMaterias(String materias) {
		this.materias = materias;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
	public Profesor(String materias, String cargo, String carreras, String universidad) {
		super();
		this.materias = materias;
		this.cargo = cargo;
		this.carreras = carreras;
		this.universidad = universidad;
	}
	
	public Profesor() {
		
	}


}
