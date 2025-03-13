package StaticMembersExercises;

public class Initializer {
    public static int initialValue;

    public Initializer() {

    }

    // Static block
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialized to " + initialValue);
    }

    public static void main(String[] args) {
        System.out.println("initialValue before creating an instance:" + Initializer.initialValue);
        Initializer obj = new Initializer();
        System.out.println("initialValue after creating an instance:" + Initializer.initialValue);
    }
}
