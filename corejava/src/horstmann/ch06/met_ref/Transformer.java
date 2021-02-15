package horstmann.ch06.met_ref;

public interface Transformer <T,S>
{
	T transform(S s);
}
