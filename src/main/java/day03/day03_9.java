package day03;

import java.util.Scanner;

public class day03_9 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        System.out.println("逆序输出为："+sb.reverse());

    }
}
