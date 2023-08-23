
package Lesson_19;


public class Test2 {
    static void summa (String s, int ... a){
        
        int summa =0;
        
        for (int i = 0; i < a.length; i++) {
            // тут идет сложения значений массива начиная с 0 (0+10+20+30)
            summa +=a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        // Вместо varargs можно использовать массив, что по сути одно и тоже
        summa("Privet", new int[]{1,2,3});
    }
}
