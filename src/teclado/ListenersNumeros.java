/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author MI PC
 */
public class ListenersNumeros implements KeyListener {

    

    @Override
    public void keyTyped(KeyEvent e) {
//        teclado.JButtonC aux = (teclado.JButtonC) e.getSource();
//        
//       
//       if(e.getKeyCode() == 0)
//       {
//         aux.setBackground(Color.BLACK);
//       }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JButtonC aux = (JButtonC) e.getSource();
        
        char a  = e.getKeyChar();
        if(a == '0' )
        {
          aux.setBackground(Color.BLACK);
          System.out.println(a);
        } 
        else if(a == '1')
        {
            
          aux.setBackground(Color.BLACK);
          System.out.println(a);
        }
        else if(a == '2')
        {
          aux.setBackground(Color.BLACK);
          System.out.println(a);
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       JButtonC aux = (JButtonC) e.getSource();
        char a  = e.getKeyChar();
        if(a == '0' )
        {
          aux.setBackground(Color.RED);
          System.out.println(a);
        } 
        else if(a == '1')
        {
          aux.setBackground(Color.RED);
          System.out.println(a);
        }
        else if(a == '2')
        {
          aux.setBackground(Color.RED);
          System.out.println(a);
        }
        
    }
    
    
    
   
    
}
