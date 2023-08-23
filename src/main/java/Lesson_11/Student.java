package Lesson_11;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    
//  Данный метод будет менять студентов местами, но только внутри метода.
//  Если мы вызовем имена студентов вне данного метода, они будут прежними!
    public static void swap (Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
    
    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petr",5,9.5);
        Student st2 = new Student("Mihal",3,5.3);
//      Хуй в рот, а не изменение имен говорит java
//        swap(st1,st2);
//        System.out.println("Имя первого студента "+st1.name);
//        System.out.println("Имя второго студента "+st2.name);

        
        changeName(st2);
        System.out.println(st2.name);
        
    }
}
