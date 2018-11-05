package Frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botao extends JPanel implements ActionListener{
	
	JButton b1 = new JButton("Rolar");
	//ButtonHandler handler;
        
	public Botao() {
		//handler=new ButtonHandler(b1);
		setLayout(null);
		b1.setBounds(700, 400, 100, 40);
                //b1.addActionListener(handler);
		add(b1);
		
	}
        
        
        public void actionPerformed(ActionEvent evento) {
            
        }

}
