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
public class Cuadrado {
    
    //Atributos
    public Double Ancho;
    public Double Alto;
    public Double Area;
    
    
    
    public Cuadrado(){
        Ancho = 0.0;
        Alto = 0.0;
        Area = 0.0;
    }

    
     public Cuadrado(Double Ancho , Double Alto , double Area){
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.Area = Area;  
        System.out.println();
    }
    
    
    
    
    
    
    
    public static void main(String [] args){
        
        Cuadrado cuadrado1 = new Cuadrado();
        
        cuadrado1.Alto = 4.5;
        cuadrado1.Ancho = 4.5;
        System.out.println();
        
        
         Cuadrado cuadrado2 = new Cuadrado(5.5 , 5.5 , 25.5);
        
        System.out.println();
        
        
        
        
    }
}
