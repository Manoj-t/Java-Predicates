import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        int[] numbers = {0,5,10,15,20,25};

        Predicate<Integer> p1 = I -> I > 10; // this predicate is used to filter integers that are greater than 10
        Predicate<Integer> p2 = I -> I % 2 == 0; // this predicate is used to filter integers that are divisible by 2


        Predicate<Integer> p3 = p1.negate(); // this predicate returns true only for integers that are not greater than 10
        Predicate<Integer> p4 = p1.and(p2); // this is a composed predicate that represents a short-circuiting logical AND of p1 and p2 i.e. returns true for integers that are divisible by 2 and greater than 10
        Predicate<Integer> p5 = p1.or(p2); // this is a composed predicate that represents a short-circuiting logical OR of p1 and p2 i.e. returns true for integers that are divisible by 2 or greater than 10

        System.out.println("Integers that are greater than 10: ");
        m1(p1, numbers);

        System.out.println("Integers that are divisible by 2: ");
        m1(p2, numbers);

        System.out.println("Integers that are not greater than 10");
        m1(p3, numbers);

        System.out.println("Integers that are greater than 10 and divisible by 2: ");
        m1(p4, numbers);

        System.out.println("Integers that are greater than 10 or divisible by 2: ");
        m1(p5, numbers);

    }

    public static void m1(Predicate<Integer> p, int[] numbers) {

        for(int number : numbers){
            if(p.test(number)){
                System.out.println(number);
            }
        }

    }
}
