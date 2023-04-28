
package Vista;

import Controlador.OtraVentana_Control;
import Controlador.Usuarios_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Usuarios extends JFrame{
    
    public JTextField jtUsuario, jtUsuario2;
    public JButton jbVuelta, jbGuardar;
    public OtraVentana ot;
    public OtraVentana_Control otc;
    

    public Usuarios(OtraVentana obj) {
        super("Usuarios");
        otc = new OtraVentana_Control();
        ot = obj;
        
        //Configuracion del JFrame
        setSize(330,330);//Dimensiones de la ventana
        setLocationRelativeTo(null);//Posiciona la pantalla en el centro
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);//Asignar un diseño libre
        Image icn = new ImageIcon(getClass().getResource(
                "../Imagenes/Cat_Icon.png")).getImage();//Asignacion de imagen al objeto
        setIconImage(icn);
        setVisible(true);
        crearGUI();
    }
    
    public void crearGUI(){
        
        textUsuario();
        textUsuario2();
        devolver();//Boton que devuelve a la ventana OtraVentana
        GuardarJugar();//Boton que pasa a la ventana Juego
        
    }
    
    public void GuardarJugar(){
        
        jbGuardar = new JButton("Jugar");
        jbGuardar.setBounds(115, 250, 100, 30);
        jbGuardar.setFont(new Font("Verdana", Font.BOLD, 16));
        jbGuardar.setForeground(Color.WHITE);
        jbGuardar.setContentAreaFilled(false);
        Usuarios_Control usj = new Usuarios_Control(this);
        jbGuardar.addActionListener(usj);
        /*jbGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getUsuario();
                getUsuario2();
            }
        });*/
        add(jbGuardar);
        
    }
    
    public void devolver(){
        
        ImageIcon img = new ImageIcon(getClass().getResource("../Imagenes/Salir_Icon.png"));
        jbVuelta = new JButton(img);
        jbVuelta.setBounds(20, 250, 30, 30);
        //jbVuelta.setContentAreaFilled(false);
        jbVuelta.setBackground(Color.red);
        //jbVuelta.setBorderPainted(false);
        Usuarios_Control usc = new Usuarios_Control(this);
        jbVuelta.addActionListener(usc);
        add(jbVuelta);
        
    }
    
    public void textUsuario(){
        
        //Etiqueta para que nombra el JTextField, jtUsuario
        JLabel jlUsuario = new JLabel("Usuario 1:");
        jlUsuario.setBounds(20, 30,130,30);
        jlUsuario.setFont(new Font("Verdana", Font.BOLD, 20));
        jlUsuario.setForeground(Color.WHITE);
        add(jlUsuario);
        
        jtUsuario = new JTextField();
        jtUsuario.setBounds(150, 30, 130, 30);
        add(jtUsuario);
        
    }
    
    public void textUsuario2(){
        
        JLabel jlUsuario2 = new JLabel("Usuario 2:");
        jlUsuario2.setBounds(20, 70, 170, 30);
        jlUsuario2.setFont(new Font("Verdana", Font.BOLD, 20));
        jlUsuario2.setForeground(Color.WHITE);
        add(jlUsuario2);
        
        jtUsuario2 = new JTextField();
        jtUsuario2.setBounds(150, 70, 130, 30);
        add(jtUsuario2);
        
    }
    
    
    public String getUsuario(){
        return jtUsuario.getText();
    }
    public String getUsuario2(){
        return jtUsuario2.getText();
    }
    

    
}
