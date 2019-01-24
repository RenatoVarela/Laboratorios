/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import java.awt.Color;  
import java.awt.Graphics; 
import javax.swing.JPanel;
/**
 *
 * @author Asus Pc
 */
public class cara  extends JPanel{
      public void paintComponent(Graphics g) { 
         super.paintComponent(g);
        // dibuja la cara 14         
      g.setColor(Color.BLUE);     
      g.fillOval(10, 10, 200, 200);
      // dibuja los ojos 18        
      g.setColor(Color.BLACK);      
      g.fillOval(55, 65, 30, 30);        
      g.fillOval(135, 65, 30, 30);       
     // dibuja la boca 23        
      g.fillOval(50, 110, 120, 60);
     // convierte la boca en una sonrisa 26        
     g.setColor(Color.YELLOW);     
     g.fillRect(50, 110, 120, 30);       
     g.fillOval(50, 120, 120, 40);     
      }   
}
