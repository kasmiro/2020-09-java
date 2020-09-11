package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class day05_2 {
    public static void main(String[] args) {
        Student s1=new Student("001","零一");
        Student s2=new Student("002","零二");
        FileOutputStream fileOutputStream =null;
        FileInputStream fileInputStream=null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        try{
            fileOutputStream=new FileOutputStream("F:\\code\\idea\\src\\main\\java\\day05\\Student.txt");
            fileOutputStream.write(s1.toString().getBytes());
            fileOutputStream.write(s2.toString().getBytes());
            fileInputStream=new FileInputStream("F:\\code\\idea\\src\\main\\java\\day05\\Student.txt");
            byte b[] = new byte[1024];
            int a = 0;
            while (true) {
                a = fileInputStream.read(b);//读取文件
                if (a == -1) {
                    break;
                }
                System.out.print(new String(b,0,a));
            }
            fileOutputStream.flush();
            Date date = new Date();
            fileOutputStream=new FileOutputStream("F:\\code\\idea\\src\\main\\java\\day05\\"+formatter.format(date)+"_Student.txt");
            fileInputStream=new FileInputStream("F:\\code\\idea\\src\\main\\java\\day05\\Student.txt");
            b = new byte[1024];
            a = 0;
            while (true) {
                a = fileInputStream.read(b);//读取文件
                if (a == -1) {
                    break;
                }
                fileOutputStream.write(b, 0, a);//写入文件（数组中的数据,开始下角标,读取到的字节长度）
            }
            fileOutputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(fileOutputStream!=null){
                    fileOutputStream.close();
                }if(fileInputStream!=null){
                    fileInputStream.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Student{
    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
