package pack;

public class Arbol extends Vegetal implements IActor{
    private boolean frutal;

	public boolean isFrutal() {
		return frutal;
	}

	public void setFrutal(boolean frutal) {
		this.frutal = frutal;
	}

	public Arbol() {
		super();
	}
}
