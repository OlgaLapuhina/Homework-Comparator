import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Olya", "Skvorsova Gindina", 36));
        people.add(new Person("Maria", "Caprio De Lavega", 32));
        people.add(new Person("Vanya", "Lya Ivanov", 40));

        System.out.println(people);

        Collections.sort(people, personComparator);
        System.out.println(people);
    }

    static Comparator<Person> personComparator = (p1, p2) -> {
        int surNameFirstPerson = p1.getSurname().split(" ").length;
        int surNameSecondPerson = p2.getSurname().split(" ").length;

        if (surNameFirstPerson == surNameSecondPerson) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
        return surNameFirstPerson > surNameSecondPerson ? 1 : -1;
    };


}
