
package Lesson_15;


public class Test2 {
    public static void main(String[] args) {
        int money = 100;
        
        while(money>0){
            System.out.println("Ваш счет: "+money);
            System.out.println("Делайте ваши ставки");
            System.out.println("Вы проиграли!");
            
            money-=10;
            
        }
    }
    
}
