package Handlers;

import Control.Control;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class ActionHandler implements ActionListener{
	
	Control c;
	public int diceRollValue = 0;
	public boolean diceWasRolled = false;
	
	public ActionHandler(Control control) {
		
		this.c = control;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Handles diceRoll click
		if(e.getSource() == Control.diceRoll) {
			
			if(!diceWasRolled) {
				Random rand = new Random();
				diceRollValue = rand.nextInt(6) + 1;
				Control.diceRollLabel.setText("Voc� jogou: " + diceRollValue);
				diceWasRolled = true;
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Voc� j� jogou o dado. Fa�a uma jogada!");
			}
		}
	}
}