package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person jan = new Person("JAN", "KOWALSKI", 300, "m");
        Person marian = new Person("MARIAN", "KOWALSKI", 4000, "m");
        Person rysiek = new Person("Rychu", "Peja", 0.50, "f");
        Person zenon = new Person("Zenon", "Martyniuk", 299.99, "m");

        System.out.println("PERSONA " + jan.toString());
        Person[] perArr = new Person[4];
        perArr[3] = jan;
        perArr[2] = marian;
        perArr[1] = rysiek;
        perArr[0] = zenon;

        Arrays.sort(perArr);
        System.out.println("default (comparable) sort: \n");
        for(Person i : perArr) {
            System.out.println(i);
        }

        Arrays.sort(perArr, new PersonComparator());
        System.out.println("salary (comparator) sort: \n");
        for(Person i : perArr) {
            System.out.println(i);
        }

        Person klon = zenon.clone();
        System.out.println("\nKLON: " + klon);

        File file = new File("test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("file not found in current directory\n"+"current dir: " + System.getProperty("user.dir"));
        }
    }
}
