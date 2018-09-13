package kata1;

import java.util.Date;

public class Kata1 {
    public static void main(String[] args) {
        Person person = new Person("Pepe", new Date(66, 4, 15));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
}
