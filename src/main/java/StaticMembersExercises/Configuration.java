package StaticMembersExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Configuration {
    public static String configValue;

    static {
        try{
            File file = new File("configTestFile.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()){
                configValue = myReader.nextLine();
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Static block executed: configValue initialized");
    }

    public static void main(String[] args) {
        System.out.println("Config: " + Configuration.configValue);
    }
}
