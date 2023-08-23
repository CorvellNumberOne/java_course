
package Homework.Lesson_17;


public class Test1 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean t;
        if (sb1.substring(0,sb1.length()).equals(sb2.substring(0, sb2.length()))){
            t=true;
            System.out.println(t);
            System.out.println(sb1.subSequence(0, 5));
            return t;
            
        }
        else
            t=false;
            System.out.println(t);
            return t;
            
    }
    
    public static void main(String[] args) {
        StringBuilder sb10 = new StringBuilder("hello world");
        StringBuilder sb20 = new StringBuilder("hello world");
        
        ravenstvo(sb10,sb20);
        
        System.out.println(sb10.substring(0, sb10.length()));
        
    }
}
