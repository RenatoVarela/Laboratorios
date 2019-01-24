/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import javax.swing.JFrame; 
/**
 *
 * @author Asus Pc
 */
public class Graficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             cara panel = new cara();        
             JFrame aplicacion = new JFrame();    
             aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
             aplicacion.add(panel);       
             aplicacion.setSize(230, 250);  
             aplicacion.setVisible(true);
     
             
    }
    
}
