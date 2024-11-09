package Test;
public class TestClass {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void ceshi() {
                System.out.println(ceshi);
            }
        };
        a.ceshi();
        new B() {
            @Override
            public void ceshi() {
                System.out.println(ceshi);
            }
        }.ceshi();
        new C(){
            @Override
            void ceshi(){
                System.out.println("ceshiC");
            }
        }.ceshi();

    }

}
abstract class C {
    public String ceshi = "testc";

    abstract void ceshi();
}
