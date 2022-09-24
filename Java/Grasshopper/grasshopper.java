package Java.Grasshopper;

public class grasshopper {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }

    public static void main(String[] args) {
        System.out.println(greet("George", "George"));
    }
}
