package beans.my_beans;

import design_patterns.ModelViewController.CalculatorController;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CounterController implements PropertyChangeListener
{
    private CounterView counterView;
    private CounterModel counterModel;

    public CounterController(CounterView counterView, CounterModel counterModel)
    {
        this.counterView = counterView;
        this.counterModel = counterModel;
//        this.counterView.addIncrementListener(
//                e ->
//                {
//                    int val = counterModel.getCount();
//                    counterModel.setCount(++val);
//                    counterView.counterField.setText(Integer.toString(counterModel.getCount()));
//                }
//        );
//        this.counterView.addDecrementListener(
//                e ->
//                {
//
//                    int val = counterModel.getCount();
//                    counterModel.setCount(--val);
//                    counterView.counterField.setText(Integer.toString(counterModel.getCount()));
//                }
//        );
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        int oldVal = (int) evt.getOldValue();
        int newVal = (int) evt.getNewValue();
        System.out.println("newVal = " + newVal);
//        counterView.
    }
}
