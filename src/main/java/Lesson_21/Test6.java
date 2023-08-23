package Lesson_21;

public class Test6 {

    int abc() {
        return 5;
    }

    int abc2(int i) {
        if (i < 10) {
            return 5;
        } else {
            return 10;
        }
    }
    
    void abc3(int c){
        System.out.println("Hello");
        return;
    }

    public static void main(String[] args) {
        int a = new Test6().abc();
        new Test6().abc();
//      Не обязательно присваивать return type метода переменной для вывода на экран
        System.out.println(new Test6().abc());
    }
}
