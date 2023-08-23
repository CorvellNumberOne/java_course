
package Lesson_27_28;

import java.io.*;
// Пример с вложенными блоками 
public class Test11 {
    FileInputStream fis1, fis2;
    public void abc (){
        try {
            fis1 = new FileInputStream("test9.txt");
            try{
//              Данного файла нет, будет вылазить nullpointerExcept
//              Работает как задуманно
                fis2 = new FileInputStream("test10.txt");
            }
            catch(FileNotFoundException f){
                System.out.println("file test10 not found");
            }
        }
        catch(FileNotFoundException f){
            System.out.println("file test9 not found");
        }
        finally {
            System.out.println("it`s outer finnaly block");
            try{
                fis1.close();
                fis2.close();
            }
            catch(IOException i){
                System.out.println("Find an exception in finally block");
            }
        }
        
    }
    public static void main(String[] args) {
            Test11 t = new Test11();
            t.abc();
    }

}
