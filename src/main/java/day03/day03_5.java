package day03;

import jdk.nashorn.internal.ir.Node;

import java.util.ArrayList;

public class day03_5 {

}
class StudentException extends Exception{
    public static void main(String[] args) {
        System.out.println("此学生异常");
    }
}
class Student {
    String name;
    private static ArrayList<Student> studentsList= new ArrayList<Student>();
    private static ArrayList<Student> black=new ArrayList<Student>();
    static void add(Student student) throws StudentException {
        if(student.name.length()<5){
            throw new StudentException();
        }
        else if(studentsList.contains(student)){
            throw new StudentException();
        }
        else if(black.contains(student)){
            throw new StudentException();
        }
    }
}