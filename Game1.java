package main;

import java.awt.Canvas;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Game1 extends Canvas implements Runnable, MouseListener{ 
	
	public static final int WIDTH = 640, HEIGHT = 480; 
	
	public static int contador = 100;
	
	public static int pontuacao = 0;
	
	public static int mx, my;
	
	public static boolean click = false;
	
	
	public Game1() {
		
	}
	
	public Game1(int contador, int pontuacao, int mx, int my, boolean click, Spawner spawner, boolean gameOver) {
		
	}

	public Spawner spawner;
	
	public boolean gameOver = false;
	
	
	public void update() {}
	
	public void render() {}
	
	
	public void mouseReleased(MouseEvent e) {}
	
}
		
		
	
