package StaticMembersExercises;

public class Constants {
    public static final double PI = 3.14159;

    public static double calcAreaOfCircle(double radius){
        return PI * (radius * 2);
    }

    public static void main(String[] args) {
        System.out.println("Circle area: " + Constants.calcAreaOfCircle(5));
    }
}
