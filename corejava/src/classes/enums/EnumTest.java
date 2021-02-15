package classes.enums;

import java.util.Scanner;

public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type season name to print info of it." +'\n'+
                "Type q/Q to end program");
        StringBuilder stringBuilder =  new StringBuilder().append(scanner.nextLine().toUpperCase());
        while (!stringBuilder.toString().equals("Q"))
        {
            Season season = Season.valueOf(stringBuilder.toString());
            System.out.printf(
                    "Value of season: %s\n " +
                    "Number of months: %d \n" +
                    "Description: %s\n" +
                    "Ordinal: %d",
                    Season.valueOf(stringBuilder.toString()),
                    season.getNum_of_months(),
                    season.getDescription(),
                    season.ordinal()
            );

            System.out.println("\n\nType season " +
                    "name to print info of it." +'\n'+
                    "Type q/Q to end program");
            stringBuilder.setLength(0);
            stringBuilder.append(scanner.nextLine().toUpperCase());
        }

    }
}
