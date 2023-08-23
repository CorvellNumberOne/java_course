
package Homework.Lesson7_1;


public class Test {
    public static void main(String[] args) {
//      Лучше полностью указывать адрес что бы не было неожиданных приколов.
        Homework.Lesson7.Employee HI = new Homework.Lesson7.Employee(7,"Pisun", 20, 200.30, "worker");
        HI.showSurname();
        HI.showId();
        HI.showSalary();
//      Тут мы не можем вызвать переменную экземпляра HI класса Employee,
//      потому что переменная не имеет модификатор public
        System.out.println(HI.age);
        
    }
}
