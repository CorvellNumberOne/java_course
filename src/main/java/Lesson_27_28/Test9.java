
package Lesson_27_28;

import java.io.*;

public class Test9 {
    void abc() throws FileNotFoundException{
        
        try{
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Exception popavs` i nemnogo obrabotan");
//          Если мы пишем throw нужно в сигнатуре указать, что возможен exception
            throw fnfe;
        }
        finally{
            System.out.println("its the finnaly");
        }
    }
    
    void method() throws FileNotFoundException{
//      Либо заключить метод в try/catch
        try{
           abc(); 
        }
        catch(FileNotFoundException fnfe){
            System.out.println("Exception popavs` i polnost`u obrabotan");
        }
        
    }
    
    void def(){
        
        try{
            int [] array = {1,2,3};
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Exception popavs` i nemnogo obrabotan");
//          Если мы пишем throw нужно в сигнатуре указать, что возможен exception
            throw a;
        }
        finally{
            System.out.println("its the finnaly");
        }
    }

    public static void main(String[] args) {
        
    }
}
