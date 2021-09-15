package com;

public class Arbol extends Vegetal implements IActor{
    private boolean frutal;

	public boolean isFrutal() {
		return frutal;
	}

	public void setFrutal(boolean frutal) {
		this.frutal = frutal;
	}

	public Arbol(){};

	public Arbol(int id, int vida, boolean espinas, boolean nativo, String especie, String habitat, boolean frutal) {
		super(id, vida, espinas, nativo, especie, habitat);
		this.frutal = frutal;
	};
}
