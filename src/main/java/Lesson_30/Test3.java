
package Lesson_30;

import java.util.ArrayList;

//public class Test3 {
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        
//        Student st1 = new Student("Ivan",'M',22, 3,8.3);
//        Student st2 = new Student("Nikola",'M',28, 2,6.4);
//        Student st3 = new Student("Helen",'F',19, 1,8.9);
//        Student st4 = new Student("Petro",'M',35, 4,7);
//        Student st5 = new Student("Mary",'F',23, 3,9.1);
//        
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        
//        StudentInfo si = new StudentInfo();
////      Лямбда выражение. Должен возвращать тип данных интерфейса
//        System.out.println("00----------------");
//        si.testStudents(list, (Student st)->{return st.avgGrade > 8.5;});
//        System.out.println("01----------------");
//        si.testStudents(list, (Student st)->{return st.avgGrade < 9;});
//        System.out.println("02----------------");
//        si.testStudents(list, (Student st)->{return st.age > 25;});
//        System.out.println("03----------------");
//        si.testStudents(list, (Student st)->{return st.avgGrade < 27;});
//        System.out.println("04----------------");
//        si.testStudents(list, (Student st)->{return st.sex =='M';});
//        System.out.println("05----------------");
//        si.testStudents(list, (Student st)->{return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'F';});
//        
//    }
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    
//    Student(String name, char sex, int age, int course, double avgGrade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo{
//    void printStudent(Student st){
//        System.out.println("Imya studenta: " + st.name+", pol: "+st.sex+", "
//                + "vozrast: "+st.age+", kurs: "+st.course+", srednyaja ocenka: "+st.avgGrade);
//    }
//    
//    void testStudents(ArrayList<Student> aL, StudentChecks sc){
//        for(Student s : aL){
//            if(sc.test(s))
//                printStudent(s);
//        }
//    }
//}
//
//interface StudentChecks{
////  Возвращает boolean
//    boolean test(Student s);
//}