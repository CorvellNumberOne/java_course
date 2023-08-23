package Lesson9;

public class Test {

    String color;
    int a = 10;
    String engine;
    static int count;

    Test(String color, String engine) {
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public static void main(String[] args) {
        Test t = new Test("Red", "V6");
        Test t1 = new Test("Red", "V6");
        
        int a = 15;
        
        System.out.println(t1.a);
        System.out.println(a);
        System.out.println(t.a +Test.count);
                
    }
}
