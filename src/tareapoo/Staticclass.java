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
public class Staticclass {
    
    public int var;
    static int cont=0;
    

    public static void main(String[] args) {
        
        Staticclass inst = new Staticclass();
        
        
        Staticclass a = new Staticclass();
        cont++;
        
        Staticclass b = new Staticclass();
        cont++;
        
        System.out.println(cont);
        
       
        
        
    }
    
    
    
    
    
    
}
