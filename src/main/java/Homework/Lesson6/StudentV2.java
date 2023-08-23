
package Homework.Lesson6;


public class StudentV2 {
    public static void main(String[] args) {
        

        Student newStudent1 = new Student ("Igor", "Ivanov", 01, 1, 2012, 5.5, 6.3, 5.2);
        Student newStudent2 = new Student ("Юрек", "Довбойоб", 02, 2);
        Student newStudent3 = new Student ();
        
        System.out.println(newStudent2.surname);
    }
    
}

class Student {

//  Данный конструктор будет принимать все значения.
    Student (String name2, String surname2, int numberOfTicket2, int course2, int yearOfStudy2, double mathScore2, double economyScore2, double languageScore2){
        name=name2;
        surname=surname2;
        numberOfTicket=numberOfTicket2;
        cousre=course2;
        yearOfStudy=yearOfStudy2;
        mathScore=mathScore2;
        economyScore=economyScore2;
        languageScore=languageScore2;
    }
    
    Student (String name2, String surname2, int numberOfTicket2, int course2){
        this(name2, surname2, numberOfTicket2, course2, 0, 0.0, 0.0, 0.0);
    }
    
    Student (){
        this(null, null, 0, 0, 0, 0.0, 0.0, 0.0);
    }
        
    String name;
    String surname;
    int numberOfTicket;
    int cousre;
    int yearOfStudy;
    double mathScore;
    double economyScore;
    double languageScore;
}