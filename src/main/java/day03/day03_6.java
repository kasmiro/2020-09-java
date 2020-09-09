package day03;

import java.util.Scanner;

public class day03_6 {
    public static void main(String[] args) {
        System.out.println("请输入一段字符串：");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int letter = 0;
        int number = 0;
        int other = 0;
        for(int i = 0;i < str.length();i++) {
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                letter++;
            }
            else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                number++;
            }
            else {
                other++;
            }
        }
        System.out.println("字母个数："+letter);
        System.out.println("数字个数："+number);
        System.out.println("其他个数："+other);
    }
}
