
package Vista;

import Controlador.Acerca_Control;
import javax.swing.JButton;
import javax.swing.JDialog;


public class Acerca extends JDialog{
    
    public JButton jbCerrar;
    public MenuPrincipal mp;

    public Acerca(MenuPrincipal obj) {
        
        super(obj, "Acerca de...", true);
        mp = obj;
        
        setSize(400, 500);
        setLocationRelativeTo(mp);
        setLayout(null);
        crearGUI();
        setVisible(true);
    }
    
    public void crearGUI(){
        
        Acerca_Control control = new Acerca_Control(this);
        
        jbCerrar = new JButton("Cerrar");
        jbCerrar.setBounds(150, 400, 150, 30);
        jbCerrar.addActionListener(control);
        add(jbCerrar);
        
    }
    
    
    
    
}
