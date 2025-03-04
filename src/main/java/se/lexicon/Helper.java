package se.lexicon;

import java.util.Scanner;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);

    /// Output an int
    public static void outputData(int show)
    {
        System.out.println(show);
    }
    /// Output a string
    public static void outputData(String show)
    {
        System.out.println(show);
    }

    /// Take an int from user
    public static int takeIntInput(String text)
    {
        System.out.println(text);
        return scanner.nextInt();
    }
    /// Take a double from user
    public static double takeDoubleInput(String text)
    {
        System.out.println(text);
        return scanner.nextDouble();
    }
    /// Take a string from user
    public static String takeStrInput(String text)
    {
        System.out.println(text);
        return scanner.nextLine();
    }
}
