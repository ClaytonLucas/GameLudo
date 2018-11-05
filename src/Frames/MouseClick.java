package Frames;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClick extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println(e.getX()+", "+ e.getY());
        int x = e.getX(), y = e.getY();
        if(x <= 240 && y <= 240){
            System.out.println("Voce clicou no verde");
        } else if(x >=360 && x <= 600 && y >= 0 && y <=240){
            System.out.println("Voce clicou no amarelo");
        } else if(x >= 0 && x <= 240 && y >= 360 && y <= 600){
            System.out.println("Voce clicou no vermelho");
        } else if(x >= 360 && x <= 600 && y >= 360 && y <= 600){
            System.out.println("Voce clicou no azul");
        }
       
            
            
        
    }
}