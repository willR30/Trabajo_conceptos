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
public class Metodos {
    
    //esta clase tendrá todos los metodos con los que se trabaja
    //creamos el constructor de la clase
    private float salario;
    
    public Metodos() {
        
    }
    public void vacaciones(float salario,int dias){
        float monto=(salario/30)*(30-dias);
        
        System.out.println("EL monto ha pagar es de "+String.valueOf(monto));
        
    }
    public void salario_dia(float salario){
        //metodo para calcular el salario por dia
        float dia=salario/30;
        
        System.out.println("EL monto es de "+String.valueOf(dia));
    }
    
}
