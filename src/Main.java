
//import Dado.*;
import Frames.*;

public class Main {

	public static void main(String[] args) {
		GameFrame main = new GameFrame();
		Board board = new Board();
		Botao b1 = new Botao();
		
		main.add(b1);
		main.add(board);
		main.addMouseListener(new MouseClick());
                main.setVisible(true);
		
		
	}
}