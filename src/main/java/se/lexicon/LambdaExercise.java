package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Ex1
interface SumCalculator {
    int sum(int a, int b);
}

// Ex2
interface StringFunc {
    boolean empty(String text);
}

// Ex8
interface FactorialCalc{
    int factorial(int a);
}

public class LambdaExercise {

    public static void main(String[] args) {
        System.out.println("Ex1:");
        ex1();
        System.out.println("----------------------");
        System.out.println("Ex2:");
        ex2();
        System.out.println("----------------------");
        System.out.println("Ex3:");
        ex3();
        System.out.println("----------------------");
        System.out.println("Ex4:");
        ex4();
        System.out.println("----------------------");
        System.out.println("Ex5:");
        ex5();
        System.out.println("----------------------");
        System.out.println("Ex6:");
        ex6();
        System.out.println("----------------------");
        System.out.println("Ex7:");
        ex7();
        System.out.println("----------------------");
        System.out.println("Ex8:");
        ex8();
        System.out.println("----------------------");
    }

    public static void ex1() {
        SumCalculator sumCalc = (a, b) -> a + b;

        System.out.println("Sum: " + sumCalc.sum(10, 9));
    }

    public static void ex2() {
        StringFunc checkString = String::isEmpty;
        String text1 = "text";
        String text2 = "";

        System.out.println("Check if string one: " + text1 + " string is empty: " + checkString.empty(text1));
        System.out.println("Check if string two: " + text2 + " string is empty: " + checkString.empty(text2));
    }

    public static void ex3() {
        ArrayList<String> texts = new ArrayList<String>();
        texts.add("First");
        texts.add("Second");
        texts.add("Third");

        System.out.println("Original string: ");
        for ( String str : texts )
            System.out.println(str);

        texts.replaceAll(str -> str.toLowerCase());

        System.out.println("\nLower string: ");
        for ( String str : texts )
            System.out.println(str);

        texts.replaceAll(str -> str.toUpperCase());

        System.out.println("\nUpper string: ");
        for ( String str : texts )
            System.out.println(str);
    }
    public static void ex4() {
        List<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Original numbers: ");
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            System.out.print(i + " ");
        }

        List<Integer> evenNumbers = new ArrayList<Integer>();
        List<Integer> oddNumbers = new ArrayList<Integer>();

        evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        //evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        oddNumbers = numbers.stream().filter(n -> n % 2 != 0).toList();
        //oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println("\n\nOdd numbers: ");
        for (int number : oddNumbers)
            System.out.print(number + " ");


        System.out.println("\n\nEven numbers: ");
        for (int number : evenNumbers)
            System.out.print(number + " ");
        System.out.println();
    }
    public static void ex5() {
        List<String> names = Arrays.asList("Lina", "Charlie", "Ylva", "Matilda", "Adam", "Gunilla");
//        List<String> names = new ArrayList<String>();
//        names.add("Lina");
//        names.add("Charlie");
//        names.add("Ylva");
//        names.add("Matilda");
//        names.add("Adam");
//        names.add("Gunilla");

        System.out.println("Original list:");
        for (String str : names)
            System.out.println(str + " ");

        names.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        //names = listOfStr.stream().sorted().collect(Collectors.toList());

        System.out.println("\n\nSorted list:");
        for (String str : names)
            System.out.println(str + " ");

    }

    public static void ex6(){
        List<Double> numbers = Arrays.asList(25.0,11.0,42.0,90.0,65.0,1.0,66.0,41.0);

        //Summera
        //Dela med längden
        //Using stream to perform something on this collection.
        //Use MapToDouble to do operations on the list/stream, in this case get the average.
        //orElse will return a value or the default value entered. Average would have otherwise returned a OptionalDouble with text in it as well.
        double sum = numbers.stream().mapToDouble(d -> d.doubleValue()).average().orElse(0.0);

        System.out.println("sum: " + sum);
    }

    public static void ex7(){
        List<Integer> numbers = Arrays.asList(1,2,3,9,4,5,1,6,7,5,8,9);

        System.out.println("Original list: ");
        for (int num : numbers)
            System.out.print(num + " ");

        //List<Integer> noDup = numbers.stream().distinct().toList();
        List<Integer> noDup = new ArrayList();
        numbers.stream().distinct().forEach(noDup::add);

        System.out.println("No duplicate list: ");
        for (int num : noDup)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void ex8(){
        int number = 5;

        FactorialCalc mFactorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial of " + number + " :" + mFactorial.factorial(number));
    }
}
