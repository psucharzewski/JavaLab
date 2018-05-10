package labki3_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
/*
public class DisplayComponent extends JPanel 
{
	ArrayList<Square> squares;
	boolean runSquares = true;
	
	public DisplayComponent() 
	{
		squares = new ArrayList<>(20);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(Square s : squares)
		{
			s.drawFigure(g, 0, 0);
		}	
	}
	
	public class StartAction extends AbstractAction
	{
		Random generator;
		
		StartAction()
		{
			generator = new Random();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			Square squ = new Square(generator.nextInt(getWidth() - 20));
			squares.add(squ);
			Runnable r = () -> {
								try
								{
									int speed = generator.nextInt(5) + 1;
									while(true)
									{		
										if(runSquares)
										{
											speed = squ.move(getWidth(), getHeight() , speed);
											repaint();
											Thread.sleep(5);
										}
										Thread.sleep(0);
									}
								}
								catch(InterruptedException exp)
								{
								}
							};
			Thread t = new Thread(r);
			t.start();
			
			
			repaint();
		}
	}
	
	public class StopAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			runSquares = false;
		}
	}
	
	public class ResumeAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			runSquares = true;
		}
	}
	
	public StartAction initiateStartAction()
	{
		return new StartAction();
	}
	
	public StopAction initiateStopAction()
	{
		return new StopAction();
	}
	
	public ResumeAction initiateResumeAction()
	{
		return new ResumeAction();
	}
}
*/