package day03;

import java.util.Scanner;

public class day03_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b=in.next();
        char[] array = b.toCharArray();
        for(int i=0;i<array.length;i++){
            array[i]=(char)(array[i]^10);
            System.out.print(array[i]);
        }

    }
}