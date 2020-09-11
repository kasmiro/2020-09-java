package day05;

import java.io.*;

public class day05_1 {
    public static void main(String[] args){
        File image=new File("D:\\images\\1\\book.png");
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream =null;
        try {
            fileInputStream = new FileInputStream(image);
            fileOutputStream = new FileOutputStream("D:\\images\\2\\book.png");
            byte b[] = new byte[1024];
            int a = 0;
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
        }finally {
            try {
                if (fileInputStream!=null) {
                    fileOutputStream.close();
                }
                if (fileOutputStream!=null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
