package Thread;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int n = in.nextInt();
            int[][] tasks = new int[n][2];
            for (int j = 0; j < n; j++) {
                tasks[j][0]=in.nextInt();
                tasks[j][1]=in.nextInt();
            }
            Arrays.sort(tasks,(a,b)->b[1]-a[1]);
            int currentTime=0;
            int totalTime=0;
            for(int[] task : tasks){
                currentTime+=task[0];
                totalTime=Math.max(totalTime,currentTime+task[1]);
            }
            System.out.println(totalTime);
        }
        in.close();
    }
}
