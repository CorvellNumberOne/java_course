
package Lesson_14;


public class Test6 {
    public static void main(String[] args) {
        
//      Тут мы внутри цикла используем 2 условия, а так же break и continue
        for (int i=1; i<=100; i++){
            if (i==10){
                continue;
            }
            if (i % 55==0){
                break;
            }
            System.out.println(i);
        }
    }
    
}
