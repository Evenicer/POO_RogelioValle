/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MI PC
 */
public class JFrameTeclado extends JFrame {
    
    public JFrameTeclado(){
    
        InicializarComponentes();
    
    }
    
    private void InicializarComponentes(){
    
    
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(1,10));
        // creamos los botones
        
        Dimension dim = new Dimension(30,30);
        

        JButtonC btn0 = new JButtonC("0", dim, Color.red);
        JButtonC btn1 = new JButtonC("1", dim, Color.red);
        JButtonC btn2 = new JButtonC("2", dim, Color.red);
        JButtonC btn3 = new JButtonC("3", dim, Color.red);
        JButtonC btn4 = new JButtonC("4", dim, Color.red);
        JButtonC btn5 = new JButtonC("5", dim, Color.red);
        JButtonC btn6 = new JButtonC("6", dim, Color.red);
        JButtonC btn7 = new JButtonC("7", dim, Color.red);
        JButtonC btn8 = new JButtonC("8", dim, Color.red);
        JButtonC btn9 = new JButtonC("9", dim, Color.red);
   
    

        panelCentral.add(btn0);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
    
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.NORTH);
        
        
        
        
        
        // crear el componente para la parte central
        JPanel panelLetras = new JPanel(new GridLayout(3,10));
        // creamos los botones
        
        
        JButtonC btnA = new JButtonC("A", dim, Color.red);
        JButtonC btnB = new JButtonC("B", dim, Color.red);
        JButtonC btnC = new JButtonC("C", dim, Color.red);
        JButtonC btnD = new JButtonC("D", dim, Color.red);
        JButtonC btnE = new JButtonC("E", dim, Color.red);
        JButtonC btnF = new JButtonC("F", dim, Color.red);
        JButtonC btnG = new JButtonC("G", dim, Color.red);
        JButtonC btnH = new JButtonC("H", dim, Color.red);
        JButtonC btnI = new JButtonC("I", dim, Color.red);
        JButtonC btnJ = new JButtonC("J", dim, Color.red);
        JButtonC btnK = new JButtonC("K", dim, Color.red);
        JButtonC btnL = new JButtonC("L", dim, Color.red);
        JButtonC btnM = new JButtonC("M", dim, Color.red);
        JButtonC btnN = new JButtonC("N", dim, Color.red);
        JButtonC btnO = new JButtonC("O", dim, Color.red);
        JButtonC btnP = new JButtonC("P", dim, Color.red);
        JButtonC btnQ = new JButtonC("Q", dim, Color.red);
        JButtonC btnR = new JButtonC("R", dim, Color.red);
        JButtonC btnS = new JButtonC("S", dim, Color.red);
        JButtonC btnT = new JButtonC("T", dim, Color.red);
        JButtonC btnU = new JButtonC("U", dim, Color.red);
        JButtonC btnV = new JButtonC("V", dim, Color.red);
        JButtonC btnW = new JButtonC("W", dim, Color.red);
        JButtonC btnX = new JButtonC("X", dim, Color.red);
        JButtonC btnY = new JButtonC("Y", dim, Color.red);
        JButtonC btnZ = new JButtonC("Z", dim, Color.red);
        JButtonC btnfDer = new JButtonC("->", dim, Color.red);
        JButtonC btnfIzq = new JButtonC("<-", dim, Color.red);
        JButtonC btnfAbaj = new JButtonC("^", dim, Color.red);
        JButtonC btnfArrib = new JButtonC("Abajo", dim, Color.red);
        
        
        panelLetras.add(btnA);
        panelLetras.add(btnB);
        panelLetras.add(btnC);
        panelLetras.add(btnD);
        panelLetras.add(btnE);
        panelLetras.add(btnF);
        panelLetras.add(btnG);
        panelLetras.add(btnH);
        panelLetras.add(btnI);
        panelLetras.add(btnJ);
        panelLetras.add(btnK);
        panelLetras.add(btnL);
        panelLetras.add(btnM);
        panelLetras.add(btnN);
        panelLetras.add(btnO);
        panelLetras.add(btnP);
        panelLetras.add(btnQ);
        panelLetras.add(btnR);
        panelLetras.add(btnS);
        panelLetras.add(btnT);
        panelLetras.add(btnU);
        panelLetras.add(btnV);
        panelLetras.add(btnW);
        panelLetras.add(btnX);
        panelLetras.add(btnY);
        panelLetras.add(btnZ);
         panelLetras.add(btnfDer);
        panelLetras.add(btnfIzq);
        panelLetras.add(btnfAbaj);
        panelLetras.add(btnfArrib);
        
        
        add(panelLetras,BorderLayout.WEST);
        
        
