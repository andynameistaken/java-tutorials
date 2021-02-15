package horstmann.ch06.lambda;

import javax.swing.*;

public class myLambda
{
	public static void main(String[] args)
	{
		Timer timer = new Timer(1000, e -> {
			System.out.println("e.getActionCommand() = " + e.getActionCommand());
			System.out.println("e.getModifiers() = " + e.getModifiers());
			System.out.println("e.getWhen() = " + e.getWhen());
			System.out.println("e.paramString() = " + e.paramString());

		});

//		timer.start();
//		JOptionPane.showMessageDialog(null, "Quit program");
		Concat concat = (String... strings) ->
		{
			StringBuilder stringBuilder = new StringBuilder();
			for (String s : strings)
			{
			    stringBuilder.append(s).append(" ");
			}
			return stringBuilder.toString();
		};


		String food = concat.concat("dog", "eats", "food");
		System.out.println("food = " + food);
	}
}
