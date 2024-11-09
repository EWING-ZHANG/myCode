package TTT;

import java.util.Arrays;

public class Coin {
    //对于所有的需要赋予初值
    //res[0]=0 res[83] 需要res[left] 这个最原始的一个值 (初始值来进行启动
    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        int amount = 6249;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] coins, int amount) {
        String s = "abc";
        s.substring(1,3);
        Arrays.sort(coins);
        int[] res = new int[amount + 1];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0]=0;
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int left = i - coins[j];
                if (left >= 0) {
                    if(res[left]==Integer.MAX_VALUE) continue;;
                    min = Math.min(min, res[left]);
                } else {
                    break;
                }
            }
            if(min==Integer.MAX_VALUE) continue;
            res[i] = min + 1;
        }
        return res[amount] ==Integer.MAX_VALUE ? -1 : res[amount];
    }
}
