package tinhkethua;

public class Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Gender:" + this.gender);
        System.out.println("Address:" + this.address);
        System.out.println("Phone Number:" + this.phone);
    }
}
