package HuaWeiTest;

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String s = sc.nextLine();
        String[] arr = s.substring(1, s.length() - 1).split(",");
        int len = arr.length;
        int n = Integer.parseInt(sc.nextLine());
        if (n > len) {
            System.out.println("[]");
        } else {
            List<Integer> res1 = new ArrayList<>();
            List<Integer> res2 = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                int a = Integer.parseInt(arr[i]);
                if (a < 4) {
                    res1.add(a);
                } else {
                    res2.add(a);
                }
            }
            if (n == 8) {
                System.out.println("[0,1,2,3,4,5,6,7,8]");
            } else if (n == 4) {
                if (res1.size() == 0) System.out.println("[0,1,2,3]");
                if (res2.size() == 0) System.out.println("[4,5,6,7]");
                else System.out.println("[]");
            } else if (n == 2) {
                if (res1.size() == 2) {
                    int x = res1.get(0);
                    int y = res1.get(1);
                    int t1 = -1;
                    int t2 = -1;
                    int[] temp = new int[]{0, 1, 2, 3};
                    System.out.println("[");
                    for (int i : temp) {
                        if (i != x && i != y) {
                            if (t1 == -1) t1 = i;
                            else t2 = i;
                        }
                    }
                    System.out.println("[" + t1 + "," + t2 + "]");
                }
            }
        }
    }
}