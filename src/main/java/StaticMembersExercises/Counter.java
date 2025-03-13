package StaticMembersExercises;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println("Count: " + Counter.count);
    }
}
