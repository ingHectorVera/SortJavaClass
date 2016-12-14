package com.example.hectorvera.sortjavaclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 10/5/2016.
 */

public class Main {

    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Hector","Vera"));
        persons.add(new Person("Elizabeth","Barraza"));
        persons.add(new Person("Francisco","Riva"));
        persons.add(new Person("Carlos","Nieto"));
        persons.add(new Person("Paola","Perez"));


        for (Person p: persons) {
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }

        sortByLastName(persons);

        for (Person p: persons) {
            System.out.println(p.getFirstName()+" "+p.getLastName());
        }
    }

    public static void sortByLastName(List<Person> persons){
        Comparator comp = new PersonComparator();
        Collections.sort(persons, comp);
    }
}
