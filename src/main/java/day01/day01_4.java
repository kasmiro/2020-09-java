package day01;

import java.util.Scanner;

public class day01_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ope;
        char ch ;
        do {

            System.out.println("=====================欢迎来到xx管理系统======================");
            System.out.println("1、增加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、根据学号查询学生");
            System.out.println("5、查询所有学生");
            System.out.println("========================================================");
            System.out.println("请选择功能");
            ope = input.nextInt();
            switch (ope) {
                case 1:System.out.println("正在增加...");break;
                case 2:System.out.println("正在删除...");break;
                case 3:System.out.println("正在修改...");break;
                case 4:System.out.println("正在按学号查询...");break;
                case 5:System.out.println("正在查询所有...");break;
                default:System.out.println("输入有误");break;
            }
            System.out.println("是否继续?(Y/N)");
            ch=input.next().charAt(0);

        }while(ch=='Y' || ch=='y');

    }
}
