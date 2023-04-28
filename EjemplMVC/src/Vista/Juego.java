package Vista;

import Controlador.Juego_Control;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicBorders;

public class Juego extends JFrame{
    public JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9;
    public Persona persona;
    public Usuarios us;
    public JLabel usj, usj2;

    public Juego(Usuarios obj){
        super("Tricki");
        us = obj;
        
        //Configuracion del JFrame
        setSize(500,500);//Dimensiones de la ventana
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
        
        usj = new JLabel("Usuario 1: " + us.getUsuario());
        usj.setBounds(20, 20, 150, 20);
        usj.setForeground(Color.WHITE);
        usj.setFont(new Font("Verdana", Font.BOLD, 14));
        add(usj);
        
        usj2 = new JLabel("Usuario 2: " + us.getUsuario2());
        usj2.setBounds(20, 50, 150, 20);
        usj2.setForeground(Color.WHITE);
        usj2.setFont(new Font("Verdana", Font.BOLD, 14));
        add(usj2);
        botonesJuego();
        
        }
    
    public void botonesJuego(){
        
        jb1 = new JButton("1");
        jb1.setBounds(100, 100, 90, 90);
        //jb1.setBorderPainted(false);
        jb1.setBorder(new BasicBorders.ButtonBorder(Color.BLUE, Color.darkGray, Color.lightGray, Color.red));
        jb1.setContentAreaFilled(false);
        add(jb1);
        
        jb2 = new JButton("2");
        jb2.setBounds(200, 100, 90, 90);
        //jb2.setBorderPainted(false);
        jb2.setBorder(new BasicBorders.ButtonBorder(Color.yellow, Color.darkGray, Color.lightGray, Color.green));
        jb2.setContentAreaFilled(false);
        add(jb2);
        
        jb3 = new JButton("3");
        jb3.setBounds(300, 100, 90, 90);
        //jb3.setBorderPainted(false);
        jb3.setBorder(new BasicBorders.ButtonBorder(Color.blue, Color.darkGray, Color.lightGray, Color.red));
        jb3.setContentAreaFilled(false);
        add(jb3);
        
        jb4 = new JButton("4");
        jb4.setBounds(100, 200, 90, 90);
        //jb4.setBorderPainted(false);
        jb4.setBorder(new BasicBorders.ButtonBorder(Color.yellow, Color.darkGray, Color.lightGray, Color.green));
        jb4.setContentAreaFilled(false);
        add(jb4);
        
        jb5 = new JButton("5");
        jb5.setBounds(200, 200, 90, 90);
        //jb5.setBorderPainted(false);
        jb5.setBorder(new BasicBorders.ButtonBorder(Color.blue, Color.darkGray, Color.lightGray, Color.red));
        jb5.setContentAreaFilled(false);
        add(jb5);
        
        jb6 = new JButton("6");
        jb6.setBounds(300, 200, 90, 90);
        //jb6.setBorderPainted(false);
        jb6.setBorder(new BasicBorders.ButtonBorder(Color.yellow, Color.darkGray, Color.lightGray, Color.green));
        jb6.setContentAreaFilled(false);
        add(jb6);
        
        jb7 = new JButton("7");
        jb7.setBounds(100, 300, 90, 90);
        //jb7.setBorderPainted(false);
        jb7.setBorder(new BasicBorders.ButtonBorder(Color.blue, Color.darkGray, Color.lightGray, Color.red));
        jb7.setContentAreaFilled(false);
        add(jb7);
        
        jb8 = new JButton("8");
        jb8.setBounds(200, 300, 90, 90);
        //jb8.setBorderPainted(false);
        jb8.setBorder(new BasicBorders.ButtonBorder(Color.yellow, Color.darkGray, Color.lightGray, Color.green));
        jb8.setContentAreaFilled(false);
        add(jb8);
        
        jb9 = new JButton("9");
        jb9.setBounds(300, 300, 90, 90);
        //jb9.setBorderPainted(false);
        jb9.setBorder(new BasicBorders.ButtonBorder(Color.blue, Color.darkGray, Color.lightGray, Color.green));
        jb9.setContentAreaFilled(false);
        //jb9.setBorder(new LineBorder(Color.BLUE));
        add(jb9);
        
        
    }
    
    
}
