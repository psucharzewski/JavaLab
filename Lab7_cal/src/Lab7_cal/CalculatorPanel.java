package Lab7_cal;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {
	private JTextField txt;
	private String myString;

	/**
	 * Create the panel.
	 */
	public CalculatorPanel() {
		setLayout(null);
		myString="";
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 368, 418);
		add(panel);
		panel.setLayout(null);
		
		txt = new JTextField();
		txt.setText(myString);
		txt.setBounds(15, 16, 338, 44);
		panel.add(txt);
		txt.setColumns(10);
		
		JButton btnBlc = new JButton("BLC");
		btnBlc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(myString!=""){
				myString= myString.substring(0,myString.length()-1);
				txt.setText(myString);}
			}
		});
		btnBlc.setBounds(15, 76, 73, 53);
		panel.add(btnBlc);
		
		JButton btnClr = new JButton("CLR");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString="";
				txt.setText(myString);
			}
		});
		btnClr.setBounds(103, 76, 73, 53);
		panel.add(btnClr);
		
		JButton button = new JButton("(");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="(";
				txt.setText(myString);
			}
		});
		button.setBounds(191, 76, 73, 53);
		panel.add(button);
		
		JButton button_1 = new JButton(")");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+=")";
				txt.setText(myString);
			}
		});
		button_1.setBounds(279, 76, 73, 53);
		panel.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="1";
				txt.setText(myString);
			}
		});
		button_2.setBounds(15, 145, 73, 53);
		panel.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="2";
				txt.setText(myString);
			}
		});
		button_3.setBounds(100, 145, 76, 53);
		panel.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="3";
				txt.setText(myString);
			}
		});
		button_4.setBounds(191, 145, 73, 53);
		panel.add(button_4);
		
		JButton button_5 = new JButton("+");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="+";
				txt.setText(myString);
			}
		});
		button_5.setBounds(279, 144, 74, 54);
		panel.add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="4";
				txt.setText(myString);
			}
		});
		button_6.setBounds(15, 214, 73, 53);
		panel.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="5";
				txt.setText(myString);
			}
		});
		button_7.setBounds(103, 214, 73, 53);
		panel.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="6";
				txt.setText(myString);
			}
		});
		button_8.setBounds(191, 214, 73, 53);
		panel.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="-";
				txt.setText(myString);
			}
		});
		button_9.setBounds(277, 214, 76, 53);
		panel.add(button_9);
		
		JButton button_10 = new JButton("7");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="7";
				txt.setText(myString);
			}
		});
		button_10.setBounds(15, 283, 73, 53);
		panel.add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="8";
				txt.setText(myString);
			}
		});
		button_11.setBounds(103, 283, 73, 53);
		panel.add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="9";
				txt.setText(myString);
			}
		});
		button_12.setBounds(191, 283, 73, 53);
		panel.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="*";
				txt.setText(myString);
			}
		});
		button_13.setBounds(277, 283, 76, 53);
		panel.add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+=".";
				txt.setText(myString);
			}
		});
		button_14.setBounds(15, 346, 73, 56);
		panel.add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="0";
				txt.setText(myString);
			}
		});
		button_15.setBounds(99, 346, 77, 56);
		panel.add(button_15);
		
		JButton button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReversPolishNotacion myNotacion = new ReversPolishNotacion(myString);
				double result = myNotacion.getResult();
				myString = String.valueOf(result);
				
				txt.setText(myString);
			}
		});
		button_16.setBounds(191, 348, 73, 54);
		panel.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myString+="/";
				txt.setText(myString);
			}
		});
		button_17.setBounds(279, 346, 74, 56);
		panel.add(button_17);
		

	}
}
