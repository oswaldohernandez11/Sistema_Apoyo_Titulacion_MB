/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;


/**
 *
 * @author Jhon Nash
 */
public class Sat {
  static VentanaPrincipal vp;
    public static void main(String[] args) {
        vp= new VentanaPrincipal();
        vp.setVisible(true);
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setResizable(false);
    }
    
}
