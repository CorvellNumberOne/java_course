
package Lesson_16;


public class Test1_6 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Uraaa!!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaa", "Урааа").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('o')));
    }
}
