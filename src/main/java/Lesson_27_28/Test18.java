
package Lesson_27_28;


public class Test18 {
    void abc(){
        System.out.println("abc method");
        throw new StackOverflowError();
    }
    void def(){
        try{
            abc();
            return;
        }
        finally{
            System.out.println("Eto finally block");
        }
    }
    public static void main(String[] args) {
        
        Test18 t  = new Test18();
        t.def();
    }
}
