
package Lesson_15;


public class Test7 {
    
//  Цикл do while выполняется как минимум 1 раз
    public static void main(String[] args) {
        int money = 100;
        
        do {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            
            money-=10;
            System.out.println("Ваш счет: "+money);
        }
        while(money>50);
    }
}
