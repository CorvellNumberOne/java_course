package Lesson_23;

public class A10 {
    
    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
    }

    String s1 = "Privet";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("Static method");
    }
}


class B10 extends A10 {
    String s2 = super.s1 + ", drug";
    boolean s1 = true;
    
    int summa(int... i) {
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        return result;
    }
}