
package Lesson_17;


public class SBequals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        
        
        System.out.println(sb1==sb2); // false, потому что это разные объекты
        
//      В классе StringBuilder метод equals в отличии от класса String не пере-
//      записан и сравнивает только адреса
        System.out.println(sb1.equals(sb2)); // Тоже false
    }
}
