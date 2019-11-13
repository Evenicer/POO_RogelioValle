/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

/**
 *
 * @author MI PC
 */
public class Persona {
    
    public String nombre;
    public String apellidos;
    public int edad;
    
    public static void main(String [] args){
        
        Persona persona1 = new Persona();
        
        persona1.apellidos = "Valle";
        persona1.nombre = "Rogelio";
        persona1.edad = 18;
    }
}
