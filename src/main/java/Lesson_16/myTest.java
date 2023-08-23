
package Lesson_16;


public class myTest {
    String s1 = "Hello";
    String s2 = "Hello";
    
    String s3 = new String ("Hello");
    
    public static void main(String[] args) {
        myTest t1 = new myTest();
        System.out.println(t1.s1==t1.s2);
        System.out.println(t1.s2==t1.s3);
    }
}
