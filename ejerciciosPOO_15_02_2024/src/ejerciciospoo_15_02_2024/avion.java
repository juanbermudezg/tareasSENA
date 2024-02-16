package ejerciciospoo_15_02_2024;
/**
 * @author juanbermudezg
 */
public class avion {
    
    private String matricula, aerolinea;
    private boolean estadoOperativo;
    
    public avion(String matricula, String aerolinea, boolean estadoOperativo) {
        
        this.matricula = matricula;
        this.aerolinea = aerolinea;
        this.estadoOperativo = estadoOperativo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public boolean isEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(boolean estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
    
    @Override
    public String toString(){
        String text;
        text = "Aeronave con matricula: "+matricula+", de la aerolínea "+aerolinea;
        if (this.estadoOperativo){
            text+=" está operativo.";
        } else {
            text+=" no está operativo.";
        }
        return text;
    }
    
}
