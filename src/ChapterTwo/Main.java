package ChapterTwo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
/*        setSecret("abzAZ23b");
        getSecret("BCAba23C");*/
//        numberSeq("21ab31");
//        once("asdfasdfo");
/*
        List<String> list = new ArrayList<>();
        list.add("e");
        list.remove("e");
*/
/*        countC("aaddccdc");
        String string = "abc";
        int index = string.lastIndexOf("a");
        System.out.println(index);*/
//        longestSet("abcdad","cdab");

/*
        System.out.println(getCap("2G9M1T"));
*/
/*        String str = "abc";
        str.replace("a","b");
        StringBuilder sb = new StringBuilder(str);
        String[] test = new String[]{"10M1G","1024M","1G"};
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:test){
            map.put(s,getCap(s));
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getKey());
        }*/
        String s1 = "1,3,5,3";
        String s2 = "3,3,5,43";
        String s3 = "4,2,5";
        List<String> arr1 = Arrays.asList(s1.split(","));
        List<String> arr2 = Arrays.asList(s2.split(","));
        List<String> arr3 = Arrays.asList(s3.split(","));
        List<List<String>> list = new ArrayList<>();
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        getArr(list);


    }

    public static void rand(String string) {
        List<List<String>> res = new ArrayList<>();
        String str = "";
        char[] s = string.toCharArray();
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            str = str + s[i];
        }
        System.out.println(str);

    }

    public static void mergeArray(String[] s1, String[] s2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            String s = s1[i];
            Integer number = Integer.parseInt(s);
            if (!set.contains(number)) {
                set.add(number);
            }
        }
        for (int i = 0; i < s2.length; i++) {
            String s = s2[i];
            Integer number = Integer.parseInt(s);
            if (!set.contains(number)) {
                set.add(number);
            }
        }
        List<Integer> list = new ArrayList<>();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            list.add((Integer) iter.next());
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

    public static void rank(String[] string, int b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length; i++) {
            list.add(Integer.parseInt(string[i]));
        }
        if (b == 0) {
            Collections.sort(list);
        } else {
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

    }

    public static void rankString(String string) {
        StringBuilder sb = new StringBuilder(string);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            //大写字母 或者小写字母
            char c = string.charAt(i);
            if ((c - 'a' >= 0 && c - 'z' <= 0) || (c - 'A' >= 0 && c - 'Z' <= 0)) {
                list.add(c);
            }
        }
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
            }
        });
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if ((c - 'a' >= 0 && c - 'z' <= 0) || (c - 'A' >= 0 && c - 'Z' <= 0)) {
                sb.replace(i, i + 1, "" + list.remove(0));
            }
        }
        System.out.println(sb);
    }

    public static void setSecret(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c - 'a' >= 0 && c - 'z' <= 0) {
                if (c == 'z') {
                    c = 'A';
                } else {
                    c++;
                    c = Character.toUpperCase(c);
                }
                sb.replace(i, i + 1, "" + c);

            } else if (c - 'A' >= 0 && c - 'Z' <= 0) {
                if (c == 'Z') {
                    c = 'a';
                } else {
                    c++;
                    c = Character.toLowerCase(c);
                }
                sb.replace(i, i + 1, "" + c);

            } else if (c - '0' >= 0 && c - '9' <= 0) {
                if (c == '9') {
                    c = '0';
                } else {
                    c++;
                }
                sb.replace(i, i + 1, "" + c);
            }

        }
        System.out.println(sb);
    }

    public static void getSecret(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c - 'a' >= 0 && c - 'z' <= 0) {
                if (c == 'a') {
                    c = 'Z';
                } else {
                    c--;
                    c = Character.toUpperCase(c);
                }
                sb.replace(i, i + 1, "" + c);

            } else if (c - 'A' >= 0 && c - 'Z' <= 0) {
                if (c == 'A') {
                    c = 'z';
                } else {
                    c--;
                    c = Character.toLowerCase(c);
                }
                sb.replace(i, i + 1, "" + c);

            } else if (c - '0' >= 0 && c - '9' <= 0) {
                if (c == '0') {
                    c = '9';
                } else {
                    c--;
                }
                sb.replace(i, i + 1, "" + c);
            }

        }
        System.out.println(sb);
    }

    public static void numberSeq(String string) {
        int index = 0;
        List<String> list = new ArrayList<>();
        while (index < string.length()) {
            char c = string.charAt(index);
            //if it's number get it in a


            if (c - '0' >= 0 && c - '9' <= 0) {
                String str = "";

                while (index < string.length() && string.charAt(index) - '0' >= 0 && string.charAt(index) - '9' <= 0) {
                    str += string.charAt(index);
                    index++;
                }
                list.add(str);
            }
            index++;
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        int n = list.get(0).length();
        for (String s : list) {
            if (s.length() == n) {
                System.out.print(s);

            }
        }
        System.out.print("," + n);
        System.out.println();
    }

    public static void once(String string) {
        List<String> res = new ArrayList<>();
        HashSet<String> passSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            String c = "" + string.charAt(i);
            if ((!res.contains(c)) && (!passSet.contains(c))) {
                res.add(c);
            } else if (res.contains(c)) {
                res.remove(c);
                passSet.add(c);
            }
        }
        if (res.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(res.get(0));
        }
    }

    public static void countC(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if (!o1.getValue().equals(o2.getValue())) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return o1.getKey() - o2.getKey();
                }

            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getKey());
        }

    }

    public static void longestSet(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String s = s1;
            s1 = s2;
            s2 = s;
        }
        String res = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    int index1 = i;
                    int index2 = j;
                    while (index1 < s1.length() && index2 < s2.length() && s1.charAt(index1) == s2.charAt(index2)) {
                        index1++;
                        index2++;
                    }
                    if (index1 - i > res.length()) {
                        res = s1.substring(i, index1);
                    }

                }
            }
        }
        System.out.println(res);

    }

    public static void checkSub(String s1, String s2) {

    }

    public static int getCap(String string) {
        int M = 0;
        int G = 0;
        int T = 0;

        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'M') {
                M += Integer.parseInt(string.substring(index, i));
                if (i + 1 < string.length()) {
                    index = i + 1;
                }
            } else if (string.charAt(i) == 'G') {
                G += Integer.parseInt(string.substring(index, i));
                if (i + 1 < string.length()) {
                    index = i + 1;
                }
            } else if (string.charAt(i) == 'T') {
                T += Integer.parseInt(string.substring(index, i));
                if (i + 1 < string.length()) {
                    index = i + 1;
                }
            }

        }
        return M + 1024 * G + 1024 * 1024 * T;
    }

    public static void getArr(List<List<String>> list) {
        int n = 0;
        int time = 3;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() > n) {
                n = list.get(i).size();
            }
        }
        System.out.println(n);
        ArrayList<String> res = new ArrayList<>();
        n = (int) Math.ceil(n * 1.0 / time);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < list.size(); j++) {
                List<String> l = new ArrayList<>(list.get(j));
                if (time * (i + 1) > l.size()) {
                    res.addAll(l.subList(time * i, l.size()));
                } else {
                    res.addAll(l.subList(time * i, time * (i + 1)));
                }
            }

        }
        for (int i = 0; i < res.size() - 1; i++) {
            System.out.print(res.get(i) + ",");
        }
        System.out.println(res.get(res.size() - 1));
    }

}
