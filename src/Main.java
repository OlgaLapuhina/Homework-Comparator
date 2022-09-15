import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olya", "Skvorsova Gindina", 36));
        people.add(new Person("Maria", "Caprio De Lavega", 32));
        people.add(new Person("Vanya", "Lya Ivanov", 40));
        people.add(new Person("Valya", "Romanova", 17));
        people.add(new Person("Roman", "Genius", 14));

        System.out.println(people);

        people.removeIf(checkAge -> (checkAge.getAge() < 18));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
