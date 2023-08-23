
package Lesson_16;


public class Test1 {

    
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
    
        int a = s1.length();
        System.out.println("Кол-во символов в строке: "+a);
        
        char c = s1.charAt(3);
        System.out.println("3-й символ: " + c);
        
        int i1 = s1.indexOf('t');
        System.out.println("Индекс буквы t: " + i1);
        
//      Считает до первого совпадения. Первое совпадения буква v
        int i2 = s1.indexOf("vet");
        System.out.println(i2);

//      Находим нужній символ начиная с нужного индекса
        int i3 = s1.indexOf("a",7);
        System.out.println(i3);
        
//      Проверяет начинается ли String s1 с "abc", и возвращает true или false
        boolean b1=s1.startsWith("abc");
        System.out.println(b1);
        
        
//      Проверяет начинается ли String s1 "abc" начиная с 7 символа, 
//      и возвращает true или false
      
        boolean b2=s1.startsWith("abc", 7);
        System.out.println(b2);
        
//      Проверяет заканчивается ли String на "bcd" и возвращает true или false
        boolean b3 = s1.endsWith("bcd");
        System.out.println(b3);
        
    }
}
