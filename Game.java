package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;

public final class Game extends Game1 {
	
	public Game(){
		Dimension dimension = new Dimension(WIDTH, HEIGHT);
		setPreferredSize(dimension);
		addMouseListener(this);
		spawner = new Spawner();
	}

	public Game(int contador, int pontuacao, int mx, int my, boolean click, Spawner spawner, boolean gameOver){
		super(contador, pontuacao, mx, my, click, spawner, gameOver);
	}
	
	@Override
	public void update() {
		if(gameOver == false){
			spawner.update();
			if(contador <= 0){
			contador = 100; // game over
			gameOver = true;
			}
		}	
	}

	@Override
	public void run() {
		BufferStrategy bs = getBufferStrategy();
	
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();	
		g.setColor(Color.black);
		g.fillRect(0,0,WIDTH,HEIGHT);
		
		if(gameOver == false){
		
		
		g.setColor(Color.green);
		g.fillRect(Game1.WIDTH/2 - 100 - 20, 20, contador*2, 20);
		g.setColor(Color.white);
		g.drawRect(Game1.WIDTH/2 - 100 - 20, 20, 200, 20);
		
		spawner.render(g);
		}
		else{
			g.setColor(Color.white);
			g.setFont(new Font("Arial",Font.BOLD,30));
			g.drawString("Final Score: "+ Game1.pontuacao,WIDTH/2 - 100, HEIGHT/2 + 40);
			g.drawString("Game Over!",WIDTH/2 - 90, HEIGHT/2 - 40);
			
		}
		bs.show();	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {

	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		click = true;
		mx = e.getX();
		my = e.getY();
	}

}
