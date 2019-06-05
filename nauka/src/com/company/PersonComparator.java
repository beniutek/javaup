package com.company;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
