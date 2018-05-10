package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FirstJavaFrame extends JFrame {



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FirstJavaFrame frame = new FirstJavaFrame();
	}

	/**
	 * Create the frame.
	 */
	public FirstJavaFrame() {

			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(screen.width/2, screen.height/2);
			setBounds(screen.width/4, screen.height/4, screen.width/2, screen.height/2 );
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			getContentPane().add(panel, BorderLayout.CENTER);
			FigureComponent figureComponent = new FigureComponent();
			figureComponent.setBorder(new EmptyBorder(0, 0, screen.height/2, screen.width/2));
			panel.add(figureComponent);
			setVisible(true);


	}

}
