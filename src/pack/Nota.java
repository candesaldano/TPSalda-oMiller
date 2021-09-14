package pack;

public class Nota {
    private float puntuacion;
    private String nombre;
    private int documento;

	public float getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(float puntuacion) {
		this.puntuacion = puntuacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDocumento() {
		return documento;
	}
	
	public void setDocumento(int documento) {
        this.documento = documento;
	}

    public Nota(Nota obj){
        this.puntuacion = obj.puntuacion;
        this.nombre = obj.nombre;
        this.documento = obj.documento;
    }

    public Nota(float puntuacion, String nombre, int documento) {
        this.puntuacion = puntuacion;
        this.nombre = nombre;
        this.documento = documento;
    }
}
