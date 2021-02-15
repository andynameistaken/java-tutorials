package beans.my_beans;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CounterView extends JFrame
{
    JButton incrementButton = new JButton("Increment");
    JButton decrementButton = new JButton("Decrement");
    public JTextField counterField = new JTextField(10);

    public CounterView()
    {
        JPanel counterPanel = new JPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(666,666);
        counterField.setEditable(false);
        counterField.setText("0");

        counterPanel.add(incrementButton);
        counterPanel.add(decrementButton);
        counterPanel.add(counterField);
        this.add(counterPanel);
    }

//    @Override
//    public void propertyChange(PropertyChangeEvent evt)
//    {
//        int oldVal = (int) evt.getOldValue();
//        int newVal = (int) evt.getNewValue();
//        System.out.println(" oldVal = " + oldVal);
//        System.out.println("newVal = " + newVal);
//        counterField.setText(Integer.toString(newVal));
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//        String cmd = e.getActionCommand();
//        if (cmd.equals("Increment"))
//
//    }

//    public void addIncrementListener(ActionListener al)
//    {
//        this.incrementButton.addActionListener(al);
//    }
//    public void addDecrementListener(ActionListener al)
//    {
//        decrementButton.addActionListener(al);
//    }
}
