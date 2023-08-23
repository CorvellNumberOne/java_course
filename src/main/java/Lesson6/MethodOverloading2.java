
package Lesson6;


class MethodOverloading2Test {
    
    
    int sum(int i1, int i2){
        return i1+i2;
    }
    
    String sum(String s1, String s2){
        return s1+s2;
    }
    
    
//  Медод sum с двумя int уже создан!!!
//  наличие Модификатора доступа не позволяет стать overloaded
//  (Данный метод мы нигде не используем)
    protected void sum (int a, String b) {
        System.out.println("Privet");
    }
} 


public class MethodOverloading2{
    public static void main(String[] args){
    
        MethodOverloading2Test mO2 = new MethodOverloading2Test();
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("Привет!", " Как дела!");
        System.out.println(s);
    }    
}
