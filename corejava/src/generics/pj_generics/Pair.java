package generics.pj_generics;

public class Pair<S, T> {

	private S first;
	private T last;

	public Pair(S f, T l) {
		first = f;
		last = l;
	}

	public Pair() {}

	public S getFirst() { return first; }
	public T getLast()   { return last; }

	public void setFirst(S f) { first = f; }
	public void setLast(T l) { last = l; }

	public String toString() {
		return first + " " + last;
	}

}

