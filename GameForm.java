package tetris;
import javax.swing.JFrame;

public class GameForm extends JFrame{
	public GameForm(){
		setSize(600, 500);
	}

	public static void main(String[] args){
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new GameForm().setVisible(true);
			}
		});
	}

}
