
package Controlador;

import Vista.OtraVentana;
import Vista.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OtraVentana_Control implements ActionListener{
    
    public OtraVentana ov;
    public boolean actividad;

    public OtraVentana_Control() {
        actividad = false;
    }

    public OtraVentana_Control(OtraVentana obj) {
        ov = obj;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource().equals(ov.jbVolver)){
             ov.setVisible(false);
             ov.dispose();
             ov.mp.setVisible(false);
         }
         if(e.getSource().equals(ov.jbUsuario)){
            //System.out.println("Clic");
            Usuarios us = new Usuarios(ov);
            actividad = true;
            ov.setVisible(false);//Oculta OtraVentana
        }
         if(e.getSource().equals(ov.jbUsuario2)){
            //System.out.println("Clic");
            Usuarios us = new Usuarios(ov);
            ov.setVisible(false);//Oculta OtraVentana
        }
    }

    public boolean getActividad() {
        return actividad;
    }

    public void setActividad(boolean actividad) {
        this.actividad = actividad;
    }
    
}
