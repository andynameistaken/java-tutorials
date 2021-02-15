//package beans.pj_beans;//Klasa CounterView
////Widok licznika przedstawiamy w postaci etykiety
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.beans.*;
//
//
//public class CounterView extends JLabel implements PropertyChangeListener {
//
//
//    // Konstruktor domyślny: inicjalizuje etykietę tekstem "0"
//    CounterView()  {
//        this("0");
//    }
//
//    // Konstruktor inicjalizujący etykietę podanym tekstem
//    CounterView(String lab) {
//        super(lab);
//        setOpaque(true);   // etykieta nie przezroczysta
//        // ramka
//        setBorder(BorderFactory.createLineBorder(Color.black));
//        // rozmiary i wyrównanie tekstu
//        setPreferredSize(new Dimension(75, 40));
//        setHorizontalAlignment(CENTER);
//    }
//
//    // obługa zdarzenia PropertyChange
////    public void propertyChange(PropertyChangeEvent e)  {
////        Integer oldVal = (Integer) e.getOldValue(),
////                newVal = (Integaler) e.getNewValue();
////        System.out.println("Value changed from " + oldVal + " to " + newVal);
////        setText("" + newVal + "");  // pokazanie na etykiecie nowego stanu licznika
////    }
////
//
//
//}