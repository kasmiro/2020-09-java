package day01;

import java.util.Scanner;

public class day01_2 {
    public static void main(String[] args) {
        char x,y;
        char a='a';
        System.out.println("请输入字母以转换");
        Scanner in = new Scanner(System.in);
        x=in.next().charAt(0);
        if(x-a>=0){
            y=(char)(x-32);
        }
        else{
            y=(char)(x+32);
        }
        System.out.println("转换后："+y);
    }
}
