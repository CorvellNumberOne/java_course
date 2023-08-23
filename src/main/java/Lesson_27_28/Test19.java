
package Lesson_27_28;

import java.io.*;

public class Test19 {
    public static void main(String[] args) {
//        Animal2 m = new Mouse();
//        -------------------------------------------
//        try{
//           m.run(); 
//        }
//        catch(IOException i){
//            System.out.println("Exception poiman");
//        }
//        --------------------------------------------
        
        try{
            Human h = new Human("Hello", -10);
            System.out.println(h.name);
        }
        catch (Exception e){
            System.out.println("Пезда");
        }

    }
}

class Animal2{
    Animal2 ()throws FileNotFoundException{
        
    }
    
//    -----------------------------------------
//    void run() throws IOException{
//        System.out.println("Animals runs");
//    }
}

class Mouse extends Animal2{
    Mouse() throws FileNotFoundException {
        super();
    }
//    -----------------------------------------
//    void run(){
//        System.out.println("Mouse runs");
//    }
}

class Human{
    String name;
    int age;
    Human(String name, int age)throws Exception{
        if (age < 0 ){
            throw new Exception("Nekorrektnyui vozrast");
        }
            this.name = name;
            this.age = age;
     }
}