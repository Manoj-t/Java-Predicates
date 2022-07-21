import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        Predicate<Integer> predicate = I -> I > 10 ? true : false; // implemented test method in Predicate interface
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(5));
    }
}
