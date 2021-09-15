package com;

public class Profesor extends Persona{
	private String catedra;
	private String cargo;
	private String carrera;
	private String universidad;
	
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
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

	public Profesor(){};

	public Profesor(String nombre, String nacimiento, int documento, String catedra, String cargo, String carrera, String universidad) {
		super(nombre, nacimiento, documento);
		this.catedra = catedra;
		this.cargo = cargo;
		this.carrera = carrera;
		this.universidad = universidad;
	}
}