package packk;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class FirstJFrame extends JFrame
{
	
	
	public FirstJFrame()
	{
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(screen.width/2, screen.height/2);
		setBounds(screen.width/4, screen.height/4, screen.width/2, screen.height/2 );
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		getContentPane().add(panel, BorderLayout.CENTER);
		FigureComponent figureComponent = new FigureComponent();
		Dimension panelSize = this.getSize();
		figureComponent.setPreferredSize(panelSize);
		figureComponent.setBorder(new EmptyBorder(0, 0, screen.height/2, screen.width/2));
		panel.add(figureComponent);
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		FirstJFrame f = new FirstJFrame();
	}
}
