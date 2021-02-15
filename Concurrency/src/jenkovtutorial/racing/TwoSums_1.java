package jenkovtutorial.racing;

public class TwoSums_1
{
    private int sum1 = 0;
    private int sum2 = 0;

    public void add(int val1, int val2)
    {
        synchronized (this)
        {
            synchronized (this)
            {
                this.sum1 += val1;
                this.sum2 += val2;
            }
        }
    }

}
