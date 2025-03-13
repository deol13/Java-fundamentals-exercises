package StaticMembersExercises;

public class ComplexInitializer {
    public static int x;
    public static int y;
    public static int z;

    static {
        x = 10;
        y = 24;
        z = multi(x, y);
    }

    public static int multi(int x, int y){
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println("x: " + ComplexInitializer.x);
        System.out.println("y: " + ComplexInitializer.y);
        System.out.println("z: " + ComplexInitializer.z);
    }
}
