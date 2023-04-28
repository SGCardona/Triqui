
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import Controlador.MenuPricipal_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class MenuPrincipal extends JFrame{
    
    public JButton jbOtra, jbAcerca;
    public JLabel jlIma;
    public ArrayList<Persona> arreglo = new ArrayList<>();

    public MenuPrincipal(){
        super("Tres en Raya");
        
        //Configuracion del JFrame
        setSize(600,600);//Dimensiones de la ventana
        setLocationRelativeTo(null);//Posiciona la pantalla en el centro
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        //setResizable(false);
        Image icn = new ImageIcon(getClass().getResource(
                "../Imagenes/Cat_Icon.png")).getImage();//Asignacion de imagen al objeto
        setIconImage(icn);
        setLayout(null);//Asignar un diseño libre
        setVisible(true);
        crearGUI();
    }
    
    public void crearGUI(){
        MenuPricipal_Control mpc = new MenuPricipal_Control(this);
        imagenes();
        
        jbOtra = new JButton("Jugar");
        jbOtra.setBounds(200, 350, 200, 40);
        jbOtra.setFont(new Font("Verdana", Font.BOLD,20));
        jbOtra.setForeground(Color.WHITE);
        jbOtra.setContentAreaFilled(false);
        jbOtra.addActionListener(mpc);
        add(jbOtra);
        
        jbAcerca = new JButton("Acerca De...");
        jbAcerca.setBounds(200, 400, 200, 40);
        jbAcerca.setFont(new Font("Verdana", Font.BOLD, 20));
        jbAcerca.setForeground(Color.WHITE);
        jbAcerca.setContentAreaFilled(false);
        jbAcerca.addActionListener(mpc);
        add(jbAcerca);
    }
    
    public void imagenes(){
        ImageIcon ima = new ImageIcon(getClass().getResource("../Imagenes/TresEnRaya.png"));
        jlIma = new JLabel(ima);//Asignacion de la imagen al objeto JlIma
        jlIma.setBounds(100, 50, 400, 272);
        //jlIma.setBorder(new LineBorder(Color.BLUE, 10, true));//Da un borde a la Etiqueta
        //jlIma.setToolTipText("Kame kame haaaaa!!!!");//Metodo que al poner el mouse sobre da la imagen muestra un texto
        add(jlIma);
    }
    
    public static void main(String[] args) {
        MenuPrincipal mp = new MenuPrincipal();
        
    }
}
