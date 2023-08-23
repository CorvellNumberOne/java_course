
package Lesson_16;


public class myTest2 {
    String color;
    String engine;
    
    myTest2 (String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    
    public myTest2 abc (String cvet){
        myTest2 m10 = new myTest2 (cvet, "V4");
        return m10;
    }
    
    public static void main(String[] args) {
       myTest2 m1 = new myTest2 ("red", "V6");
       myTest2 m2 = m1.abc("Yellow");
        System.out.println(m1.color);
        System.out.println(m2.color);

       
    }
}
