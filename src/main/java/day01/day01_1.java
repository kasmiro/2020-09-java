package day01;

import java.util.Scanner;

public class day01_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a=");
        int a=in.nextInt();
        System.out.println("b=");
        int b=in.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("变量交换后a="+a+" b="+b);
    }
}
