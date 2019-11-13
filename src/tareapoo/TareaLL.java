/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import java.util.ArrayList;
import java.util.LinkedList;
import tareapoo.Carro;
import tareapoo.Gato;
import tareapoo.Hora;
import tareapoo.Jugador;

/**
 *
 * @author Invitado
 */
public class TareaLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Object> ListaObjetos = new LinkedList<Object>();
        
        ListaObjetos.add(new Carro());
        ListaObjetos.add(new Gato());
        ListaObjetos.add(new Hora());
        
        for (Object aux: ListaObjetos){
        if(aux instanceof Carro){
            Carro aux2 = (Carro)aux;
            System.out.println(aux2.toString());
        }else{
            if(aux instanceof Gato){
                Gato aux3 = (Gato)aux;
                System.out.println(aux3.toString());
            }else{
                Hora aux4 = (Hora)aux;
                System.out.println(aux4.toString());
            }
        }
    }
        
    }
    
}