package horstmann.ch04;

public class Test
{
    public static void main(String[] args)
    {
        Fancy fancy= new Fancy("Dog", 11);
        System.out.println(fancy.getName());
        fancy.printHello();
        var a = 2;
        Simple simple = new Fancy("ads", 3);
    }
}