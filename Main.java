package main;

import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		

		Game game = new Game();
		JFrame jframe = new JFrame("Game");	
		jframe.add(game);
		jframe.setLocationRelativeTo(null);
		jframe.pack();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setVisible(true);
		
		new Thread(game).start();
	}
	
	public void run() {
		
		while(true){
			update();
			render();
			
			try {
				Thread.sleep(1000/60);
			}
			
			catch(InterruptedException e) {
				 e.printStackTrace();
			}
		}
		

	}
	
	private void update() {
		// TODO Auto-generated method stub
		
	}

	private void render() {
		// TODO Auto-generated method stub
		
	}

}

