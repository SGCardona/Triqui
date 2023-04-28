
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controlador.OtraVentana_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class OtraVentana extends JFrame{
    public JButton jbVolver, jbUsuario, jbUsuario2;
    public MenuPrincipal mp;
    public OtraVentana_Control otc;
    
    
    public OtraVentana(MenuPrincipal obj){
        super("Modos");
        mp = obj;
        
        //Configuracion del JFrame
        //super("Dragon Ball ");//Creacion del JFrame
        setSize(400,400);//Dimensiones de la ventana
        //setLocation(100,30);//Posicion de la pantalla en donde aparece la ventana
        setLocationRelativeTo(null);//Posiciona la pantalla en el centro
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);//Asignar un diseño libre
        setVisible(true);
        Image icn = new ImageIcon(getClass().getResource(
                "../Imagenes/Cat_Icon.png")).getImage();//Asignacion de imagen al objeto
        setIconImage(icn);
        crearGUI();
    }
     public void crearGUI(){
         OtraVentana_Control ovc = new OtraVentana_Control(this);
         
         //Boton que devuelve a la venta Menu Principal
         jbVolver = new JButton("Volver");
         jbVolver.setBounds(50, 300, 300, 30);
         jbVolver.setContentAreaFilled(false);
         jbVolver.setForeground(Color.WHITE);
         jbVolver.setFont(new Font("Verdana", Font.BOLD, 20));
         jbVolver.addActionListener(ovc);
         add(jbVolver);
         
         //Boton que pasa a la ventana Usuarios
         jbUsuario = new JButton("1 vs 1");
         jbUsuario.setBounds(100, 70, 200, 30);
         jbUsuario.addActionListener(ovc);
         jbUsuario.setContentAreaFilled(false);
         jbUsuario.setForeground(Color.WHITE);
         jbUsuario.setFont(new Font("Verdana", Font.BOLD, 20));
         jbUsuario.setHorizontalAlignment(JButton.CENTER);
         add(jbUsuario);
         
         //Boton que pasa a la ventana Usuarios
         jbUsuario2 = new JButton("1 vs C");
         jbUsuario2.setBounds(100, 110, 200, 30);
         jbUsuario2.addActionListener(ovc);
         jbUsuario2.setContentAreaFilled(false);
         jbUsuario2.setForeground(Color.WHITE);
         jbUsuario2.setFont(new Font("Verdana", Font.BOLD, 20));
         jbUsuario2.setHorizontalAlignment(JButton.CENTER);
         add(jbUsuario2);
         
         //Etiqueta de titulo principal
         JLabel jlModo = new JLabel("Modos");
         jlModo.setBounds(100, 30, 200, 30);
         jlModo.setFont(new Font("Verdana", Font.BOLD, 20));
         jlModo.setForeground(Color.red);
         jlModo.setHorizontalAlignment(JLabel.CENTER);
         add(jlModo);
         
     }
}
