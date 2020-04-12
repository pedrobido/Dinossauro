package userinterface;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	public static final int SCREEN_WIDTH = 600;
	private GameScreen gameScreen;

	public GameWindow() {
		super("Dinossauro - Java");
		setSize(SCREEN_WIDTH, 175);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		gameScreen = new GameScreen();
		addKeyListener(gameScreen);
		add(gameScreen);
	}

	public void startGame() {
		setVisible(true);
		gameScreen.startGame();
	}

	public static void main(String args[]) {
		(new GameWindow()).startGame();
	}
}
