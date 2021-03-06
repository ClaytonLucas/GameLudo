package Board;

import java.awt.Color;

public class Casas {
	
	private boolean isOccupied;
	private int xPos;
	private int yPos;
	private Color cor;
	
	public Casas(int d, int e) {
		
		this.xPos = d * 40;
		this.yPos = e * 40;
		this.isOccupied = false;
	}
	
	public int getX() {
		
		return this.xPos;
	}
	
	public int getY() {
		
		return this.yPos;
	}
	
	public void setColor(Color c) {
		
		this.cor = c;
	}
	
	public Color getColor() {
		
		return this.cor;
	}
	
	public void setIsOccupied() {
		
		this.isOccupied = !this.isOccupied;
	}
	public boolean getIsOccupied() {
		
		return this.isOccupied;
	}

}
