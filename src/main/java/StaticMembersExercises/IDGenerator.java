package StaticMembersExercises;

public class IDGenerator {
    public static int nextID;

    static {
        nextID = 0;
        System.out.println("nextID initialized");
    }

    public static int generateID(){
        return nextID++;
    }

    public static void main(String[] args) {
        System.out.println("Id: " + IDGenerator.generateID());
        System.out.println("Id: " + IDGenerator.generateID());
        System.out.println("Id: " + IDGenerator.generateID());
    }
}
