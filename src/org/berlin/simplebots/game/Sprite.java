package org.berlin.simplebots.game;

import java.awt.Color;
import java.awt.Graphics;

import org.berlin.simplebots.game.geom.SpriteRect;

public class Sprite {

	public static final int DEFAULT_SIZE = 40;
	
    private int x, y;
    private int width=DEFAULT_SIZE, height=DEFAULT_SIZE;
    private int size = width;
    
    public Sprite(final int x, final int y) {
    	this.x = x;
    	this.y = y;
    }	
    
    public void render(final Graphics g) {    
    	 {
    		 final SpriteRect rect = new SpriteRect(this.x, this.y, this.size);
    		 final int rectParms [] = rect.calculate().getRenderParameters();
             g.setColor(Color.green);                        
             g.fillRect(rectParms[0], rectParms[1], rectParms[2], rectParms[3]);
         }
    	
    }
}
