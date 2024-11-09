package leetcode.tree;

import java.util.HashMap;

public class Test3 {

//    private static final String X36 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String[] X36_ARRAY = "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z".split(",");

    public static void main(String[] args) {
        int iSrc = 80;
        String pSrc = ThirtySix2Decimal(iSrc);
        System.out.println(pSrc);

    }

    /**
     * 10进制转36进制
     */
    public static String  ThirtySix2Decimal(int iSrc){
        StringBuffer sBuffer = new StringBuffer();

        if(iSrc == 0) {
            sBuffer.append("0");
        }
        while(iSrc > 0) {
            sBuffer.append(X36_ARRAY[iSrc % 36]);
            iSrc = iSrc / 36;
        }
        return sBuffer.reverse().toString();

    }

   /* 36进制转10进制*/
//    public static int thirtysixToTen(String string) {
//
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        for (int i = 0; i < X36.length(); i++) {
//            map.put(X36.charAt(i), i);
//        }
//        int size = string.length();
//        int num = 0;
//        for(int i = 0; i<size; i++) {
//            String char2str = String.valueOf(string.charAt(i)).toUpperCase();
//            num = (int) (map.get(char2str.charAt(0)) * Math.pow(36, size - i - 1) + num);
//        }
//
//        return num;
//    }
}
