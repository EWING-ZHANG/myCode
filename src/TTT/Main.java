package TTT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String l = in.nextLine();
        int res = find(s, l);
        System.out.println(res);
        in.close();
    }

    private static int find(String s, String l) {
        if (s.length() == 0 || l.length() == 0 || s.length() > l.length()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int pos = -1;
        while (i < s.length() && j < l.length()) {
            if (s.charAt(i) == l.charAt(j)) {
                pos = j;
                i++;
            }
            j++;
        }
        return i == s.length() ? pos : -1;
    }
}
