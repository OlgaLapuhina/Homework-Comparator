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

    static Comparator<Person> personComparator = (Person a, Person b) -> {
        int surNameFirstPerson = a.getSurname().split(" ").length;
        int surNameSecondPerson = b.getSurname().split(" ").length;

        if (surNameFirstPerson == surNameSecondPerson) {
            return Integer.compare(a.getAge(), b.getAge());
        }
        return surNameFirstPerson > surNameSecondPerson ? 1 : -1;
    };


}
