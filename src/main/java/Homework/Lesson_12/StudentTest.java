
package Homework.Lesson_12;

import Lesson_11.Student;

public class StudentTest {

    
    
// Метод принимает в параметры студентов из импортируемого 

    public static void compare(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course==st2.course && st1.grade==st2.grade){
            System.out.println("Студенты равны");
        }
        else
            System.out.println("Студенты не равны");
    }
 
    
/*    
    public static void compare2 (Student st1, Student st2){
        
        if (st1.name.equals(st2.name)){
            System.out.println("Имена студентов одинаковы1");
        
            if (st1.name.equals(st2.name) && st1.course==st2.course){
                System.out.println("Курсы студентов совпадают1");
                
                if (st1.name.equals(st2.name) && st1.course==st2.course && st1.grade==st2.grade)
                    System.out.println("Оценки студентов совпадают1");
            }
            
            if (st1.name.equals(st2.name) && st1.grade==st2.grade)
            System.out.println("И оценки одинаковые1");
            
        }    
        
        else if (st1.course==st2.course){
            System.out.println("Курсы студентов совпадают2");
            
            if (st1.course==st2.course && st1.grade==st2.grade)
                System.out.println("Оценки студетов совпадают2");
        }
        
        else if (st1.grade==st2.grade){
            System.out.println("Оценки студентов совпадают3");
        }
        
        else
            System.out.println("Пока совпадений нет");
            
    }
*/    
    
    
    public static void compare2 (Student st1, Student st2){
        if(st1.name.equals(st2.name)) {
            if(st1.course==st2.course){
                if (st1.grade==st2.grade){
                    System.out.println("Имена студентов и курсы одинаковые");
                }
                else{
                    System.out.println("Имена студентов и курсы одинаковые, но оценки разные");
                }
            }   
            else
                System.out.println("Имена студентов одинаковые, но курсы разные");
        }
        
        else
            System.out.println("Имена студентов разные");
        
    
    }
    
    
    public static void main(String[] args) {
        Student st1 = new Student("Mike",4,12);
        Student st2 = new Student("Mike",4,11);
        
        compare2(st1,st2);
    }
}


