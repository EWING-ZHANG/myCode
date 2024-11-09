package Java;

public class Employee {
    private String name;
    private double salary;
    private String location;

    public Employee(String name, double salary, String location) {
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    public Employee() {
    }

    void getPay(int money){
        System.out.println("pay me money:"+money);
    }
}
