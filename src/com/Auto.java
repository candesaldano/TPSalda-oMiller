package com;

public class Auto extends Vehiculo{
    private boolean automatico;
    private String tecnologia; //ABS, Airbag...
    private String motor;
    private String patente;
    
    public String getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
    public Auto(){};

    public Auto(String modelo, String color, boolean automatico, String tecnologia, String motor, String patente) {
        super(modelo, color);
        this.automatico = automatico;
        this.tecnologia = tecnologia;
        this.motor = motor;
        this.patente = patente;
    }
}
