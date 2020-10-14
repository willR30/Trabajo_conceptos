/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos_ejemplo;

/**
 *
 * @author DELL
 */
public class Persona {
    /*declaramos los atributos de la persona*/
    protected String Nombre,Apellido;
    protected int edad;
    
    //encapsulamos los atributos del objeto persona
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    //------------------------------------------------------

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    //-------------------------------------------------------

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
