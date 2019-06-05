import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] arr = new Person[3];

        Person jan = new Person("jan", 300);
        Person tomasz = new Person("tomasz", 100);
        Person adam = new Person("adam", 150);

        arr[0] = jan;
        arr[1] = tomasz;
        arr[2] = adam;

        Arrays.sort(arr, new Sortujemy());

        for(Person i: arr) {
            System.out.println(i.getSalary());
        }
    }
}
