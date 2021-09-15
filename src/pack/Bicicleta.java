package pack;

public class Bicicleta extends Vehiculo{
    private String tipo; //BMX, FreeStyle, Downhill, Playera...
    private int rodado;
    private int cambios;
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getRodado() {
        return rodado;
    }
    public void setRodado(int rodado) {
        this.rodado = rodado;
    }
    public int getCambios() {
        return cambios;
    }
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }
}
