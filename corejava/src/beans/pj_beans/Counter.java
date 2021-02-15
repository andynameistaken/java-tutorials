//package beans.pj_beans;// Klasa Counter
//
//import java.awt.event.*;
//import java.beans.*;
//import java.io.*;
//
//public class Counter implements Serializable {
//
//    private int count = 0;    // właściwość count
//
//    // Pomocniczy obiekt do prowadzenia listy słuchaczy zmian właściwości oraz
//    // propagowania zmian  wśród zarejestrowanych złuchaczy
//    private PropertyChangeSupport propertyChange = new PropertyChangeSupport(this);
//
//
//    // Konstruktory
//
//    public Counter() {
//        this(0);
//    }
//
//    public Counter(int aCount) {
//        setCount( aCount );
//    }
//
//
//    // Metody przyłączania i odłączania słuchaczy zmian właściwości
//
//    public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
//        propertyChange.addPropertyChangeListener(listener);
//    }
//
//    public synchronized void removePropertyChangeListener(PropertyChangeListener l) {
//        propertyChange.removePropertyChangeListener(l);
//    }
//
//    // Proste metody zwiększania i zmniejszania licznika
//
//    public void increment() {
//        setCount(getCount()+1);
//    }
//
//    public void decrement() {
//        setCount(getCount()-1);
//    }
//
//
//    // Getter właściwości "count"
//    public int getCount() {
//        return count;
//    }
//
//    // Setter właściowści "count"
//    public synchronized void setCount(int aCount) {
//        int oldValue = count;
//        count = aCount;
//
//        // wywołanie metody firePropertChange z klasy PropertyChangeSupport
//        // powoduje wygenerowanie zdarzenia PropertyChangeEvent i rozpropagowanie
//        // go wśród wszystkich przyłączonych słuchaczy, ale tylko wtedy, gdy nowa
//        // wartość właściwości różni się od starej wartości
//
//        propertyChange.firePropertyChange("count", Integer.valueOf(oldValue),
//            Integer.valueOf(aCount));
//}
//
//}
