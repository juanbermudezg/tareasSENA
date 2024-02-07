package codigojava;
/*@author juanb*/
public class CodigoJAVA {
    public static void main(String[] args) {   
        Ejercicio1_06_02_2024 ejercicio = new Ejercicio1_06_02_2024("Huawei", "Azul");
        String text;
        text = ejercicio.toString();
        System.out.println("Desde main\t-\t"+text);
    }    
}