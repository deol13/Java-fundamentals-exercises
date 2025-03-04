package se.lexicon;

import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class BasicExercisesOne {
    Scanner scanner;
    public BasicExercisesOne()
    {
        scanner = new Scanner(System.in);
    }

    public void runExercises()
    {
        //exerciseOne();
        //exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        //exerciseFive();
        //exerciseSix();
        //excerciseSeven();
        //exerciseEight();
        //exerciseNine();
        //exerciseTen();
        //exerciseEleven();
        //exerciseTwelve();
        //exerciseThirteen();
        exerciseFifteen();
    }

    private int takeAnInput()
    {
        System.out.println("Input a number:");
        return scanner.nextInt();
    }

    public void exerciseOne()
    {
        System.out.println("Hello \n  Dennis D");
    }
    public void exerciseTwo()
    {
        int result = 74 + 36;
        System.out.println("Exercise 2:" + result);
    }
    public void exerciseThree()
    {
        int result = 50 / 3;
        System.out.println("Exercise 3:" + result);
    }
    public void exerciseFour()
    {
        int num1 = -5 +8 * 6;
        int num2 = (55+9) % 9;
        int num3 = 20 + (-3) * 5 / 9;
        int num4 = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println("Exercise 4:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
    public void exerciseFive()
    {
        int num1 = takeAnInput();
        int num2 = takeAnInput();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    public void exerciseSix()
    {
        int num1 = takeAnInput();
        int num2 = takeAnInput();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
    public void excerciseSeven()
    {
        int num1 = takeAnInput();
        System.out.println(num1 + " * 1 = " + num1);
        System.out.println(num1 + " * 2 = " + (num1 * 2));
        System.out.println(num1 + " * 3 = " + (num1 * 3));
        System.out.println(num1 + " * 4 = " + (num1 * 4));
        System.out.println(num1 + " * 5 = " + (num1 * 5));
        System.out.println(num1 + " * 6 = " + (num1 * 6));
        System.out.println(num1 + " * 7 = " + (num1 * 7));
        System.out.println(num1 + " * 8 = " + (num1 * 8));
        System.out.println(num1 + " * 9 = " + (num1 * 9));
        System.out.println(num1 + " * 10 = " + (num1 * 10));
    }
    public void exerciseEight()
    {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    public void exerciseNine()
    {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
    public void exerciseTen()
    {
        System.out.println((4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7)+ (1.0/9) - (1.0/11))));
    }
    public void exerciseEleven()
    {
        double radius = 7.5;
        System.out.println("Parimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (radius * radius * Math.PI));
    }
    public void exerciseTwelve()
    {
        int num1 = takeAnInput();
        int num2 = takeAnInput();
        int num3 = takeAnInput();
        System.out.println("The average of the three numbers is : " + (num1 + num2 + num3) / 3);
    }
    public void exerciseThirteen()
    {
        double width = 5.5, height = 8.5;
        System.out.println("Area is " + width + " * " + height + " = " + width * height);
        System.out.println("Parimeter is 2 * (" + width + " + " + height + ") = " + 2 * (width + height));
    }
    public void exerciseFifteen()
    {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E MMM dd, yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Current date and time: " + formattedDate);
    }
}
