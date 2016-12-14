package com.example.hectorvera.sortjavaclass;

import java.util.Comparator;

/**
 * Created by User on 10/5/2016.
 */

public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person p1, Person p2) {
        if(p1 == null && p2 != null){
            return -1;
        }else
        if(p1 != null && p2 == null){
            return  1;
        }else
        if(p1 == null && p2 == null){
            return 0;
        }
        return p1.getLastName().compareTo(p2.getLastName());
        //return p1.getLastName().compareTo(p2.getLastName());
    }

}
