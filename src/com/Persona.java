package com;

public abstract class Persona implements IActor{
	String nombre;
	String nacimiento; //mm/dd/aaaa
	int documento;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public Persona(){};

	public Persona(String nombre, String nacimiento, int documento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.documento = documento;
	}
}
