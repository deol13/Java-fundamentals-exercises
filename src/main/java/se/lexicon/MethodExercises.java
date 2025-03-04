package se.lexicon;

import java.util.Scanner;

public class MethodExercises {
    static Scanner scanner;

    public static void main(String[] args) {
        methodExerciseOne();
    }

    public static void methodExerciseOne()
    {
        double num1 = Helper.takeDoubleInput("Input the first number: ");
        double num2 = Helper.takeDoubleInput("Input the second number: ");
        double num3 = Helper.takeDoubleInput("Input the third number: ");

        smallest(num1, num2, num3);
    }
    public static void smallest(double num1, double num2, double num3){
        String outputText = "The smallest value is ";
        if (num1 < num2)
            if  (num1 < num3)
                Helper.outputData(outputText + num1);
            else
                Helper.outputData(outputText + num3);
        else if (num2 < num3)
            Helper.outputData(outputText + num2);
        else
            Helper.outputData(outputText + num3);
    }

    public static void methodExerciseTwo()
    {

    }
}
