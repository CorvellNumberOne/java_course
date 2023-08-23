
package Lesson6;


class MethodOverloadingTest {
    
//  Методы разные по названию
    
    void show(int i1){
        System.out.println("Data type is int");
        System.out.println(i1);
        
    }
    
    void show(boolean b1){
        System.out.println("Data type is boolean");
        System.out.println(b1);
        
    }
    
    void show(String s1){
        System.out.println("Data type is string");
        System.out.println(s1);
        
    }
    
//  Методы разные по порядку
    
    void show(String s, int a){
        System.out.println("String :" + s + "int :" + a);
    }
    
    void show(int a, String s){
        System.out.println("Какой хороший день");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloadingTest mO = new MethodOverloadingTest();
        int a=500;
//      В качестве аргумента можно использовать переменные соответствующего типа
        mO.show(a);
        
        boolean b = true;
        mO.show(b);
        
        String S = "Привет";
        mO.show(S);
        
        mO.show(10, "Привет!!!");
    }
}