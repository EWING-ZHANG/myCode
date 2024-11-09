package Test;

public class Outer {
    private  static int a = 10;
    public  class Inner{
        int b=1;
        public  void test(){
            System.out.println("reach the inner:"+a);
        }
    }

    public static void main(String[] args) {
        Outer O = new Outer();
        Inner inner = O.new Inner();//
        inner.test();

    }
    public void func(){
        int aa = a;
        System.out.println(a);
    }
}