//     ListenersNumeros nums = new ListenersNumeros();
//     
//     btn0.addKeyListener(nums);
//     btn1.addKeyListener(nums);
//     btn2.addKeyListener(nums);
    
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         

      
       KeyListener listener0 = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
        
//                char letra=e.getKeyChar();
//                btn0.setBackground(Color.BLACK);
//                System.out.println(letra);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char letra=e.getKeyChar();
                
                if(letra == '0')
                {
                  btn0.setBackground(Color.BLACK);
                }
                else if(letra == '1')
                {
                  btn1.setBackground(Color.BLACK);
                }
                else if(letra == '2')
                {
                  btn2.setBackground(Color.BLACK);
                }
                else if(letra == '3')
                {
                  btn3.setBackground(Color.BLACK);
                }
                else if(letra == '4')
                {
                  btn4.setBackground(Color.BLACK);
                }
                else if(letra == '5')
                {
                  btn5.setBackground(Color.BLACK);
                }
                else if(letra == '6')
                {
                  btn6.setBackground(Color.BLACK);
                }
                else if(letra == '7')
                {
                  btn7.setBackground(Color.BLACK);
                }
                else if(letra == '8')
                {
                  btn8.setBackground(Color.BLACK);
                }
                else if(letra == '9')
                {
                  btn9.setBackground(Color.BLACK);
                }
                else if(letra == 'a')
                {
                  btnA.setBackground(Color.BLACK);
                }
                
                System.out.println(letra);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char letra=e.getKeyChar();
                
                if(letra == '0')
                {
                  btn0.setBackground(Color.RED);
                }
                else if(letra == '1')
                {
                  btn1.setBackground(Color.RED);
                }
                else if(letra == '2')
                {
                  btn2.setBackground(Color.RED);
                }
                else if(letra == '3')
                {
                  btn3.setBackground(Color.RED);
                }
                else if(letra == '4')
                {
                  btn4.setBackground(Color.RED);
                }
                else if(letra == '5')
                {
                  btn5.setBackground(Color.RED);
                }
                else if(letra == '6')
                {
                  btn6.setBackground(Color.RED);
                }
                else if(letra == '7')
                {
                  btn7.setBackground(Color.RED);
                }
                else if(letra == '8')
                {
                  btn8.setBackground(Color.RED);
                }
                else if(letra == '9')
                {
                  btn9.setBackground(Color.RED);
                }
                else if(letra == 'a')
                {
                  btnA.setBackground(Color.red);
                }
                
                System.out.println(letra);
            }
       
       
       
       
       };
        
        btn0.addKeyListener(listener0);
        btn1.addKeyListener(listener0);
        btn2.addKeyListener(listener0);
        btn3.addKeyListener(listener0);
        btn4.addKeyListener(listener0);
        btn5.addKeyListener(listener0);
        btn6.addKeyListener(listener0);
        btn7.addKeyListener(listener0);
        btn8.addKeyListener(listener0);
        btn9.addKeyListener(listener0);
        btnA.addKeyListener(listener0);
                
        
        
        
       
         KeyListener listener1 = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
             
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int letra=e.getKeyCode();
                
                if(letra == 'A')
                {
                   btnA.setBackground(Color.BLACK);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int letra=e.getKeyCode();
                if(letra == 'A')
                {
                   btnA.setBackground(Color.RED);
                }
            }
         
         
         
         
         
         };
        
        btnA.addKeyListener(listener1);
        
        
    
    }
    
}
