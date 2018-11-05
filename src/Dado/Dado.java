package Dado;

import java.util.Random;
import javax.imageio.*;
//import java.awt.*;
import java.io.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.*;
//import java.awt.Toolkit;
import java.awt.image.BufferedImage;
public class Dado extends JComponent{

	private int val;
	
	public Dado() {
		
		Random rand = new Random();
		
		val = rand.nextInt(6) + 1;
                
	}
	
	public int getVal() {
		
		return val;
}
	public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2 = (Graphics2D) g;
            
            BufferedImage i = null;
		
		//aqui se faz a captura da imagem
		try {
			switch(val) {
				case 1:
					i = ImageIO.read(new File("Dado1.png"));
					g2.drawImage(i, 10, 10, this);
                                        //g2.finalize();
					break;
				case 2:
					i = ImageIO.read(new File("Dado2.png"));
                                        g2.drawImage(i, 10, 10, this);
                                        //g2.finalize();
					break;
				case 3:
					i = ImageIO.read(new File("Dado3.png"));
                                        g2.drawImage(i, 10, 10, this);
                                        //g2.finalize();
					break;
				case 4:
					i = ImageIO.read(new File("Dado4.png"));
                                        g2.drawImage(i, 10, 10, this);
                                        //g2.finalize();
					break;
				case 5:
					i = ImageIO.read(new File("Dado5.png"));
					g2.drawImage(i, 10, 10, this);
                                        //g2.finalize();
                                        break;
				case 6:
					i = ImageIO.read(new File("Dado6.png"));
                                        g2.drawImage(i, 10, 10, this);
                                        break;
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
	}
	
		
	
}

