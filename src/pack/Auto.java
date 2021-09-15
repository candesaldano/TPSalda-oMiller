package pack;

public class Auto extends Vehiculo{
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
    public boolean isCambios_autos() {
        return cambios_autos;
    }
    public void setCambios_autos(boolean cambios_autos) {
        this.cambios_autos = cambios_autos;
    }
    private boolean cambios_autos;
}
