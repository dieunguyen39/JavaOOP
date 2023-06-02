package BaiTap2.person;

import BaiTap2.person.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Dieu", 26, "Female", "99B Nui Thanh", "0788-595-450");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone());

    }
}
