package day03;
import java.io.*;
import java.util.Calendar;
import java.util.Scanner;

public class day03_1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.MONTH,in.nextInt());
        cal.set(Calendar.DATE,in.nextInt());
        cal.set(Calendar.YEAR,in.nextInt());
        System.out.println(cal.getTime());
        File f=new File("data.txt");
        f.deleteOnExit();
        f.createNewFile();
        BufferedWriter bf = new BufferedWriter(new FileWriter(f));
        bf.write(cal.toString());
        bf.flush();
        bf.close();
        System.out.println(cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DATE)+"日");
    }
}
