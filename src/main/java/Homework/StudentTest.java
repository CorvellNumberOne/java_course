
package Homework;


class Student {     
    String name;
    String surname;
    int numberOfTicket;
    short yearOfStudy;
    double mathScore;
    double economyScore;
    double languageScore;
    

}

class SredOcenka {
//  Создаем метод для расчета СА оценки для класса Student
    double aRMethod (Student kuku){
    double sredneeArif = (kuku.economyScore+kuku.languageScore+kuku.mathScore)/3;
    System.out.println("Средняя оценка студента "+ kuku.name+" "+ kuku.surname +": " + sredneeArif);
    return sredneeArif;
    }
        
}

public class StudentTest {
    public static void main(String[] args) {
        
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
              
        Student1.name="Mike";
        Student1.surname="Tyson";
        Student1.numberOfTicket=001;
        Student1.yearOfStudy=1981;
        Student1.mathScore=6;
        Student1.economyScore=9;
        Student1.languageScore=8;
             
        Student2.name="Taylor";
        Student2.surname="Momsen";
        Student2.numberOfTicket=002;
        Student2.yearOfStudy=2007;
        Student2.mathScore=4;
        Student2.economyScore=2;
        Student2.languageScore=10;
               
        Student3.name="Brian";
        Student3.surname="May";
        Student3.numberOfTicket=003;
        Student3.yearOfStudy=1978;
        Student3.mathScore=10;
        Student3.economyScore=6;
        Student3.languageScore=12;
       

//      1. Создаем новый объект класса SredOcenka с именем sO 
//      2. В объекте sO вызываем метод расчета СА оценки
//      3. Но, так как объекты класса Student уже созданы и их Названия являются ссылками, 
//         то мы их можем использовать как аргументы для метода средняя оценка

        SredOcenka sO = new SredOcenka();
        sO.aRMethod(Student3);
        sO.aRMethod(Student2);
        sO.aRMethod(Student1);

    }
}

