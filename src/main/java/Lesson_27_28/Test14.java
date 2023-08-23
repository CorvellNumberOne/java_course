
package Lesson_27_28;

import java.io.*;

public class Test14 {
    static FileInputStream fis1, fis2;
    public static void main(String[] args) {
        try{
            fis1 = new FileInputStream("test9.txt");
            System.out.println("File test9 is ok!");
            try{
                fis2.close();
            }
            catch(IOException e ){
                System.out.println("We have a problem with fis2 stream");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File test9 not found");
        }
        catch(NullPointerException e1){
            System.out.println("Null pointer Exception");
        }
    }
}
