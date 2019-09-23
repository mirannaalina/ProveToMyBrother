package ProveToMyBrother;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person(14);
        Person person2 = new Person(23);
        Person person3 = new Person(33);
        Person person4 = new Person(12);
        Person person5 = new Person(45);

        List<Person> persoane = new ArrayList<>();

        persoane.add(person1);
        persoane.add(person2);
        persoane.add(person3);
        persoane.add(person4);
        persoane.add(person5);


        Collections.sort(persoane, new AgeComparator());

        System.out.println("Lista ascendenta de varste : ");

        for (Person persons : persoane) {
            System.out.println(persons.getAge());
        }

        Collections.sort(persoane, new AgeDescendent());

        System.out.println("Lista descendenta de varste : ");
        for (Person persons : persoane) {
            System.out.println(persons.getAge());
        }

    }


}
