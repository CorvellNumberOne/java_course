
package Lesson_18;


public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
//        String s = new String(array);
        
//        System.out.println(s);

        StringBuilder sb1 = new StringBuilder("Hello world");
//      Указываем с какого интдекса будем изменять, и сколько элементов добавим
        sb1.append(array,2,3);
        System.out.println(sb1);
        
        sb1.insert(2, array,1,3);
        System.out.println(sb1);
        
    }
}
