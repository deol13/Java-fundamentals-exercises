package se.lexicon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static se.lexicon.MethodExercises.scanner;

public class ErrorHandlingExercises {
    public static void main(String[] args) {

        try{
            exOne(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //exTwo();
        //exThree();
        //ex4();
        //ex5();
        //ex6();
        ex7();
    }

    // Exercise 1
    public static void exOne(int num){
        if(num <= 0)
            throw new IllegalArgumentException("Number can't be 0 or negative!");
    }

    // Exercise 2
    public static void exTwo(){
        try{
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            exTwoTestNumber(input);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void exTwoTestNumber(int num){
        if(num % 2 != 0){
            throw new IllegalArgumentException("Number is only allowed to be even!");
        }
    }


    public static void exThree(){
        try{
            readFile("HelloWorld.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            System.out.println(line);
        }

        myReader.close();
    }

    // Exercise 4
    public static void ex4(){
        try{
            readFile2("ex4.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Error: File not found");
        }
        catch (NumberFormatException e){
            System.out.println("Error: Character is not a number");
        }
        catch (PositiveNumberException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void readFile2(String fileName) throws FileNotFoundException, PositiveNumberException {
        File myObj = new File(fileName);
        Scanner myReader = new Scanner(myObj);

        while (myReader.hasNextLine()){
            int value = Integer.parseInt(myReader.nextLine());
            if (value >= 0)
                throw new PositiveNumberException("All the numbers of " + fileName + " needs to be negative.");
            else
                System.out.println(value);
        }

        myReader.close();
    }

    // Exercise 5
    public static void ex5(){
        try {
            readFile3("ex5.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (FileEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readFile3(String fileName) throws FileNotFoundException, FileEmptyException{
        File file = new File(fileName);
        Scanner myReader = new Scanner(file);

        if (!myReader.hasNextLine())
            throw new FileEmptyException("File is empty!");

        while (myReader.hasNextLine()){
            System.out.println(myReader.nextLine());
        }
    }

    // Exercise 6
    public static void ex6(){
        try{
            readListFromUser();
        }
        catch (InputMismatchException | DuplicateInputException e){
            System.out.println(e.getMessage());
        }


    }
    public static void readListFromUser() throws InputMismatchException, DuplicateInputException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> collection = new ArrayList<Integer>();

        System.out.println("How many value do you want to list?");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Input a number, input a duplicate to exit.");
            collection.add(scanner.nextInt());
        }

        checkForDuplicates(collection);

        scanner.close();
    }

    public static void checkForDuplicates(List<Integer> collection) throws DuplicateInputException{
        Set<Integer> setOfCollection = new HashSet<>();

        for (int number : collection){
            if (!setOfCollection.add(number)){
                throw new DuplicateInputException("Error: Duplicate value in list!");
            }
        }
    }

    // Exercise 7
    public static void ex7(){
        try {
            checkForVowels("Hello World!");
            System.out.println("Vowels found in text: Hello World!");
            System.out.println("--------------");
            checkForVowels("Typstlgs");

        }
        catch (NoVowelException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkForVowels(String text) throws NoVowelException{
        boolean vowelFound = false;
        //String[] arrOfVowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < vowels.length(); i++){
            char ch = vowels.charAt(i);
            if(text.contains(String.valueOf(ch))){
                vowelFound = true;
                break;
            }
        }

        if (!vowelFound)
            throw new NoVowelException("Error: No vowels found in " + text);
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}
class FileEmptyException extends Exception {
    public FileEmptyException(String message) {
        super(message);
    }
}
class DuplicateInputException extends Exception {
    public DuplicateInputException(String message) {
        super(message);
    }
}
class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}