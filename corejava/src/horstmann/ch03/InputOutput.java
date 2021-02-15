package c03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class InputOutput
{
    public static void main(String[] args)
    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Read line of string");
//        String line = scanner.nextLine();
//        System.out.println("Line of string:" + " " + line);
//
//        System.out.println("Single word");
//        String word = scanner.next();
//        System.out.printf("Scanned word: %s", word);

////        Read file
//        try
//        {
//            Scanner text_scanner = new Scanner(
//                    Path.of("/Users/andy/Devel/Java/corejava/src/horstmann_core_I.ch03/file.txt"),
//                    StandardCharsets.UTF_8);
//            System.out.println(text_scanner.nextLine());
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }

//        Write to file

        try
        {
            PrintWriter out = new PrintWriter(
                                    "/Users/andy/Devel/Java/corejava/src/horstmann_core_I.ch03/file.txt",
                    StandardCharsets.UTF_8);
            out.write("hello");
            out.flush();
        } catch (IOException e)
        {
            e.printStackTrace();
        }



    }
}
