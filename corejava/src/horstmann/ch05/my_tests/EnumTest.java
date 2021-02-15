package horstmann.ch05.my_tests;

import java.util.Arrays;

public class EnumTest
{
    enum Size
    {
        SMALL("S"), MEDIUM("M"), LARGE("L");
        private String letters;

        private Size(String letters)
        {
            this.letters = letters;
        }

        public String getLetters()
        {
            return letters;
        }
    }

    public static void main(String[] args)
    {
        var dunno = Enum.valueOf(Size.class, "SMALL");
        System.out.println(dunno.getClass());
        System.out.println(dunno);
        dunno = Size.SMALL;

        Size smol = Enum.valueOf(Size.class, "SMALL");
        System.out.println(smol);
        System.out.println(Arrays.toString(Size.values()));

    }


}
