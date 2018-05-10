package Labki9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JPanel;


public class SquareComponent extends JPanel
{
	JPanel buttonPanel;
	DisplayComponent display;
	
	public SquareComponent() 
	{
		setLayout(new BorderLayout());
		display = new DisplayComponent();
		display.setBackground(Color.BLUE);
		
		buttonPanel = new JPanel();
		JButton buttonStop = new JButton("Zatrzymaj");
		buttonStop.addActionListener(display.initiateStopAction());
		JButton buttonStart = new JButton("Uruchom");
		buttonStart.addActionListener(display.initiateStartAction());
		JButton buttonResume = new JButton("Wznow");
		buttonResume.addActionListener(display.initiateResumeAction());
		
		buttonPanel.add(buttonStop);
		buttonPanel.add(buttonStart);
		buttonPanel.add(buttonResume);
		
		add(display, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);;
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
	}
	
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
			Iterator<Square>squareIterator = squares.iterator();
			while(squareIterator.hasNext()) 
				squareIterator.next().drawFigure(g,0,0);
		}
		
		public class StartAction extends AbstractAction
		{
			Random intGenerator;
			
			StartAction()
			{
				intGenerator = new Random();
			}
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				Square squ = new Square(intGenerator.nextInt(getWidth() - 20));
				squares.add(squ);
				Runnable r = () -> {
									try
									{
										int speed = intGenerator.nextInt(5) + 1;
										while(true)
										{		
											if(runSquares)
											{
												speed = squ.movePoint(getWidth(), getHeight() , speed);
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
}