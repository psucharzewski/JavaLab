package Lab7_cal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


public class JFrame extends javax.swing.JFrame {
	public JFrame() {
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
				    JFrame frame = new JFrame();
				    frame.setTitle("Calculator");
				    frame.setSize(368, 500);
				    frame.addWindowListener(new WindowAdapter() {
				      public void windowClosing(WindowEvent e) {
				        System.exit(0);
				      }
				    });
				 
				    Container contentPane = frame.getContentPane();
				    contentPane.add(new CalculatorPanel());
				    frame.show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
