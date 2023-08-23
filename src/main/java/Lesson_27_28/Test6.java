
package Lesson_27_28;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try{
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException fnf){
            System.out.println("Poiman exception1: "+fnf);
        }
        catch (NullPointerException npe){
            System.out.println("Poiman exception2: "+npe);
        }
    }
}
