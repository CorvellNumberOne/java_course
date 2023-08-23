
package Lesson_26;


public class Test5 {
    {
        System.out.println("Это init block 2");
    }
    Test5(){
        System.out.println("Это конструктор 1");
    }
    
    Test5(int a){
        this();
        System.out.println("Это конструктор 2");
    }
    
    static {
        System.out.println("Это init block static");
    }
    {
        System.out.println("Это init block");
    }
    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }
}
