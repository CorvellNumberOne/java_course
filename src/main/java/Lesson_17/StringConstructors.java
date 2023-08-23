
package Lesson_17;


public class StringConstructors {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hi");
        StringBuffer sb2 = new StringBuffer("bye");
        
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        
    }
}
