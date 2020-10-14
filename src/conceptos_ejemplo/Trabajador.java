/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos_ejemplo;
import java.util.Scanner;//esta clase nos servira para obtener datos del usuario

/**
 *
 * @author DELL
 */
public class Trabajador extends Persona {//heredamos todos los atributos de la clase persona
    private float Salario;
    private String ocupacion;
    
    public static void main(String []args){//creamos el main para trabajar
        String dato,mostrar;
        int i=0;
        Trabajador trabajador =new Trabajador();//creamos un arreglo de trabajadores
        Scanner entrada=new Scanner(System.in);//creamos el objeto de la clase scanner
        
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
        
        
        
        
        
        
        
        
        
    }
    
}
