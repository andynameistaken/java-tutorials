package design_patterns.ModelViewController;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
* View - displays what user needs to see
* Doesn't perform calculations, just passes user input to whatever needs it
*/

public class CalculatorView extends JFrame
{
	private JTextField firstNumLabel = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumLabel = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

//	Setup components in constructor:
public CalculatorView()
	{
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 200);

		calcPanel.add(firstNumLabel);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumLabel);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		this.add(calcPanel);
	}
//	Getters for fetching numbers:
	public int getFirstNumber() { return Integer.parseInt(firstNumLabel.getText()); }
	public int getSecondNumber() { return Integer.parseInt(secondNumLabel.getText()); }
	public int getCalcSolution() { return  Integer.parseInt(calcSolution.getText()); }
//	Setter for sending data to solution:
	public void setCalcSolution(int solution) {calcSolution.setText(Integer.toString(solution));
	}
//	Adder listener to button
	public void addCalculateListener(ActionListener actionListener){calculateButton.addActionListener(actionListener);}

//	Popup for errors:
	public void displayErrorPopup(String error){JOptionPane.showMessageDialog(this, error);}
}
