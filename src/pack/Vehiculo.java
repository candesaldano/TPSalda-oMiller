package pack;

public class Vehiculo implements IObjetoInerte, IActor {
    private String modelo;
    private String color;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
