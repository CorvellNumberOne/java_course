
package Lesson_21;

public class Test5 {
    void abc (int i){
        System.out.println(i);
    }
    
    public static void main(String[] args) {
        
        Test5 t = new Test5();
//      В основе char лежит int, который определяет порядковый номер char 
        char a = 'a';
        t.abc(a);
        System.out.println('b'+10);
    }
}
