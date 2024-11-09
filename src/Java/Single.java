package Java;

public class Single {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        instance.getMessage();


    }
}
class SingleTon{
    private static SingleTon singleTon;

    private SingleTon() {
    }

    public static synchronized SingleTon getInstance(){
        if(singleTon==null){
            return new SingleTon();
        }else{
            return singleTon;
        }
    }
    public void getMessage(){
        System.out.println("hello");
    }
}
