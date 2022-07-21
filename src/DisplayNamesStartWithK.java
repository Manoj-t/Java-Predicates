import java.util.function.Predicate;

public class DisplayNamesStartWithK {

    public static void main(String[] args) {
        String[] names = {"Kajal", "Kareena", "Sunny", "Katy", "Monica", "Phoebe", "Courtney Cox"};
        Predicate<String> startsWithK = s -> s.charAt(0) == 'K';

        for(String name : names){
            if(startsWithK.test(name)){
                System.out.println(name);
            }
        }
    }
}
