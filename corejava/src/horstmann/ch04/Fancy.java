package horstmann.ch04;

public class Fancy extends Simple
{
    private int number;
    public Fancy(String name, int number)
    {
        super(name);
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }
    final void printHello()
    {
        System.out.println("Hellp");
    }
}
