package BookManage;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class domain {
    private static BookManager manager;
    public static void do1(){
        String bookName;
        String bookClass;
        String writer;
        Date time=new Date();
        String content;
        Scanner in = new Scanner(System.in);
        System.out.println("书名：");
        bookName=in.nextLine();
        System.out.println("书籍分类：");
        bookClass=in.nextLine();
        System.out.println("作者：");
        writer=in.nextLine();
        System.out.println("内容简介：");
        content=in.nextLine();
        Book book= new Book(bookName,bookClass,writer,time,content);
        boolean result= manager.addBook(book);
        if(result){
            System.out.println("添加成功");
        }
    }
    public static void do2(){
        Scanner in = new Scanner(System.in);
        String bookName;
        System.out.println("书籍名称：");
        bookName=in.nextLine();
        boolean result=manager.delBook(bookName);
        if(result){
            System.out.println("删除成功");
        }
    }
    public static void do3(){
        Scanner in = new Scanner(System.in);
        String bookName;
        System.out.println("书籍名称：");
        bookName=in.nextLine();
        Book book=manager.findBook(bookName);
        if(book!=null){
            System.out.println("书籍信息："+book);
        }
    }
    public static void do4(){
        List<String> bookList=manager.findAllClasses();
        if(bookList!=null){
            System.out.println("现有所有分类：");
            for(String bookname:bookList){
                System.out.println(bookname);
            }
        }
    }
    public static void do5(){
        Scanner in = new Scanner(System.in);
        String className;
        System.out.println("书籍分类名称：");
        className=in.nextLine();
        List<Book> bookList=manager.findClassBooks(className);
        if(bookList!=null){
            for(Book book:bookList){
                System.out.println(book);
            }
        }
    }
    public static void do6(){
        Scanner in = new Scanner(System.in);
        String className;
        System.out.println("书籍分类名称：");
        className=in.nextLine();
        boolean result=manager.addBookClass(className);
        if(result){
            System.out.println("添加成功");
        }
    }
    public static void do7(){
        Scanner in = new Scanner(System.in);
        String className;
        System.out.println("书籍分类名称：");
        className=in.nextLine();
        boolean result=manager.delBookClass(className);
        if(result){
            System.out.println("删除成功");
        }
    }
    public static void save(){
        try
        {
            FileOutputStream fileOut =new FileOutputStream("D:/tmp/bookManager.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            Map<String, List<Book>> books = manager.getBooks();
            out.writeObject(books);
            out.close();
            fileOut.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try{
            manager=new BookManager("王小明");
            File file= new File("D:/tmp/bookManager.ser");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            manager.setBooks((Map<String, List<Book>>) objectInputStream.readObject());
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        } finally {
            System.out.println(manager);
            while(true){
                System.out.println("┌---------欢迎使用图书管理系统--------┐");
                System.out.println("|1.添加书籍                         |");
                System.out.println("|2.删除书籍                         |");
                System.out.println("|3.查找书籍                         |");
                System.out.println("|4.查看所有分类                      |");
                System.out.println("|5.查看指定分类所有书籍                |");
                System.out.println("|6.添加书籍分类                      |");
                System.out.println("|7.删除书籍分类                      |");
                System.out.println("|0.退出                             |");
                System.out.println("└----------请输入数字以使用-----------┘");
                Scanner in = new Scanner(System.in);
                int select=in.nextInt();
                if(select==0){
                    save();
                    break;
                }
                else{
                    switch (select){
                        case 1:{
                            do1();
                            save();
                            break;
                        }
                        case 2:{
                            do2();
                            save();
                            break;
                        }
                        case 3:{
                            do3();
                            save();
                            break;
                        }
                        case 4:{
                            do4();
                            save();
                            break;
                        }
                        case 5:{
                            do5();
                            save();
                            break;
                        }
                        case 6:{
                            do6();
                            save();
                            break;
                        }
                        case 7:{
                            do7();
                            save();
                            break;
                        }
                    }
                }
            }
        }

    }
}
