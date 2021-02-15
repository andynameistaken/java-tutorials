package arrOfGenericTypeDerrivedFromComparable;

public class Para<S, T> {

    private S first;
    private T last;

    public Para(S f, T l) {
        first = f;
        last = l;
    }

    public Para() {}

    public S getFirst() { return first; }
    public T getLast()   { return last; }

    public void setFirst(S f) { first = f; }
    public void setLast(T l) { last = l; }

    public String toString() {
        return first + " " + last;
    }

}