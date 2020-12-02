/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luatarefacg;

import javax.swing.JFrame;

/**
 *
 * @author :  Yuri Domingos
 * Data    : 20 - 11 - 2020
 * çObjectivo : Criar uma lua básica
 */
public class LuaTarefaCG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        JFrame frame = new JFrame ("Tarefa da lua ");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Cenario());
        frame.show();
    }
    
}








