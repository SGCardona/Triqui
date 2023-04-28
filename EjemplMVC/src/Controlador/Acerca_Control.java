
package Controlador;

import Vista.Acerca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Acerca_Control implements ActionListener{
    Acerca ac;

    public Acerca_Control(Acerca obj) {
        ac = obj;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ac.jbCerrar)){
            ac.setVisible(false);
            ac.dispose();
            
        }
    }
    
    
}
