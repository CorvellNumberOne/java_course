
package Lesson_27_28;

import java.io.*;

public class Test3 {
//  абстрактная репрезентация пути к файлу
    public static void main(String[] args) throws Exception {
//      файл лежит в папке videocourse
        File f = new File("test9.txt");
//      
        FileInputStream fis  = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream(f);
        fis.read();
        fos.write(100);
        
        
    }
}
