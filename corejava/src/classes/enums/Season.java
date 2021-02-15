package classes.enums;

public enum Season
{
    WINTER("Snow is expected", 5),
    SPRING("Flowers blossom", 2),
    SUMMER("Too hot usually", 3),
    AUTUMN("rainy and dark", 2);

    private String description;
    private int num_of_months;

    Season(String description, int num_of_months)
    {
        this.description = description;
        this.num_of_months = num_of_months;
    }

    public String getDescription()
    {
        return description;
    }

    public int getNum_of_months()
    {
        return this.num_of_months;
    }
}