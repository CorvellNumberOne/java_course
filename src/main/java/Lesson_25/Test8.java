
package Lesson_25;

//Двусмысленный ввызов переменной
public class Test8 {
    public static void main(String[] args){
        Test1 t = new Test1();
        ( (interface1) t).abc();
//      если мы хотим вывести на экран переменную а из interface2
//      Тут то нам и пригождается casting
        System.out.println(((interface2)t).a);
        
        
    }
}

class Test1 implements interface1, interface2{
    public void abc() { System.out.println("OK"); }
}

interface interface1{
    int a = 5;
    void abc();
    }

interface interface2{
    int a = 10;
    void abc();
}