package pack;

public class Arbol extends Vegetal implements Actor{
    private boolean frutal;

	public boolean isFrutal() {
		return frutal;
	}

	public void setFrutal(boolean frutal) {
		this.frutal = frutal;
	}

	public Arbol() {
//		super(id, vida, altura, espinas, nativo, especie, habitat);
		super();
	}
}
