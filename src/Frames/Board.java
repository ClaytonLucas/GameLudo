package Frames;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;



public class Board extends JComponent {
    @Override
	public void paintComponent(Graphics g) {
		
		/*super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(40, 40, 40, 40);*/
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D rtVerde = new Rectangle2D.Double(0, 0.0, 240.0, 240.0);
		g2d.setPaint(Color.GREEN);
		g2d.fill(rtVerde);
		
		Rectangle2D rtAmarelo = new Rectangle2D.Double(360, 0.0, 240.0, 240.0);
		g2d.setPaint(Color.YELLOW);
		g2d.fill(rtAmarelo);
		
		Rectangle2D rtVermelho = new Rectangle2D.Double(0, 360, 240.0, 240.0);
		g2d.setPaint(Color.RED);
		g2d.fill(rtVermelho);
		
		Rectangle2D rtAzul = new Rectangle2D.Double(360, 360, 240.0, 240.0);
		g2d.setPaint(Color.BLUE);
		g2d.fill(rtAzul);
		
		for(int i = 0; i < 4; i++) {
			
			switch(i) {
			
				//Pinta o caminho verde
				case 0: 
					double rtVerdeInicioX = 40;
					double rtVerdeInicioY = 240;
					Rectangle2D rtVerdeInicio = new Rectangle2D.Double(rtVerdeInicioX, rtVerdeInicioY, 40, 40);
					g2d.setPaint(Color.GREEN);
					g2d.fill(rtVerdeInicio);
					
					for(int j = 0; j < 5; j++) {
						
						g2d.setPaint(Color.GREEN);
						g2d.fill(new Rectangle2D.Double(rtVerdeInicioX + (40*j), rtVerdeInicioY + 40, 40, 40));
					}
					
					break;
				
				//Pinta o caminho amarelo
				case 1: 
					double rtAmareloInicioX = 320;
					double rtAmareloInicioY = 40;
					Rectangle2D rtAmareloInicio = new Rectangle2D.Double(rtAmareloInicioX, rtAmareloInicioY, 40, 40);
					g2d.setPaint(Color.YELLOW);
					g2d.fill(rtAmareloInicio);
					
					for(int j = 0; j < 5; j++) {
					
						g2d.setPaint(Color.YELLOW);
						g2d.fill(new Rectangle2D.Double(rtAmareloInicioX - 40, rtAmareloInicioY + (40*j), 40, 40));
					}
					
					break;
				
				//Pinta o caminho vermelho
				case 2: 
					double rtVermelhoInicioX = 240;
					double rtVermelhoInicioY = 520;
					Rectangle2D rtVermelhoInicio = new Rectangle2D.Double(rtVermelhoInicioX, rtVermelhoInicioY, 40, 40);
					g2d.setPaint(Color.RED);
					g2d.fill(rtVermelhoInicio);
					
					for(int j = 0; j < 5; j++) {
						
						g2d.setPaint(Color.RED);
						g2d.fill(new Rectangle2D.Double(rtVermelhoInicioX + 40, rtVermelhoInicioY - (40*j), 40, 40));
					}
					
					break;
					
				//Pinta o caminho azul
				case 3: 
					double rtAzulInicioX = 520;
					double rtAzulInicioY = 320;
					Rectangle2D rtAzulInicio = new Rectangle2D.Double(rtAzulInicioX, rtAzulInicioY, 40, 40);
					g2d.setPaint(Color.BLUE);
					g2d.fill(rtAzulInicio);
					
					for(int j = 0; j < 5; j++) {
						
						g2d.setPaint(Color.BLUE);
						g2d.fill(new Rectangle2D.Double(rtAzulInicioX - (40*j), rtAzulInicioY - 40, 40, 40));
					}
					
					break;
				
			}
			
		}
		
		Rectangle2D rtCentral = new Rectangle2D.Double(240, 240, 120, 120);
		g2d.setPaint(Color.BLACK);
		g2d.fill(rtCentral);
	}
	
	
	
}
