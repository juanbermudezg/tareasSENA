package codigojava;
/**
 *
 * @author juanb
 */
public class Ejercicio1_06_02_2024 { //Celular
    
    private String nombreCelular, colorCelular;
    
    public Ejercicio1_06_02_2024(String nombreCelular, String colorCelular) {
        this.nombreCelular = nombreCelular;
        this.colorCelular = colorCelular;
    }

    public String getNombreCelular() {
        return nombreCelular;
    }

    public void setNombreCelular(String nombreCelular) {
        this.nombreCelular = nombreCelular;
    }

    public String getColorCelular() {
        return colorCelular;
    }

    public void setColorCelular(String colorCelular) {
        this.colorCelular = colorCelular;
    }
    
    @Override
    public String toString(){
        String text;
        text= "Llamando al celular "+nombreCelular+" de color "+colorCelular;
        System.out.println(text);
        return text;
    }
    
    public void detalleCelular(){
        
    }
}
