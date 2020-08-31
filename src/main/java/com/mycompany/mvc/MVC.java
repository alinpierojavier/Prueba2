
package com.mycompany.mvc;

import Controller.Controlador;
import model.Modelo;
import view.Vista;

public class MVC {
    
    public static void main(String args[]){
        //Aquí llamamos
        Modelo mod = new Modelo();
        Vista view = new Vista ();
        
        Controlador control = new Controlador(view, mod);
        control.iniciar();
        view.setVisible(true);       
    }
    
}
