import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olya", "Skvorsova Gindina", 36));
        people.add(new Person("Maria", "Caprio De Lavega", 32));
        people.add(new Person("Vanya", "Lya Ivanov", 40));

        System.out.println(people);

        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
