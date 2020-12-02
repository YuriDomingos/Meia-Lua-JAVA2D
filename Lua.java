/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luatarefacg;

/**
 *
 * @author yuri
 */
public class Lua {
    
    
    private int posX;
    private int posY;
    private int width;
    private int height;

    public Lua(int posX, int posY, int width, int height) {
        
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }

    
    
    
    
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
    
    
    
    
}
