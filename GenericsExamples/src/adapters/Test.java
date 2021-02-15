package adapters;// Użycie adapterów


        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.Iterator;
        import java.util.List;



class AddableCollection<E> implements Addable<E> {
    private Collection<E> c;
    public AddableCollection(Collection<E> c) {
        this.c = c;
    }
    public void add(E item) { c.add(item); }
}




class SomeContainer<T> implements Iterable<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    public void addElement(T item) { storage.add(item); } // tutaj "addElement"
    public Iterator<T> iterator() { return storage.iterator(); }
}


abstract class AddableAdapter<S, T> implements Addable<T> {
    private S seq;
    public AddableAdapter(S sequence) { seq = sequence; }
    public S getSequence() { return seq; }
    public abstract void add(T item);
}

class Zwierz {}
class Pies extends Zwierz {}
class Kot extends Zwierz {}


public class Test {

    public static void main(String[] args) {
        // Adaptacja kolekcji:
        List<String> words = new ArrayList<String>();
        ContainerOp.fill(new AddableCollection<String>(words),
                String.class,
                "Ala", "ma", "kota"
        );
        for (String w : words) System.out.println(w);
        System.out.println("----------------------");


        // Użycie abstrakcyjnego adaptera
        SomeContainer<Zwierz> con = new SomeContainer<Zwierz>();




        Addable<Zwierz> zwierzeta = new AddableAdapter<SomeContainer<Zwierz>, Zwierz>(con) {
            public void add(Zwierz item) { getSequence().addElement(item); }
        };

        ContainerOp.fill(zwierzeta, Pies.class, 7);
        ContainerOp.fill(zwierzeta, Kot.class, 3);

        for (Zwierz z : con) System.out.println(z);
    }
}