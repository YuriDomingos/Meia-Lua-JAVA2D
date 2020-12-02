/*---çççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççççç
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luatarefacg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author : Yuri Domingos (UCAN : Universidade Católica de Angola )
 * Data    : 30 -11 - 2020
 * Objectivo : Realizar a tarefa de CG (fazer meia lua )
 * 
 * SM ; PO - : Criar duas áreas e subtrair uma na outra 
 */
public class Cenario extends JPanel  {
    
    
 
    protected Graphics2D graphics2D;
    protected Area General_area = null;  
    protected Area Temporary    = null;
    private Lua lua = new Lua(10,10,10,10);
    
    
    
    
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        graphics2D = (Graphics2D) g.create();
        
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       
          // desenho da primeira área
        Shape area1 = new Ellipse2D.Double(lua.getPosX()+100,lua.getPosY()+100,lua.getWidth()+160,lua.getHeight()+160); 
        
      
        
        // graphics2D.fill(area1);
        
        // desenho segunda área
        Shape area2 = new Ellipse2D.Double(lua.getPosX()+50,lua.getPosY()+100,lua.getWidth()+160,lua.getHeight()+160);
        
        //\ Adicionei a área 1 na nossa área principal 
        General_area  = new Area(area1);
        
        
        // Nossa área que vamos subtrair   
        Temporary = new Area(area2);
        
        
        
        // subtraimos
        General_area.subtract(Temporary);
        
        
        // desenhamos a nossa área principal
        
        graphics2D.fill(General_area);
         
         graphics2D.dispose();
        
    }
    
}
