
package Lesson_27_28;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        
        try{
            File f = new File("test9.txt");
            System.out.println("object file is creates");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalsya");
            int counter = 0;
            while(true){
                counter++;
                result.append(fis.read() );
                System.out.println("Info is reading");
                if (counter == 3 ){
                    fis.close();
                }
            }
        }
        
        catch(FileNotFoundException fnfe){
            System.out.println("Exception 1");
        }
        
        catch(IOException fnfe){
            System.out.println("Exception 2");
        }
        
        finally{
            System.out.println("It`s a finally");
        }
        
        System.out.println(result);
        
    }
}
