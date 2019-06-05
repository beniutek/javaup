package com.company;

public class Person extends Human implements Comparable<Person>, Cloneable {
    private String fName;
    private String lName;
    private double salary;

    public Person(String fName, String lName, double salary, String gender) {
        super(gender);
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int tmp = customCompare(this.lName, o.lName);

        if(tmp == 0) return customCompare(this.fName, o.fName);

        return tmp;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    private int customCompare(String x, String y) {
        int tmp = x.compareTo(y);

        if(tmp > 0) {
            return 1;
        } else if(tmp < 0) {
            return -1;
        }

        return 0;
    }

    public double getSalary() {
        return salary;
    }
}
