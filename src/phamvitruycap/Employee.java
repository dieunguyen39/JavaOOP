package phamvitruycap;

public class Employee {
    String name;
    int age;
    String birthday;
    String address;

    public Employee(String name, int age, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public static void main(String[] args) {
//        //Khởi tạo đối tượng của class
//        Employee employee = new Employee();
//        System.out.println(employee.getName());

    }
