package Modelo;

import Vista.Persona;
import Vista.Usuarios;

public class Usuarios_Modelo {
    Usuarios us;

    public Usuarios_Modelo(Usuarios obj) {
        us = obj;
    }
    
    public void guardar(){
        String usu = us.jtUsuario.getText();
        Persona persona = new Persona(usu);
        //us.mp.arreglo.add(persona);
        us.ot.mp.arreglo.add(persona);
        
        for (int i = 0; i < us.ot.mp.arreglo.size(); i++) {
            Persona get = us.ot.mp.arreglo.get(i);
            System.out.println(get);
            
        }
    }
    
    
}
