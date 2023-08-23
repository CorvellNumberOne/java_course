package Lesson_22;

import Lesson_22.Human2;

public class Human3 extends Human2{
    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Valera");
        System.out.println(s.getName());
        s.work();
        s.rest();
    }
}
