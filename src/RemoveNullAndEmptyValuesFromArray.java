import java.util.function.Predicate;

public class RemoveNullAndEmptyValuesFromArray {

    public static void main(String[] args) {

        String[] names = { "Manoj", "Ravi", null, "Rajesh", "", "Deekshit", null, "", "Venky"};

        Predicate<String> p = s -> s != null && !s.isEmpty();

        System.out.println("names that are not null and not empty are: ");
        for(String name : names){
            if(p.test(name)){
                System.out.println(name);
            }
        }

    }
}

