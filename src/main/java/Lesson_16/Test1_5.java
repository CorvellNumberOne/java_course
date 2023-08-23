
package Lesson_16;


public class Test1_5 {
    public static void main(String[] args) {
        String s = "Privet:2";
        s+="Ok";
//      Тут происходит складывание null + ok
        System.out.println(s);
        
        boolean b = s.contains(":2");
        System.out.println(b);
    }
}
