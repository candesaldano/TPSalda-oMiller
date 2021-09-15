package pack;

public class Vegetal {
    private int id;
    private int vida; //en meses
    private boolean espinas;
    private boolean nativo;
    private String especie;
    private String habitat;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public boolean isEspinas() {
		return espinas;
	}
	public void setEspinas(boolean espinas) {
		this.espinas = espinas;
	}
	public boolean isNativo() {
		return nativo;
	}
	public void setNativo(boolean nativo) {
		this.nativo = nativo;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
