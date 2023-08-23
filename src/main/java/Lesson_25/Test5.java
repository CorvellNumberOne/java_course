
package Lesson_25;


public class Test5 {
    public static void main(String[] args) {
        Test30 t = new Test30();
//      Таким образом мы можем вызвать переменную а из самого главного класса,
//      через любой дочерний класс
//      Кастинг будет работать только для переменных. Методы не работают
        System.out.println(((Test10)t).a);
    }
}


class Test10{
    int a = 5;
    void abc (){
        System.out.println("Ok1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc (){
        System.out.println("Ok2");
    }
}

class Test30 extends Test10{
        int a = 20;
    void abc (){
        super.abc();
        System.out.println("Ok3");
    }
}