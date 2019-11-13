import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MarcoEleccion extends JFrame{

public MarcoEleccion(){

    setTitle("Eleccion");
    setBounds(500,500,400,400);

    LaminaEleccion milamina=new LaminaEleccion();
    add(milamina);

    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

}

}

class LaminaEleccion extends JPanel{

public LaminaEleccion(){

    texto1=new JLabel("Selecciona una opcion");
    add(texto1);

    boton1 = new JButton("Entrada");
    boton2 = new JButton("Salida");
    boton3 = new JButton("Cerrar");
    add(boton1);
    add(boton2);
    add(boton3);
    boton1.addActionListener(evento1);
    boton2.addActionListener(evento1);
    boton3.addActionListener(evento1);

}

class EventoEleccion implements ActionListener{
    
    public void actionPerformed(ActionEvent e) {

       JButton source = (JButton)e.getSource(); //Tomas la fuente del evento

            if (boton1 == source  ){
                 //Si la fuente es igual al botón 1 -> Acción 
                System.out.println("Entrada");      
            }else if (boton2 == source ){
                //Si la fuente es igual al botón 1 -> Acción
                System.out.println("Salida");     
            }else if (boton3 == source ){
                //Si la fuente es igual al botón 1 -> Acción
            }

        }

}

private JButton boton1;
private JButton boton2;
private JButton boton3;
private JLabel texto1;
private EventoEleccion evento1=new EventoEleccion();

}