package Lesson8;

class StudentTest {

    String name;
    int course;

//  Создаем переменную которая будет считать студентов. Данна перменная
//  пренадлежить ТОЛЬКО классу StudentTest, но редактировать ее могут
//  экземпляры данного класса!
    
    static int count;

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

}

public class Student {

    public static void main(String[] args) {
        StudentTest st1 = new StudentTest("Вася", 1);
        StudentTest st2 = new StudentTest("Семен", 2);
        StudentTest st3 = new StudentTest("Маша", 3);

//      В данном случае мы вызываем clacc переменную через object переменную.
//      Так делать не желательно.
//      System.out.println(st1.count);

        StudentTest.showCount();
    }
}
