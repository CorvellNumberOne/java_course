package Lesson8;

class StudentTest {

    String name;
    int course;

//  Создаем переменную которая будет считать студентов. Данна перменная
//  пренадлежить ТОЛЬКО классу StudentTest, но редактировать ее могут
//  экземпляры данного класса!
    static int count;
    int a;

    public StudentTest(String name1, int course1) {
//      При создании студента переменной count будет присваиваться значение
//      с номером студента. Номер будет увеличиватся на 1 при каждом создании
//      нового єкземпляра класса Student
        count++;
        name = name1;
        course = course1;
        System.out.println("Студент №:" + count + " создан");
    }

//  Данный метод является static и принадлежит классу StudentTest. 
//  Для его вызова не нужно вызывать конструктори создавать новый экземпляр.
    public static void showCount() {
        System.out.println("Всего студентов создано: " + StudentTest.count);
    }

    public void showInfo() {
        System.out.println("Welcome to the StudentTest class");
    }

    void abc() {
        a++;
        count++;
        System.out.println(a);
    }

//  В статичном методе нельзя вызывать переменные не static,
//  так для них нужно создавать єкземпляр класса.
    static void abcd() {
        count++;
        StudentTest st1 = new StudentTest("Egor",35);
        st1.a++;

    }
}

public class Student2 {

    public static void main(String[] args) {
        StudentTest st2=new StudentTest("igor", 3);
        st2.abcd();
        
    }
}
