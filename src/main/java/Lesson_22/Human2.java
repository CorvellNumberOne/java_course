package Lesson_22;

public class Human2 {

//    public Human2(String n) {
//        name = n;
//    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    private String name;
    public static int salary = 100;

    public void work() {
        System.out.println("Work");
    }

    public static void rest() {
        System.out.println("Rest");
    }
    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Stepan");
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
        
    }
}

class Student extends Human2 {

}