
package Lesson_23;


public class Test1 {
//  Мы всегда можем возвращать null
    String abc (){
        return null;
    }
    
    int abc2(){
    char c = 'H';
    return c;
    }
    
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc2();
        System.out.println(t.abc2());
    }
}
