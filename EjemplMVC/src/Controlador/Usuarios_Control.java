package Controlador;

import Modelo.Usuarios_Modelo;
import Vista.Juego;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Usuarios_Control implements ActionListener{
    public Usuarios us;

    public Usuarios_Control(Usuarios obj) {
        us = obj;
    }
    
    public void actionPerformed(ActionEvent e) {
         if(e.getSource().equals(us.jbVuelta)){
             us.setVisible(false);
             us.dispose();
             us.ot.setVisible(true);
         }
         
        /*if(e.getSource().equals(us.jbGuardar)){
            //System.out.println("Clic");
            Juego usj = new Juego(us);
            us.setVisible(false);//Oculta OtraVentana
        }*/
        if(e.getSource().equals(us.jbGuardar)){
            Usuarios_Modelo om = new Usuarios_Modelo(us);
            Juego usj = new Juego(us);
            om.guardar();
        }
    }
    
    
  
    
    
}
