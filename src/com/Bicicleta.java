package com;

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

    public Bicicleta(){}

    public Bicicleta(String modelo, String color, String tipo, int rodado, int cambios) {
        super(modelo, color);
        this.tipo = tipo;
        this.rodado = rodado;
        this.cambios = cambios;
    };

    
}
