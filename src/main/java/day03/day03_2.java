package day03;

import java.util.Calendar;
import java.util.Scanner;

public class day03_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String id=in.next();
//        System.out.println(id.substring(6,10));
        int year=Integer.parseInt(id.substring(6,10));
        int month=Integer.parseInt(id.substring(10,12));
        int day=Integer.parseInt(id.substring(12,14));
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);
        System.out.println(cal.getTime());
    }
}
