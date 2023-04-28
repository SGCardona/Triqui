
package Controlador;

import Vista.Acerca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.MenuPrincipal;
import Vista.OtraVentana;


public class MenuPricipal_Control implements ActionListener{

    MenuPrincipal mp;
    
    public MenuPricipal_Control(MenuPrincipal obj) {
        mp = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(mp.jbOtra)){
            //System.out.println("Clic");
            OtraVentana ov = new OtraVentana(mp);
            mp.setVisible(false);//Ocultar menu pricipal
        }
        
        if(e.getSource().equals(mp.jbAcerca)){
            //System.out.println("Clic en JbAcerca");
            Acerca ac = new Acerca(mp);
        }
    }
    
}
