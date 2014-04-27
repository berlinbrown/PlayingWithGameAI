package org.berlin.simplebots.game.geom;


public class SpriteRect {

	private final int X = 0;
	private final int Y = 1;
	
	private int x, y, size;
	
	private final int upperLeft  [] = new int [] { 0, 0 };
	private final int upperRight [] = new int [] { 0, 0 };
	private final int lowerLeft  [] = new int [] { 0, 0 };
	private final int lowerRight [] = new int [] { 0, 0 };
	
	private int halfSize = 0;
	
	public SpriteRect(final int x, final int y, final int sz) {
		this.x = x;
		this.y = y;
		this.size = sz;
		calculate();
	}
	
	public SpriteRect calculate() {
		halfSize = this.size / 2;
		upperLeft[X] = this.x - halfSize;
		upperLeft[Y] = this.y - halfSize;
		
		upperRight[X] = this.x + halfSize;
		upperRight[Y] = this.y - halfSize;
		
		lowerLeft[X] = this.x - halfSize;
		lowerLeft[Y] = this.y + halfSize;
		
		lowerRight[X] = this.x + halfSize;
		lowerRight[Y] = this.y + halfSize;
		return this;
	}
	
	public int [] getRenderParameters() {
		final int fillRectParms [] = new int [] { 0, 0, 0, 0 };
		
		fillRectParms[0] = upperLeft[X];
		fillRectParms[1] = upperLeft[Y];
		
		fillRectParms[2] = size;
		fillRectParms[3] = size;
		return fillRectParms; 
	}
		
}
