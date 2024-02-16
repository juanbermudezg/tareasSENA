package ejerciciospoo_15_02_2024;

import java.util.*;
import javax.swing.JOptionPane;


/**
 * @author juanbermudezg
 * Ejercicios Prácticos Java (Atributos, Métodos, Ciclos, Condicional, Switch y Objetos)
 */
public class EjerciciosPOO_15_02_2024 {

    static int option = -1,cantidadAviones=0, option2, option3;
    static String pedir, aerolinea, matricula, text="", pathText;
    static List<avion> aviones = new ArrayList<avion>();
    static boolean estadoOperativo;
    static avion tempAvion;

    public static void main(String[] args) {        
        JOptionPane.showMessageDialog(null, "Bienvenido al programa que buscará dar solución al ejercicio.");
        while (option!=0){            
            try{
                String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Ingrese cantidad de aviones:" +
						"\n2.- Ingresar información de aviones completa\n" +
						"3.- Listar aviones por consola\n" +
						"4.- Modificar información\n" +
                                                "5.- Guardar datos en archivo local\n" +
						"0.- Salir\n************************");
                option = Integer.parseInt(lectura);
                switch(option){
                    case 1:
                        pedir = JOptionPane.showInputDialog(null, "¿Cuántos aviones va a ingresar?: ");
                        cantidadAviones = Integer.parseInt(pedir);
                        JOptionPane.showMessageDialog(null,"Continuemos con el programa.");
                        break;
                    case 2:
                        for (int i=0; i<cantidadAviones; i++){
                            JOptionPane.showMessageDialog(null, "Ingresaremos información de la aeronave #"+(i+1));
                            matricula = JOptionPane.showInputDialog(null, "Ingrese la matricula: ");
                            aerolinea = JOptionPane.showInputDialog(null, "Ingrese la aerolinea: ");
                            pedir = JOptionPane.showInputDialog(null, "Ingrese <1> Si está operativo, <0> Si no está operativo: ");
                            option2 = Integer.parseInt(pedir);
                            switch(option2){
                                case 1:
                                    estadoOperativo = true;
                                    break;
                                case 0:
                                    estadoOperativo = false;
                                    break;
                                default:
                                    option = 1;
                                    JOptionPane.showMessageDialog(null, "Error de elección.");
                                    break;
                            }
                            tempAvion = new avion(matricula, aerolinea, estadoOperativo);
                            aviones.add(tempAvion);
                        }
                        JOptionPane.showMessageDialog(null,"Continuemos con el programa.");
                        break;
                    case 3:
                        for (int j=0; j<cantidadAviones; j++){
                            JOptionPane.showMessageDialog(null, aviones.get(j).toString());
                        }
                        JOptionPane.showMessageDialog(null,"Continuemos con el programa.");
                        break;
                    case 4:
                        pedir = JOptionPane.showInputDialog("¿Cuál aeronave desea modificar?: ");
                        option2 = Integer.parseInt(pedir);
                        JOptionPane.showMessageDialog(null, "Ingresaremos información de la aeronave #"+option2);
                        matricula = JOptionPane.showInputDialog(null, "Ingrese la matricula: ");
                        aerolinea = JOptionPane.showInputDialog(null, "Ingrese la aerolinea: ");
                        pedir = JOptionPane.showInputDialog(null, "Ingrese <1> Si está operativo, <0> Si no está operativo: ");
                        option3 = Integer.parseInt(pedir);
                        switch(option3){
                            case 1:
                                estadoOperativo = true;
                                break;
                            case 0:
                                estadoOperativo = false;
                                break;
                            default:
                                option = 1;
                                JOptionPane.showMessageDialog(null, "Error de elección.");
                                break;
                            }
                            tempAvion = new avion(matricula, aerolinea, estadoOperativo);
                            aviones.add(option2-1, tempAvion);
                        JOptionPane.showMessageDialog(null,"Continuemos con el programa.");
                        break;
                    case 5:
                        for (int k=0; k<cantidadAviones; k++){
                            if (aviones.get(k).toString()!=null){
                                text += "("+(k+1)+") - "+aviones.get(k).toString()+"\n";
                            }
                        }
                        pathText=DirectorioSelector.seleccionarDirectorio();
                        DirectorioSelector.guardarEnArchivo(pathText, text);
                        JOptionPane.showMessageDialog(null,"Continuemos con el programa.");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null,"Adios!");
			break;
                    default:
                        JOptionPane.showMessageDialog(null,"Número no reconocido");break;
                }                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }   
        }   
    }
}
