
package Test;


public class NewClass {
    public static void main(String[] args) {
        new NewClass().f("Hello, world!");
    }
    
    void f(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.toLowerCase());
        }
    }
}


