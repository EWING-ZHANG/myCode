package Java;

public class Main {
    public static void main(String[] args) {
        //继承后通过子类的实力可以调用父类的非private方法 protected也可以通过继承调用方法的
        Manager manager = new Manager();
        manager.getPay(11);
        //方法或者属性是public可以直接通过实例调用 如果是private则不行 不能能改他 能get set方法（如果写了
        System.out.println(manager.getBonus());
        //get set

    }
}
class Manager extends Employee{
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
