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
public class Jugador {
    
    private String nombre;
    private int numeroPlayera;
    private String nacionalidad;
    private int edad;

    public Jugador() {
        
        this.nombre = "";
        this.numeroPlayera = 0;
        this.nacionalidad = "";
        this.edad = 0;
    }

    public Jugador(String nombre, int numeroPlayera, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.numeroPlayera = numeroPlayera;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroPlayera
     */
    public int getNumeroPlayera() {
        return numeroPlayera;
    }

    /**
     * @param numeroPlayera the numeroPlayera to set
     */
    public void setNumeroPlayera(int numeroPlayera) {
        this.numeroPlayera = numeroPlayera;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public static void main(String [] args){
        
        Jugador jugador1 = new Jugador();
        
        jugador1.setNombre("Rogelio");
        System.out.println(jugador1.getNombre());
    }
    
}
