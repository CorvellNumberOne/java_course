
package Lesson_27_28;

import java.io.*;

public class Test8 {
    static StringBuilder abc(){
        StringBuilder a = new StringBuilder("Privet");
        
        try{
            File f = new File("test8.txt");
            System.out.println("object file is creates");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Exception popavs`");
            System.out.println("variable a in the catch block = " + a);
        }
        finally{
            a.append("!!!");
            System.out.println("its the finnaly");
                        System.out.println("variable a in the finally block = " + a);
        }
        return a;
    }
    public static void main(String[] args) {
        
        System.out.println(Test8.abc());
    }
}
