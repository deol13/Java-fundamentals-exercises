package se.lexicon;

import java.util.Scanner;

public class MethodExercises {
    static Scanner scanner;

    public static void main(String[] args) {
        //methodExerciseOne();
        //methodExerciseTwo();
        //methodExerciseThree();
        //methodExerciseFour();
        methodExerciseFive();
    }

    public static void methodExerciseOne() {
        double num1 = Helper.takeDoubleInput("Input the first number: ");
        double num2 = Helper.takeDoubleInput("Input the second number: ");
        double num3 = Helper.takeDoubleInput("Input the third number: ");

        smallest(num1, num2, num3);
    }
    private static void smallest(double num1, double num2, double num3){
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

    public static void methodExerciseTwo() {
        int num1 = Helper.takeIntInput("Input the first number: ");
        int num2 = Helper.takeIntInput("Input the second number: ");
        int num3 = Helper.takeIntInput("Input the third number: ");
        int[] arr = {num1, num2, num3};

        Helper.outputData("The average value is " + getTheAverage(arr));
    }
    private static double getTheAverage(int[] numbers){
        int count = numbers.length;

        if(count == 0)
            return 0;
        else if(count == 1)
            return numbers[0];

        double result = 0;
        for (int number : numbers){
            result += number;
        }
        return result / count;
    }

    public static void methodExerciseThree(){
        String text = Helper.takeStrInput("Input a whole string");
        Helper.outputData("The middle character in the string is " + findMiddleCharInString(text));
    }
    private static String findMiddleCharInString(String text){
        if (text == null || text.isBlank()){
            return "String is null, empty or only filled with blanks";
        } else if(text.length() == 1){
            return "String only contains one character";
        }

        int length;
        int position;

        if (text.length() % 2 == 0){
            position = text.length() / 2 -1;
            length = 2;

        } else{
            position = text.length() / 2;
            length = 1;
        }
        return text.substring(position, position + length);  // Stops at the index before specified ending index.
    }

    public static void methodExerciseFour(){
        String text = Helper.takeStrInput("Input the string: ");

        Helper.outputData("Number of Vowels in the string: " + countVowelsInString(text));
    }
    private static int countVowelsInString(String text){
        char[] vowelsArr = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++){
            for (char c : vowelsArr){ // or just a big if-statement.
                if(text.charAt(i) == c){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void methodExerciseFive()
    {
        String text = Helper.takeStrInput("Input the string: ");
        Helper.outputData("Number of words in the string: " + countNumberOfWords(text));
    }
    private static int countNumberOfWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    //Not tested yet.
    public static void methodExerciseSix(){
        int digit = Helper.takeIntInput("Input an integer: ");
        Helper.outputData("The sum is: " + sumOfDigits(digit));
    }
    private static int sumOfDigits(int number){
        String numberAsStr = Integer.toString(number);
        char[] numbersAsChar = new char[numberAsStr.length()];

        for (int i = 0; i < numberAsStr.length(); i++) {
            numbersAsChar[i] = numberAsStr.charAt(i);
        }

        int result = 0;
        for (int i = 0; i < numbersAsChar.length; i++) {
            result += Character.digit(numbersAsChar[i], 0);
        }
        return result;
    }
}


