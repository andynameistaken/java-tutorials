package adapters;

import java.lang.reflect.Constructor;

interface Addable<T> { void add(T t); }

class ContainerOp {

    // Dodaje do zestawu (kontenera) cont
    // obiekty typu T (lub dowolnych jego podtypów)
    // tworzone za pomocą konstruktora z argumentem typu V
    // wywoływanego dla kolejnych argumentów  args

    public static <T, V> void fill(Addable<T> cont,
                                   Class<? extends T> klasa, // aby wstawiać podtypy!
                                   V ... args )
    {
        for(V arg : args)
            try {
                Constructor cons = klasa.getDeclaredConstructor(arg.getClass());
                cont.add((T)cons.newInstance(arg));
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
    }

    // j.w. tylko n egzemplarzy stworzonych konstruktorem bezparemetrowym
    public static <T> void fill(Addable<T> cont,
                                Class<? extends T> klasa,
                                int n )
    {
        for (int i=0; i<n; i++)
            try {
                cont.add(klasa.newInstance());
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
    }

}
