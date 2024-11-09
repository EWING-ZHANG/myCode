package Test;


import java.util.*;

public class Main {
    static List<StringBuilder> res = new ArrayList<StringBuilder>();
    //    static StringBuilder sb = new StringBuilder();
//    static StringBuilder ss = new StringBuilder();
    static char[] choices = new char[2];

    public static void main(String[] args) throws InterruptedException {
        Main.bracket(3, 0, new StringBuilder());
        for (StringBuilder re : res) {
            System.out.println(re.toString());
        }



    }

    public static void paiting(String string) {
        String[] arr = string.split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr1 = new int[arr.length];
        while (checkZero(arr1)) {

        }


    }

    public static boolean checkZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /*    public static int hotPot(int[] arr){

        }
        public static void pailie(String string){

        }*/
    //最长递增子序列 最长非递增子序列呢
    public static void longestAsc(String string) {
        int[] dp = new int[string.length() + 1];
        Arrays.fill(dp, 1);
        dp[0] = 0;
        for (int i = 1; i < string.length() + 1; i++) {
            int help = 0;
            for (int j = 1; j < i; j++) {
                Integer preNum = Integer.parseInt(string.substring(j - 1, j));
                Integer curNum = Integer.parseInt(string.substring(i - 1, i));
                //比较后获取最大值呗
                if (curNum > preNum) help = Math.max(help, dp[j + 1] + 1);

            }
            dp[i] = help;
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);

    }

    //最长非递增子序列呢
    public static void longestSub(String string) {
        int[] dp = new int[string.length() + 1];
        Arrays.fill(dp, 1);
        dp[0] = 0;
        for (int i = 1; i < string.length() + 1; i++) {
            int help = 0;
            for (int j = i - 1; j >= 1; j--) {
                Integer preNum = Integer.parseInt(string.substring(j - 1, j));
                Integer curNum = Integer.parseInt(string.substring(i - 1, i));
                //比较后获取最大值呗
                if (curNum >= preNum) help = Math.max(help, dp[j + 1] + 1);

            }
            dp[i] = help;
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);

    }

    //最长重复子串 先给压缩
    public static void contract(String s) {

        int res = 0;
        int locat = 0;
        int[] mem = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int maxLen = 0;
            for (int j = i + 1; j < s.length() - 1; j++) {
                int len = j - i;
                for (int k = i + 1; k < s.length() - len; k++) {
                    String sub = s.substring(k, k + len);
                    if (s.substring(i, j).equals(sub)) {
                        maxLen = j - i + 1;
                    }
                }
            }
            mem[i] = maxLen;
        }
        for (int i = 0; i < mem.length; i++) {
            System.out.println(mem[i]);
        }

    }

    public static void bracket(int n, int k, StringBuilder sb) {
        //不剪枝
        if (k == 2 * n) {
            res.add(new StringBuilder(sb));
            return;
        }
        sb.append("(");
        bracket(n, k + 1, sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        bracket(n, k + 1, sb);
        sb.deleteCharAt(sb.length() - 1);

    }

    public static void testLamda(int a, int b) {
        //1.
        new Thread(new Runnable() {
            //new 一个对象 然后要重写的方法用{}在里面写出来
            @Override
            public void run() {
                System.out.println("this is a new thread and他的输入是一个runnable类并且重写run方法");
            }
        });
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();

        //2 迭代遍历
        List<String> features = Arrays.asList("ewing", "mike", "good");
        features.forEach(System.out::println);
        //3 collections.sort里面重写比较方法
        //实现这个接口的形参->抽象方法的处理
 /*     对象::实例方法
        类::静态方法
        类::实例方法*/

    }

    //三级分类
    public static void triCate() {
        List<Cate> cate = new ArrayList<>();
        cate.add(new Cate(1, 0, "衣服"));
        cate.add(new Cate(2, 0, "电器"));
        cate.add(new Cate(3, 0, "其他"));
        cate.add(new Cate(4, 1, "其他"));

    }


}

class Cate {
    int catId;
    int parent;
    String name;

    public Cate(int catId, int parent, String name) {
        this.catId = catId;
        this.parent = parent;
        this.name = name;
    }


}

class Node {
    int value;
    Node next = null;

    public Node(int valu, Node next) {
        this.value = value;
        this.next = next;
    }

}
