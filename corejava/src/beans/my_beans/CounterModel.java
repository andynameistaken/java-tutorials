package beans.my_beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class CounterModel implements Serializable
{
    private int count = 0;
    private PropertyChangeSupport propertyChangeSupport= new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener)
    {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropetyChangeListener(PropertyChangeListener propertyChangeListener)
    {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public int getCount()
    {
        return count;
    }

    public synchronized void setCount(int newCount)
    {
        int oldCount = count;
        count = newCount;
        propertyChangeSupport.firePropertyChange("count", oldCount, newCount);
    }

    public void  increment()
    {
        setCount(getCount() + 1);
    }
    public void decrement(){setCount(getCount()-1);}
}
