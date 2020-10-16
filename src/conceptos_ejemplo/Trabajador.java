/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos_ejemplo;
import java.util.Scanner;//esta clase nos servira para obtener datos del usuario
import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Trabajador extends Persona {//heredamos todos los atributos de la clase persona
    private float Salario;
    private String ocupacion;
    
    
    //encapsulamos los atributos

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public static void main(String []args){//creamos el main para trabajar
        String dato;
        int i=0;
        Trabajador trabajador =new Trabajador();//creamos un arreglo de trabajadores
        Scanner entrada=new Scanner(System.in);//creamos el objeto de la clase scanner
        Metodos metodos=new Metodos();
        
        //nombre
        System.out.println("inserta el nombre del trabajador");
        dato=entrada.nextLine();
        trabajador.setNombre(dato);
        
        //apellido
        System.out.println("inserta el Apellido del trabajador");
        dato=entrada.nextLine();
        trabajador.setApellido(dato);
        
        //edad
        System.out.println("inserta la edad ");
        dato=entrada.nextLine();
        trabajador.setEdad(Integer.parseInt(dato));//mandamos la edad pero hacemos un parseo para la compatibilidad de datos
        
        //ocupacion
        System.out.println("inserta la ocupacion del trabajador");
        dato=entrada.nextLine();
        trabajador.setOcupacion(dato);
        
        //salario
        System.out.println("inserta el Salario del trabajador");
        dato=entrada.nextLine();
        trabajador.setSalario(Float.parseFloat(dato));//hacemos otro parseo de string a float   
        
        //----------------mostramos un menú sencillo
        System.out.println("   Selecciona una opcion");
        System.out.println("1-Calculo de salario por dia");
        System.out.println("2-Calculo de indemnizacion");
        
        int seleccion=entrada.nextInt();
        switch(seleccion){
            case 1:
                //calculo de salario por dia
                
                float salario=trabajador.getSalario();
                trabajador.detalle(trabajador);
                metodos.salario_dia(salario);
                break;
            case 2:
                //aguinaldo
                
                System.out.println("Inserta los dias de vacaciones gozados");
                int dias=entrada.nextInt();
                salario=trabajador.getSalario();
                trabajador.detalle(trabajador);
                metodos.vacaciones(salario, dias);
                break;
            default:
                //nada XD
                     break;
        }
        
        
        
        
        
        
        
    }
     void detalle(Trabajador trab){
        
        System.out.println("Nombre : "+trab.getNombre()+"\nApellido :"+trab.getApellido());
        System.out.println("Ocupacion :"+trab.getOcupacion());
        System.out.println("Salario Mensual:"+trab.getSalario());
        
    }
    
}
