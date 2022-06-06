package shashwat;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		
		JFrame jFrame = new JFrame();

		GamePlay gamePlay = new GamePlay();
//		jFrame.setSize(1650,1080);
		jFrame.setBounds(10, 10, 700, 600);
		jFrame.setTitle("Brick Breaker");
		jFrame.setResizable(true);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jFrame.add(gamePlay);
		
	}

}
