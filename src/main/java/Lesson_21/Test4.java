
package Lesson_21;


public class Test4 {
    public void abc(String s){
        System.out.println(s);
    }
    
    public void abc(Boolean b){
        System.out.println(b);
    }
    
    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}
