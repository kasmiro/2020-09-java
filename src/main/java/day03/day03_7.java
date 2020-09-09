package day03;

import java.util.HashMap;
import java.util.Scanner;

public class day03_7 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
        }
        System.out.println(hm);
    }
}
