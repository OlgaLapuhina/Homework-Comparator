import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int surNameFirstPerson = o1.getSurname().split(" ").length;
        int surNameSecondPerson = o2.getSurname().split(" ").length;

        if (surNameFirstPerson == surNameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return surNameFirstPerson > surNameSecondPerson ? 1 : -1;
    }
}
