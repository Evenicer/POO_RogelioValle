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
public class Fecha {
    
    //Atributos
    public String mes;
    public String dia;
    public int anio;
    
    
    public Fecha(){
        mes = "Desconocido";
        dia = "Desconocido";
        anio = 0;
    }

    
     public Fecha(String mes , String dia , int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;  
        System.out.println();
    }
    
    
    
    public static void main(String [] args){
        
        Fecha fecha1 = new Fecha();
        
        fecha1.anio = 2019;
        fecha1.dia = "Lunes";
        fecha1.mes = "Agosto";
        
         Fecha fecha2 = new Fecha("Diciembre" , "Lunes" , 1999);
        
        System.out.println();
        
        
        
    }
}
