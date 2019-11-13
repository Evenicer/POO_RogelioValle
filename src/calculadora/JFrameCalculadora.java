/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {
        double numero1;
        double numero2;
        String operador;
    public JFrameCalculadora() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        
      
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonC btnC = new JButtonC("C", dim, Color.BLACK);
        JButtonC btnCE = new JButtonC("CE", dim, Color.BLACK);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.BLACK);
        JButtonC btnMulti = new JButtonC("X", dim, Color.GRAY);
        JButtonC btn7 = new JButtonC("7", dim, Color.WHITE);
        JButtonC btn8 = new JButtonC("8", dim,Color.WHITE);
        JButtonC btn9 = new JButtonC("9", dim, Color.WHITE);
        JButtonC btnDiv = new JButtonC("/", dim, Color.GRAY);
        JButtonC btn4 = new JButtonC("4", dim, Color.WHITE);
        JButtonC btn5 = new JButtonC("5", dim, Color.WHITE);
        JButtonC btn6 = new JButtonC("6", dim, Color.WHITE);
        JButtonC btnMenos = new JButtonC("-", dim, Color.GRAY);
        JButtonC btn1 = new JButtonC("1", dim, Color.WHITE);
        JButtonC btn2 = new JButtonC("2", dim, Color.WHITE);
        JButtonC btn3 = new JButtonC("3", dim, Color.WHITE);
        JButtonC btnPlus = new JButtonC("+", dim, Color.GRAY);
        JButtonC btnCero = new JButtonC("0", dim, Color.WHITE);
        JButtonC btnPunto = new JButtonC(".", dim, Color.BLACK);
        JButtonC btnIgual = new JButtonC("=", dim, Color.GRAY);
        JButtonC btnAcerca = new JButtonC("?", dim, Color.BLACK);
       
       
        
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btnCero);
        panelCentral.add(btnPunto);
        panelCentral.add(btnIgual);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(),auxF.getStyle(),50);
        display.setFont(nueva);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
            
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Action Listener Para los botones
        
        //Action Listeners para el boton signo
        ActionListener Listenersig = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double numero;
                String cadena;
                
                cadena = display.getText();
                if(cadena.length()>0)
                {
                  numero = (-1) * Double.parseDouble(cadena);
                  display.setText(sincero(numero).toString());
                }
            }
        };
        
          btnMM.addActionListener(Listenersig);
        //Fin boton sigo
        
        
        //Action Listeners para el boton 0
        ActionListener Listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        };
        
          btnCero.addActionListener(Listener);
        //Fin boton 0
        
        //Action Listeners para el boton 1
        ActionListener Listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        };
        
          btn1.addActionListener(Listener1);
        //Fin boton 1
        
        
        //Action Listeners para el boton 2
        ActionListener Listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        };
        
          btn2.addActionListener(Listener2);
        //Fin boton 0
        
        //Action Listeners para el boton 3
        
        ActionListener Listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        };
        
          btn3.addActionListener(Listener3);
        //Fin boton 3
  //Action Listeners para el boton 4
        ActionListener Listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        };
        
          btn4.addActionListener(Listener4);
        //Fin boton 4
        //Action Listeners para el boton 0
        ActionListener Listener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        };
        
          btn5.addActionListener(Listener5);
        //Fin boton 0
        //Action Listeners para el boton 0
        ActionListener Listener6 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        };
        
          btn6.addActionListener(Listener6);
        //Fin boton 6
        //Action Listeners para el boton 7
        ActionListener Listener7 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        };
        
          btn7.addActionListener(Listener7);
        //Fin boton 7
        //Action Listeners para el boton 8
        ActionListener Listener8 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        };
        
          btn8.addActionListener(Listener8);
        //Fin boton 0
        //Action Listeners para el boton 9
        ActionListener Listener9 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        };
        
          btn9.addActionListener(Listener9);
        //Fin boton 0
        //Action Listeners para el boton C
        ActionListener ListenerC = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        };
        
          btnC.addActionListener(ListenerC);
        //Fin boton C
        
        
        //Action Listeners para el boton CE
        ActionListener ListenerCE = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena;
                
                cadena = display.getText();
                
                if(cadena.length()>0)
                {
                  cadena = cadena.substring(0, cadena.length()-1);
                  display.setText(cadena);
                }
            }
        };
        
          btnCE.addActionListener(ListenerCE);
        //Fin boton CE
        
        
        
        //Action Listeners para el boton +
        ActionListener ListenerPlus = new ActionListener() {
  
            @Override
            public void actionPerformed(ActionEvent e) {
               numero1=Double.parseDouble(display.getText());
                operador="+";
                display.setText("");
            }
        };
        
          btnPlus.addActionListener(ListenerPlus);
        //Fin boton +
        
         //Action Listeners para el boton -
        ActionListener ListenerMenos = new ActionListener() {
  
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1=Double.parseDouble(display.getText());
                operador="-";
                display.setText("");
            }
        };
        
          btnMenos.addActionListener(ListenerMenos);
        //Fin boton -
        
        //Action Listeners para el boton x
        ActionListener ListenerMulti = new ActionListener() {
  
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1=Double.parseDouble(display.getText());
                operador="X";
                display.setText("");
            }
        };
        
          btnMulti.addActionListener(ListenerMulti);
        //Fin boton x
        //Action Listeners para el boton /
        ActionListener ListenerDiv = new ActionListener() {
  
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1=Double.parseDouble(display.getText());
                operador="/";
                display.setText("");
            }
        };
        
          btnDiv.addActionListener(ListenerDiv);
        //Fin boton /
        
        
        
        
         //Action Listeners para el boton =
        ActionListener ListenerIgual = new ActionListener() {
      
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2=Double.parseDouble(display.getText());
                
                switch(operador){
                
                    case "+" : display.setText(sincero(numero1+numero2));break;
                    case "-" : display.setText(sincero(numero1-numero2));break;
                    case "X" : display.setText(sincero(numero1*numero2));break;
                    case "/" : 
                        if(numero2 == 0){
                          display.setText("No se puede crack!");
                        }
                        else
                        display.setText(sincero(numero1/numero2)); break;
                
                }
            }
        };
       
          btnIgual.addActionListener(ListenerIgual);
        //Fin boton =
        
        
        
        //Action Listeners para el boton /
        ActionListener ListenerPunto = new ActionListener() {
  
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(display.getText().contains("."))){
                    display.setText(display.getText()+".");
                
                }
            }
        };
        
          btnPunto.addActionListener(ListenerPunto);
        //Fin boton /
        
        
    
    }
    
    public String sincero(double resultado){
        String retorno = "";
        retorno=Double.toString(resultado);
        if(resultado%1==0)
        {
         retorno = retorno.substring(0, retorno.length()-2);
        }
        
        return retorno;
        }
    
}
