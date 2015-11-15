package Pentomino;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;

import javax.swing.*;

import Pentomino.Interfaces.Control;
import Pentomino.Interfaces.Display;
import Pentomino.Interfaces.TetrisGame;

public class PentominoMain extends Canvas implements Runnable,Display{
	
	protected static final int WIDTH=400, HEIGHT=565;
	protected TetrisGame game;
	private Controller controller;
	private Board board;
	
	
	public static void main(String[] args){
		final PentominoMain pm = new PentominoMain();
		
		final JFrame frame = new JFrame("Pentomino");
		
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		KeyGetter.loadKeys();
		try {
			Configuration.loadConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JMenuBar bar = new JMenuBar();
		bar.setBounds(0, 0, WIDTH, 25);
		
		JMenu file = new JMenu("File");
		file.setBounds(0,0,45,24);
		
		JMenuItem newGame = new JMenuItem("New Game");
		
		newGame.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				startNewGame(pm);
				System.out.println("Starting New Game...");
			}
		});
		
		JMenuItem highScore = new JMenuItem("High Score");
		highScore.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int highscore = 0; // replace this with getHighscoreMethod later
				
				//@
				final JFrame alert = new JFrame("High Score");
				alert.setSize(500, 400);
				alert.setLayout(null);
				alert.setLocationRelativeTo(null);
				alert.setAlwaysOnTop(true);
				
				JLabel score = new JLabel("The high score is: " + highscore);
				score.setBounds(0, 0, 300, 100);
				
				JButton okayButton = new JButton("Okay");
				okayButton.setBounds(50, 120, 100, 30);
				okayButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						alert.dispose();
					}
				});
				
				alert.add(score);
				alert.add(okayButton);
				alert.setResizable(false);
				alert.setVisible(true);
			}			
		});
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Closing...");
				System.exit(0);
			}
		});
		
		JMenuItem options = new JMenuItem("Options");
		options.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Configuration.openConfig(frame);
			}
		});
		
		
		pm.setBounds(0, 25, WIDTH, HEIGHT-25);
		
		frame.add(pm);
		bar.add(file);
		file.add(newGame);
		file.add(highScore);
		file.add(options);
		file.add(exit);
		frame.add(bar);
		frame.setVisible(true);
		pm.start();
		
		
	}
	
	/**This methods is executed after the users klings on start a new game
	 * @param pm 
	 * 
	 */
	protected static void startNewGame(PentominoMain pm) {
		pm.game = new Game((Control)pm.controller, (Display)pm, null);
		pm.game.start();
	}

	public void start() {
		Thread t = new Thread(this);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}

	public void run(){
		boolean running = true;
		initialize();
		while( running ){
			update();
			BufferStrategy buf = getBufferStrategy();
			if (buf == null){
				createBufferStrategy(3);
				continue;
			}
			Graphics2D g = (Graphics2D) buf.getDrawGraphics();
			render(g);
			buf.show();
		}
	}
	
	public void update(){
		
	}
	
	public void initialize(){
		controller = new Controller();
		this.addKeyListener(controller);
		requestFocus();
		
	}
	
	public void render(Graphics2D g){
		if (board==null){
		g.setColor(Color.MAGENTA);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Calibri", Font.PLAIN, 20));
		g.drawString("Pentomino", 140, 50);
		}
		drawBoard(g,WIDTH,HEIGHT,board);
	}

	private void drawBoard(Graphics2D g, int width2, int height2, Board board2) {
		if (board2==null)return;
		Square[][] s = board2.getFullBoard();
		
		int sW = s.length;
		int sH = s[0].length;
		int squareHeight = width2/sW; 
		int squareWidth = height2/sH;
		
		for (int i = 0; i<sW;i++){
			for (int j = 0; j <sH;j++){
				g.setColor(s[i][j].getC());
				g.fillRect(squareWidth*i, squareWidth*j, squareWidth, squareHeight);
				g.setColor(Color.BLACK);
				g.fillRect(squareWidth*i, squareWidth*j, squareWidth, squareHeight);				
			}
		}
	}

	public void setData(Board b) {
		this.board = b;
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	

}
