
package Lesson_27_28;

import java.io.*;

//try/catch/finally
public class Test4 {
    
    void abc() throws FileNotFoundException{
        File f = new File("test9.txt");

        
        try {
////          Данное выражение может выбрасывать exception
            FileInputStream fis =  new FileInputStream(f);
//            fis.read();
            System.out.println("Vsem horoshego dnya!");
        }
        
        catch(FileNotFoundException e) {
            System.out.println("Byl poiman exception:   "+e);
        }
        

    }
    
    void def(){
        System.out.println("Hello!");
//      Всегда нужно обрабатывать исключения при вызове метода внутри другого 
//      метода, если они не были обработаны. 

        try{
            abc();
        }
        catch(FileNotFoundException e) {
            System.out.println("Byl poiman exception:   "+e);
        }

    }
    
    public static void main(String[] args) throws FileNotFoundException{
        int [] array = {4,8,1};
//        System.out.println("U nas est massiv");
        System.out.println(array[8]);
        File f = new File("test9.txt");
//        try {
////          Данное выражение может выбрасывать exception
//            FileInputStream fis =  new FileInputStream(f);
//            fis.read();
//            System.out.println("Vsem horoshego dnya!");
//        }
//        
//        catch(FileNotFoundException e) {
//            System.out.println("Byl poiman exception:   "+e);
//        }
//        
//        catch(IOException e) {
//            System.out.println("Byl poiman exception:   "+e);
//        }
//        
//        finally{
//            System.out.println("Eto finally block");
//        }
        
        System.out.println("Rabotaem dalshe");
        

    }
}
