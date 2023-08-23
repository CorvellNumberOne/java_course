
package Lesson_27_28;

public class Test5 {
    static void abc(){
        System.out.println("Rabotaet method abc");
        abc();
    }
    public static void main(String[] args) {
        abc();
    }
}
