package TTT;

public class TeatCode {
    public static void main(String[] args) {
        int[] array = {9,2,5,31,6};
        methodWeight(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    public static void methodWeight(int[] array){
        //字符串匹配
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]>array[j]){
                    int temp;
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

    }
}
