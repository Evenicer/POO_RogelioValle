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
public class Carro {
    
    //Atributos
    private String Marca;
    private String Color;
    private Double Km;
    
    
    public Carro(){
        Marca = "Desconocido";
        Color = "Desconocido";
        Km = 0.0;
    }

    
     public Carro(String Marca,String Color, double Km){
        this.Color = Color;
        this.Marca = Marca;
        this.Km = Km;  
        System.out.println();
    }
    
     public String getMarca (){
        
        return this.Marca;
    }
    
    
    
    
    
    
    public static void main(String [] args){
        
        Carro Tesla = new Carro();
        
        Tesla.Color = "Blanco";
        Tesla.Km = 13.321;
        Tesla.setMarca("Tesla");
        
        
        
        Carro audi = new Carro("Audi", "Rojo" , 120.34);
        
        System.out.println(audi.getMarca());
        audi.setMarca("Tesla");
        System.out.println(audi.getMarca());
        
        
        
        
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
}
