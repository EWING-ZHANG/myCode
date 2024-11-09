package TTT;

public class TestT {

    public static void main(String[] args) {
        //泛型的方法不需要指定说明参数 因为你就是直接传参进去的了 因为里面的参数都是需要穿进去的
//        System.out.println(saysport("ewing","ww"));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(new testSport().test(true,"ewing"));





    }


}
class testSport<T,V> {
    private T temp;
    private String name;

    public testSport() {
    }

    public testSport(T temp, String name) {
        this.temp = temp;
        this.name = name;
    }

    public T test(Boolean check, V v) {

        return temp;

    }

}
interface animal<T>{
    T test();
    T testAnimal();

}

class Duck implements animal<Integer>{

    @Override
    public Integer test() {
        return 0;
    }

    @Override
    public Integer testAnimal() {
        return 0;
    }
}
