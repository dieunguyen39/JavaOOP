package BaiTap2.company;

import BaiTap2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Dieu", 26, "Female", "99B Nui Thanh", "0788-355-720");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());

    }
}
